package view;

import bean.NhanVien;
import bean.SinhVien;
import bean.nguoibean;
import bo.truongbo;

public class truongview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cach dung
		/*nguoibean n1=new nguoibean("hihi",15);
		n1.HienThi();
		
		//Cach get va set
		nguoibean n2=new nguoibean();
		n2.setHoten("Nha Huyen");
		n2.setTuoi(22);
		n2.HienThi();*/
		
		/*NhanVien n3=new NhanVien("Huyen",22,"NV1",5.0,"DHKH");
		n3.HienThi();
		
		NhanVien n4=new NhanVien();
		n4.setHoten("Huynh Ho");
		n4.setTuoi(18);
		n4.setHsl(2.8);
		n4.setManv("NV01");
		n4.setTendonvi("Dai Hoc Khoa Hoc");
		n4.HienThi();
		
		SinhVien n5=new SinhVien("Nha Huyen",22,"SV1","Cong Nghe thong tin");
		n5.HienThi();*/
		
		try { //instanceof kiem tra 1 doi tuong thuoc lop nao
			truongbo t=new truongbo();
			for(nguoibean n: t.getds()) {
				if(n instanceof NhanVien) {
					NhanVien nv=(NhanVien)n;
					nv.HienThi();
				}	
			}
			for(nguoibean n: t.getds()) {
				if(n instanceof SinhVien) {
					SinhVien sv=(SinhVien)n;
					sv.HienThi();
				}	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
