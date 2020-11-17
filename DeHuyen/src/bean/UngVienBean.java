package bean;


public class UngVienBean {
	private Integer loaiungvien;
	private String hoten;
	private String ngaysinh;
	private String sdt;
	private String email;
	private String namkinhnghiem;
	private String kynang;
	private String nam;
	public UngVienBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UngVienBean(Integer loaiungvien, String hoten, String ngaysinh, String sdt, String email, String namkinhnghiem,
			String kynang, String nam) {
		super();
		this.loaiungvien = loaiungvien;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.sdt = sdt;
		this.email = email;
		this.namkinhnghiem = namkinhnghiem;
		this.kynang = kynang;
		this.nam = nam;
	}
	public Integer getLoaiungvien() {
		return loaiungvien;
	}
	public void setLoaiungvien(Integer loaiungvien) {
		this.loaiungvien = loaiungvien;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNamkinhnghiem() {
		return namkinhnghiem;
	}
	public void setNamkinhnghiem(String namkinhnghiem) {
		this.namkinhnghiem = namkinhnghiem;
	}
	public String getKynang() {
		return kynang;
	}
	public void setKynang(String kynang) {
		this.kynang = kynang;
	}
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
}
