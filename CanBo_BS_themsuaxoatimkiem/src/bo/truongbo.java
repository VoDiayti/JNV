package bo;

import java.util.ArrayList;

import bean.SinhVien;
import bean.nguoibean;
import dao.truongdao;

public class truongbo {
	truongdao tr=new truongdao();
	ArrayList<nguoibean> ds = null;
	public ArrayList<nguoibean> getds() throws Exception{
		return tr.getds();
		//doc du lieu tu file nap vao trong doi tuong
	}
	public ArrayList<nguoibean> getdsvaotruongbo(){ //tra ve ds cac nguoi duoc luu trong truongbo
		
		return ds;
	}
	public void Them(String masv,String hoten,String tenlop,int tuoi) throws Exception{
		SinhVien sv=new SinhVien(masv,tuoi, hoten, tenlop);//ham tao
		ds.add(sv);
	}
	
	public boolean Xoa(String masv) {
		for(nguoibean i: ds) {
			if(i instanceof SinhVien) {
				SinhVien sv=(SinhVien)i;
				if(sv.getMasv().equals(masv)) {
					ds.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	public void Sua(String masv,String hoten,String tenlop,int tuoi) {
		for( nguoibean i:ds) {
			if(i instanceof SinhVien) {
				SinhVien sv1=(SinhVien)i;
				if(sv1.getMasv().equals(masv)) {
					sv1.setHoten(hoten);
					sv1.setTenlop(tenlop);
					sv1.setTuoi(tuoi);
					break;
				}
			}
		}
	}
	
	public SinhVien TimKiem(String masv) {
		for(nguoibean i:ds) {
			if(i instanceof SinhVien) {
				SinhVien sv=(SinhVien)i;
				if(sv.getMasv().equals(masv)) {
					return sv;
				}
			}
		}
		return null;
	}
	
}
