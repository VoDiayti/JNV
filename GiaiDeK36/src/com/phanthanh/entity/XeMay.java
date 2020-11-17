package com.phanthanh.entity;

public class XeMay extends Xe{
	private String BienSoXe;

	@Override
	public String getBienSoXe() {
		return BienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		BienSoXe = bienSoXe;
	}
	
	//Cai ham show ra console de test thoi. De k yeu cau thi khoi viet :))
	public String toString() {
		return String.format(this.getBienSoXe() + " - " + this.getThoiGianVaoBai());
	}

	@Override
	public String getSoVeXe() {
		// TODO Auto-generated method stub
		return "Not Available";
	}

	@Override
	public String getLoaiXe() {
		// TODO Auto-generated method stub
		return "2";
	}

	@Override
	public String getTinhTrangVaoBai() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTinhTrangRaBai() {
		// TODO Auto-generated method stub
		return null;
	}
}
