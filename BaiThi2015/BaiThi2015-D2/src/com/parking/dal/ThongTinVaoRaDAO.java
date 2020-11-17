package com.parking.dal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.parking.entity.ThongTinVaoRa;
import com.parking.entity.ThongTinVaoRa_XeDap;
import com.parking.entity.ThongTinVaoRa_XeHoi;
import com.parking.entity.ThongTinVaoRa_XeMay;

public class ThongTinVaoRaDAO extends DataAccessObject {
	private static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");

	public List<ThongTinVaoRa> layThongTinVaoRa_XeDap() {
		List<ThongTinVaoRa> lst = new ArrayList<ThongTinVaoRa>();

		Connection cnn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			// Kết nối CSDL
			cnn = getConnection();

			// Truy vấn
			String sql = "SELECT vr.ThongTinVaoRa_ID, vr.ThoiDiemVao, xd.SoVe FROM ThongTinVaoRa AS vr INNER JOIN ThongTinVaoRa_XeDap AS xd ON vr.ThongTinVaoRa_ID = xd.ThongTinVaoRa_ID";
			pstm = cnn.prepareStatement(sql);
			rs = pstm.executeQuery();

			// Khai thác dữ liệu đã truy vấn
			while (rs.next()) {
				// String thongTinVaoRaID = rs.getString("ThongTinVaoRa_ID");
				Date thoiDiemVao = rs.getTimestamp("ThoiDiemVao");
				String soVe = rs.getString("SoVe");

				ThongTinVaoRa tt = new ThongTinVaoRa_XeDap(thoiDiemVao, soVe);
				lst.add(tt);
			}
		} catch (Exception ex) {

		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			if (pstm != null)
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			if (cnn != null)
				try {
					cnn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return lst;
	}

	public List<ThongTinVaoRa> layThongTinVaoRa_XeMay(){
		List<ThongTinVaoRa> lst = new ArrayList<ThongTinVaoRa>();
		return lst;
	}
	
	public List<ThongTinVaoRa> layThongTinVaoRa_XeHoi(){
		List<ThongTinVaoRa> lst = new ArrayList<ThongTinVaoRa>();
		return lst;
	}
	
	public List<ThongTinVaoRa> layThongTinVaoRa(){
		List<ThongTinVaoRa> lst = new ArrayList<ThongTinVaoRa>();
		lst.addAll(layThongTinVaoRa_XeDap());
		lst.addAll(layThongTinVaoRa_XeMay());
		lst.addAll(layThongTinVaoRa_XeHoi());
		return lst;
	}
	
	public static List<ThongTinVaoRa> docThongTinGuiXe(String filename) {
		List<ThongTinVaoRa> lst = new ArrayList<ThongTinVaoRa>();
		BufferedReader br = null;
		String line;
		ThongTinVaoRa tt = null;
		try {
			br = new BufferedReader(new FileReader(filename));
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] info = line.split(";");
				String stThoiDiemVao = info[3];
				Date thoiDiemVao = sdf.parse(stThoiDiemVao);
				if (info[0].equals("0")) {
					// Xe đạp
					String soVe = info[2];
					tt = new ThongTinVaoRa_XeDap(thoiDiemVao, soVe);
				} else if (info[0].equals("2")) {
					// Xe máy
					String bienSo = info[1];
					tt = new ThongTinVaoRa_XeMay(thoiDiemVao, bienSo);
				} else {
					// Ô tô
					String bienSo = info[1];
					String tinhTrangKhiVao = info[4];
					tt = new ThongTinVaoRa_XeHoi(thoiDiemVao, bienSo, tinhTrangKhiVao);
				}
				lst.add(tt);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lst;
	}

	public static void docThongTinLayXe(String filename, List<ThongTinVaoRa> lst) {
		BufferedReader br = null;
		String line;
		try {
			br = new BufferedReader(new FileReader(filename));

			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] info = line.split(";");
				String loaiXe = info[0];
				String stThoiDiemRa = info[3];
				Date thoiDiemRa = sdf.parse(stThoiDiemRa);
				if (loaiXe.equals("0")) {
					// Xe đạp
					String soVe = info[2];
					// Tìm thông tin gửi xe tương ứng và cập nhật thời điểm ra
					for (ThongTinVaoRa x : lst)
						if (x instanceof ThongTinVaoRa_XeDap) {
							ThongTinVaoRa_XeDap tt = (ThongTinVaoRa_XeDap) x;
							if (tt.getSoVe().equals(soVe)) {
								tt.setThoiDiemRa(thoiDiemRa);
								break;
							}
						}
				} else if (loaiXe.equals("2")) {
					// Xe máy
					String bienSo = info[1];
					for (ThongTinVaoRa x : lst)
						if (x instanceof ThongTinVaoRa_XeMay) {
							ThongTinVaoRa_XeMay tt = (ThongTinVaoRa_XeMay) x;
							if (tt.getBienSo().equals(bienSo)) {
								tt.setThoiDiemRa(thoiDiemRa);
								break;
							}
						}
				} else {
					// Xe ô tô
					String bienSo = info[1];
					String tinhTrangKhiRa = info[4];
					for (ThongTinVaoRa x : lst)
						if (x instanceof ThongTinVaoRa_XeHoi) {
							ThongTinVaoRa_XeHoi tt = (ThongTinVaoRa_XeHoi) x;
							if (tt.getBienSo().equals(bienSo)) {
								tt.setThoiDiemRa(thoiDiemRa);
								tt.setTinhTrangKhiRa(tinhTrangKhiRa);
								break;
							}
						}
				}
			}

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
