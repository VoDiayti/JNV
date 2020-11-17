package bean;

public class NhanVien extends nguoibean {
	private String manv;
	private Double hsl;
	private String tendonvi;
	
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public Double getHsl() {
		return hsl;
	}
	public void setHsl(Double hsl) {
		this.hsl = hsl;
	}
	public String getTendonvi() {
		return tendonvi;
	}
	public void setTendonvi(String tendonvi) {
		this.tendonvi = tendonvi;
	}
	
	public NhanVien(String hoten, int tuoi, String manv, Double hsl, String tendonvi) {
		super(hoten, tuoi);
		this.manv = manv;
		this.hsl = hsl;
		this.tendonvi = tendonvi;
	}
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String hoten, int tuoi) {
		super(hoten, tuoi);
		// TODO Auto-generated constructor stub
	}
	
	public void HienThi() {
		System.out.println(super.getHoten()+":"+super.getTuoi()+":"+manv+":"+hsl+":"+tendonvi+":"+GetLuong());
	}
	
	public Double GetLuong() {
		return hsl*130;
	}
	
	@Override
	public String toString() {
		return getHoten();//hoac getmaSv()
	}
}
