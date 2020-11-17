package bean;

public class nguoibean {
	private String hoten;
	private int tuoi;
	
	public void HienThi() {
		System.out.print(hoten+":"+tuoi);
	}
	//Tao ra 2 ham dung
	public nguoibean(String hoten, int tuoi) {
		super();
		this.hoten = hoten;
		this.tuoi = tuoi;
	}
	
	public nguoibean() {
		super();
	}

	//Cac ham get, set
	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
}
