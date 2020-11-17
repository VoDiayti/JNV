package bo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.UngVienBean;
import dao.UngVienDao;

public class UngVienBo {
	public UngVienDao uvd = new UngVienDao();
	public ArrayList<UngVienBean> dsuv;
	public ArrayList<UngVienBean> getds() throws Exception{
		
		dsuv= uvd.getds();
		return dsuv;
	}
	public Boolean ktns(String ngaysinh) {
		try {
		
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			Date ngay = sdf.parse(ngaysinh);
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean ktsdt(String sdt) throws Exception{
		if(sdt.length()>=7) return true;
		else return false;
	}
	
	public Boolean ktemail(String email) {
		int a = email.indexOf("@");
		int b = email.indexOf(".");
		if(email.indexOf("@",a+1)==-1&&email.indexOf(".",b+1)==-1)
			return true;
		return false;
	}
	
	public Boolean ktsnkn(String namkinhnghiem) throws Exception{
		Long sn;
		if(namkinhnghiem.equals("None"))
			return false;
		else {
			sn = Long.parseLong(namkinhnghiem);
		}
		if(sn>0&&sn<100)
			return true;
		else
			return false;
	}
	
	public String ktdulieuduthua(UngVienBean c) throws Exception{
		String st = null;
		if( c.getLoaiungvien() == 3) {
			if(c.getNamkinhnghiem().equals("None")==false||c.getKynang().equals("None")==false||c.getNam().equals("None")==false)
				st="Du thua du lieu";
		}
		if(c.getLoaiungvien()== 2) {
			if(c.getNamkinhnghiem().equals("None")==false||c.getKynang().equals("None")==false)
				st="Du thua du lieu";
		}
		return st;
	}
	
	public void kthople(ArrayList<UngVienBean> dsuv) throws Exception{
		int i=1;
		for(UngVienBean c: dsuv) {
			ArrayList<String> Loi=new ArrayList<String>();
			Loi.add("Dong "+i+";");
			if(ktns(c.getNgaysinh())==false) {
				Loi.add("Sai ngay sinh!");
			}
			if(ktsdt(c.getSdt())==false) {
				Loi.add("Sai so dien thoai!");
			}
			if(ktemail(c.getEmail())==false) {
				Loi.add("Sai email!");
			}
			if(ktsnkn(c.getNamkinhnghiem())==false) {
				Loi.add("Sai nam kinh nghiem");
			}
			String s= ktdulieuduthua(c);
			if(s!=null) {
				Loi.add(ktdulieuduthua(c));
			}
			i++;
			System.out.println(Loi);
		}
	}
	public void AddDatabase(ArrayList<UngVienBean> ds) throws Exception{
		uvd.AddDatabase(ds);
	}
	
}
