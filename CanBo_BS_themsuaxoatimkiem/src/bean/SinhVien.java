package bean;

public class SinhVien extends nguoibean {
	private String masv;
	private String tenlop;
	
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	
	public SinhVien(String hoten, int tuoi, String masv, String tenlop) {
		super(hoten, tuoi);
		this.masv = masv;
		this.tenlop = tenlop;
	}
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String hoten, int tuoi) {
		super(hoten, tuoi);
		// TODO Auto-generated constructor stub
	}
	
	public void HienThi() {
		System.out.println(super.getHoten()+":"+super.getTuoi()+":"+masv+":"+tenlop);
	}
	@Override
	public String toString() {
		return getHoten();//hoac getmaSv()
	}
}
