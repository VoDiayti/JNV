package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.UngVienBean;

public class UngVienDao {
	public ArrayList<UngVienBean> getds() throws Exception{
		File f= new File("input.txt");
		FileReader fr= new FileReader(f);
		BufferedReader bfr= new BufferedReader(fr);
		ArrayList<UngVienBean> kq= new ArrayList<UngVienBean>();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		while(true) {
			String st= bfr.readLine();
			if(st==""||st==null) break;
			String[] ds= st.split("[;]");
			UngVienBean uvb=new UngVienBean();
			uvb.setLoaiungvien(Integer.parseInt(ds[0]));
			uvb.setHoten(ds[1]);
			uvb.setNgaysinh(ds[2]);
			uvb.setSdt(ds[3]);
			uvb.setEmail(ds[4]);
			uvb.setNamkinhnghiem(ds[5]);
			uvb.setKynang(ds[6]);
			uvb.setNam(ds[7]);
			kq.add(uvb);
		}
		bfr.close();
		return kq;
	}
	public void ThemLoaiUngVien(Integer loaiUv, String tenLoaiUV) throws Exception{
		String sql = "INSERT INTO LoaiUngVien(LoaiUngVien,TenLoaiUngVien) VALUES(?,?)";
		PreparedStatement cmd = DungChung.cn.prepareStatement(sql);
		cmd.setInt(1, loaiUv);
		cmd.setString(2, tenLoaiUV);
		cmd.executeUpdate();
		cmd.close();
	}
	public void ThemUngVien(Integer loaiUV, String Hoten,String NgaySinh,String SoDienThoai,String Email,String SoNamKinhNghiem,String KyNangCM,String NamTotNghiep) throws Exception {
		String Query ="INSERT INTO dbo.UngVien( LoaiUngVien , HoTen ,NgaySinh ,SoDienThoai ,Email ,SoNamKinhNghiem ,KyNangChuyenMon ,NamTotNghiep)VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement cmd = DungChung.cn.prepareStatement(Query);
		cmd.setInt(1, loaiUV);
		cmd.setString(2,Hoten);
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date day = f.parse(NgaySinh);
		cmd.setDate(3, new java.sql.Date(day.getTime()));
		cmd.setString(4, SoDienThoai);
		cmd.setString(5, Email);
		cmd.setString(6,SoNamKinhNghiem);
		cmd.setString(7,KyNangCM);
		cmd.setString(8,NamTotNghiep);
		cmd.executeUpdate();
		cmd.close();
	}
	public Boolean Ktra(Integer LoaiUV) throws Exception {
		String query = "SELECT * FROM dbo.LoaiUngVien WHERE LoaiUngVien = ?";
		PreparedStatement cmd = DungChung.cn.prepareStatement(query);
		cmd.setInt(1, LoaiUV);
		ResultSet rs = cmd.executeQuery();
		Boolean kq = rs.next();
		rs.close();
		return kq;
	}
	public void AddDatabase(ArrayList<UngVienBean> ds) throws Exception{
		for(UngVienBean uv : ds) {
			Integer luv = uv.getLoaiungvien();
			if(luv==1 && Ktra(luv)==false)
				ThemLoaiUngVien(luv,"Ung vien co kinh nghiem");
			if(luv==2&&Ktra(luv)==false)
				ThemLoaiUngVien(luv, "Ung vien moi tot nghiep dai hoc hoac cao dang");
			if(luv==3&&Ktra(luv)==false)
				ThemLoaiUngVien(luv,"Sinh vien thuc tap");
			ThemUngVien(uv.getLoaiungvien(),uv.getHoten(),uv.getNgaysinh(),uv.getSdt(),uv.getEmail(),uv.getNamkinhnghiem(),uv.getKynang(),uv.getNam());
		}
	}
}
