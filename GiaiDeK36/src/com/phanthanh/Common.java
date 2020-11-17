package com.phanthanh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.phanthanh.entity.Xe;
import com.phanthanh.entity.XeDap;
import com.phanthanh.entity.XeMay;
import com.phanthanh.entity.XeOto;
import com.phanthanh.ui.ThongKe;

public class Common {
	
	public static List<Xe> DocDuLieuXeVao(String filename){
		List<Xe> lst = new ArrayList<Xe>();
		//Đọc file dữ liệu vào
		BufferedReader br = null;
		try {
			//Loạt lệnh BufferedReader này phải đặt trong try cat
			br = new BufferedReader(new FileReader(filename));//Lệnh khởi tạo đọc file dữ liệu
			String line = br.readLine();
			while(line != null) {
				String[] infor = line.split(";");
				String loaiXe = infor[0];
				String bienSo = infor[1];
				String soVeXe = infor[2];
				String tinhTrang = infor[4];
				Timestamp TGVaoBai = null;
				TGVaoBai = getTimeFromString(infor[3]);
				
				if(loaiXe.equals("4")) {
					XeOto x = new XeOto();
					x.setBienSoXe(bienSo);
					x.setThoiGianVaoBai(TGVaoBai);
					x.setTinhTrangVaoBai(tinhTrang);
					lst.add(x);
				} else if(loaiXe.equals("2")) {
					XeMay x = new XeMay();
					x.setBienSoXe(bienSo);
					x.setThoiGianVaoBai(TGVaoBai);
					lst.add(x);
				} else if (loaiXe.equals("0")) {
					XeDap x = new XeDap();
					x.setSoVeXe(soVeXe);
					x.setThoiGianVaoBai(TGVaoBai);
					lst.add(x);
				}
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return lst;
	}
	
	public static List<Xe> DocDuLieuXeRa(String filename){
		List<Xe> lst = new ArrayList<Xe>();
		//Đọc file dữ liệu vào
		BufferedReader br = null;
		try {
			//Loạt lệnh BufferedReader này phải đặt trong try cat
			br = new BufferedReader(new FileReader(filename));//Lệnh khởi tạo đọc file dữ liệu
			String line = br.readLine();
			while(line != null) {
				String[] infor = line.split(";");
				String loaiXe = infor[0];
				String bienSo = infor[1];
				String soVeXe = infor[2];
				String tinhTrang = infor[4];
				Timestamp TGRaBai = null;
				TGRaBai = getTimeFromString(infor[3]);
				
				if(loaiXe.equals("4")) {
					XeOto x = new XeOto();
					x.setBienSoXe(bienSo);
					x.setThoiGianRaBai(TGRaBai);
					x.setTinhTrangRaBai(tinhTrang);
					lst.add(x);
				} else if(loaiXe.equals("2")) {
					XeMay x = new XeMay();
					x.setBienSoXe(bienSo);
					x.setThoiGianRaBai(TGRaBai);
					lst.add(x);
				} else if (loaiXe.equals("0")) {
					XeDap x = new XeDap();
					x.setSoVeXe(soVeXe);
					x.setThoiGianRaBai(TGRaBai);
					lst.add(x);
				}
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return lst;
	}
	
	public static void insertDataVao(String filename) {
		//Hàm chèn dữ liệu vào database
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(filename));
			String line = null;
			line = bf.readLine();
			while(line != null) {
				String[] infor = line.split(";");
				String loaixe = infor[0];
				String bienso = infor[1];
				String sovexe = infor[2];
				Timestamp tgvaobai = null;
				tgvaobai = getTimeFromString(infor[3]);
				String tinhtrangvao = infor[4];
				
				if(loaixe.equals("0")) {
					if(bienso.trim().equals("Not Available") && !sovexe.trim().equals("Not Available") && tinhtrangvao.trim().equals("Not Available")) {
						XeDap x = new XeDap();
						x.setSoVeXe(sovexe);
						x.setThoiGianVaoBai(tgvaobai);
						com.phanthanh.dao.XeDapDAO.insertDataXeDap(sovexe, tgvaobai);
					}
				} else if (loaixe.equals("2")) {
					if(!bienso.trim().equals("Not Available") && sovexe.trim().equals("Not Available") && tinhtrangvao.trim().equals("Not Available")) {
						XeMay x = new XeMay();
						x.setBienSoXe(bienso);
						x.setThoiGianVaoBai(tgvaobai);
						com.phanthanh.dao.XeMayDAO.insertDataXeMay(bienso, tgvaobai);
					}
				} else if (loaixe.equals("4")) {
					if(!bienso.trim().equals("Not Available") && sovexe.trim().equals("Not Available") && !tinhtrangvao.trim().equals("Not Available")) {
						XeOto x = new XeOto();
						x.setBienSoXe(bienso);
						x.setThoiGianVaoBai(tgvaobai);
						x.setTinhTrangVaoBai(tinhtrangvao);
						com.phanthanh.dao.XeOtoDAO.insertDataXeOto(bienso, tinhtrangvao, tgvaobai);
					}
				}
				
				line = bf.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bf != null)
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	public static void insertDataRa(String filename) {
		//Hàm chèn dữ liệu vào database
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(filename));
			String line = null;
			line = bf.readLine();
			while(line != null) {
				String[] infor = line.split(";");
				String loaixe = infor[0];
				String bienso = infor[1];
				String sovexe = infor[2];
				Timestamp tgrabai = null;
				tgrabai = getTimeFromString(infor[3]);
				String tinhtrangra = infor[4];
				
				if(loaixe.equals("0")) {
					if(bienso.trim().equals("Not Available") && !sovexe.trim().equals("Not Available") && tinhtrangra.trim().equals("Not Available")) {
						XeDap x = new XeDap();
						x.setSoVeXe(sovexe);
						x.setThoiGianVaoBai(tgrabai);
						com.phanthanh.dao.XeDapDAO.updateDataXeDap(sovexe, tgrabai);
					}
				} else if (loaixe.equals("2")) {
					if(!bienso.trim().equals("Not Available") && sovexe.trim().equals("Not Available") && tinhtrangra.trim().equals("Not Available")) {
						XeMay x = new XeMay();
						x.setBienSoXe(bienso);
						x.setThoiGianVaoBai(tgrabai);
						com.phanthanh.dao.XeMayDAO.updateDataXeMay(bienso, tgrabai);
					}
				} else if (loaixe.equals("4")) {
					if(!bienso.trim().equals("Not Available") && sovexe.trim().equals("Not Available") && !tinhtrangra.trim().equals("Not Available")) {
						XeOto x = new XeOto();
						x.setBienSoXe(bienso);
						x.setThoiGianVaoBai(tgrabai);
						x.setTinhTrangVaoBai(tinhtrangra);
						com.phanthanh.dao.XeOtoDAO.updateDataXeOto(bienso, tgrabai, tinhtrangra);
					}
				}
				
				line = bf.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bf != null)
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	//Ham doi dinh dang String sang Timestamp
	public static Timestamp getTimeFromString(String st) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm dd/MM/yyyy");
		java.util.Date date = sdf.parse(st);
		return new java.sql.Timestamp(date.getTime());
	}	
	
	public static List<Xe> XyLyDuLieuWinform(List<Xe> l1, List<Xe> l2) {
		for(Xe x : l2) {
			Timestamp vao = null;
			Xe tmp = null;
			int index = -1;
			int j = 0;
			for(Xe y : l1) {
				if(!y.getBienSoXe().equals("Not available") && y.getBienSoXe().equals(x.getBienSoXe())) {
					if(vao == null) {
						vao = y.getThoiGianVaoBai();
						index = j;
						if(y.getLoaiXe() == "0") {
							tmp = new XeDap();
							tmp = y;
						} else if (y.getLoaiXe() == "2") {
							tmp = new XeMay();
							tmp = y;
						} else if (y.getLoaiXe() == "4") {
							tmp = new XeOto();
							tmp = y;
						}
					} else if(vao.compareTo(y.getThoiGianVaoBai()) < 0) {
						vao = y.getThoiGianVaoBai();
						index = j;
						if(y.getLoaiXe() == "0") {
							tmp = new XeDap();
							tmp = y;
						} else if (y.getLoaiXe() == "2") {
							tmp = new XeMay();
							tmp = y;
						} else if (y.getLoaiXe() == "4") {
							tmp = new XeOto();
							tmp = y;
						}
					}
				}
				j++;
			}
			if(vao != null && index != -1 && tmp != null) {
				if(tmp.getLoaiXe().equals("0")) {
					XeDap ex = new XeDap();
					ex.setSoVeXe(tmp.getSoVeXe());
					ex.setThoiGianVaoBai(tmp.getThoiGianVaoBai());
					ex.setThoiGianRaBai(x.getThoiGianRaBai());
					l1.set(index, ex);
				} else if(tmp.getLoaiXe().equals("2")) {
					XeMay ex = new XeMay();
					ex.setBienSoXe(tmp.getBienSoXe());
					ex.setThoiGianVaoBai(tmp.getThoiGianVaoBai());
					ex.setThoiGianRaBai(x.getThoiGianRaBai());
					l1.set(index, ex);
				} else if(tmp.getLoaiXe().equals("4")) {
					XeOto ex = new XeOto();
					ex.setBienSoXe(tmp.getBienSoXe());
					ex.setThoiGianVaoBai(tmp.getThoiGianVaoBai());
					ex.setThoiGianRaBai(x.getThoiGianRaBai());
					ex.setTinhTrangVaoBai(tmp.getTinhTrangVaoBai());
					ex.setTinhTrangRaBai(x.getTinhTrangRaBai());
					l1.set(index, ex);
				}
			}
		}
		return l1;
	}
	
	public static void main(String[] arg0) {
		
		//Đọc dữ liệu xe vào/ra bãi đỗ xe
		List<Xe> lx = new ArrayList<>();
		lx = DocDuLieuXeVao("input1.txt");
		List<Xe> lx2 = new ArrayList<>();
		lx2 = DocDuLieuXeRa("input2.txt");
		
		//Cập nhật dữ liệu lên database tao csdl tren sqlserver truoc roi da mở comment để chạy
//		insertDataVao("input1.txt");
//		insertDataRa("input2.txt");

		//Truyền dữ liệu đến màn hình winform
		ThongKe frame = new ThongKe();
		frame.setLstDS(XyLyDuLieuWinform(lx, lx2));
		frame.setVisible(true);
	}
	
	
}
