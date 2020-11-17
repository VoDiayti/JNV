package dao;

import java.util.ArrayList;

import bean.NhanVien;
import bean.SinhVien;
import bean.nguoibean;

public class truongdao {
	public ArrayList<nguoibean> getds() throws Exception{
		ArrayList<nguoibean> ds=new ArrayList<nguoibean>();
		NhanVien nv=new NhanVien("Huyen",22,"NV1",5.0,"DHKH");
		ds.add(nv);
		nv=new NhanVien("Hung",20,"NV2",5.0,"DHKH");
		ds.add(nv);
		SinhVien sv= new SinhVien("Nha Huyen",22,"SV1","Cong Nghe thong tin");
		ds.add(sv);
		sv= new SinhVien("Huynh",20,"SV2","Cong Nghe thong tin");
		ds.add(sv);
		sv= new SinhVien("Kim",20,"SV3","Dien Tu Vien Thong");
		ds.add(sv);
		sv= new SinhVien("Thuy Vi Huynh",20,"SV4","Bao Chi");
		ds.add(sv);
		sv= new SinhVien("Kim Ngoc",21,"SV3","He thong thong tin");
		ds.add(sv);
		return ds;
	}
}
