package com.phanthanh.entity;

public class XeDap extends Xe{
	private String SoVeXe;

	@Override
	public String getSoVeXe() {
		return SoVeXe;
	}

	public void setSoVeXe(String soVeXe) {
		SoVeXe = soVeXe;
	}
	
	//Cai ham show ra console de test thoi. De k yeu cau thi khoi viet :))
	public String toString() {
		return String.format(this.getSoVeXe() + " - " + this.getThoiGianVaoBai());
	}

	@Override
	public String getBienSoXe() {
		return "Not Available";
	}

	@Override
	public String getLoaiXe() {
		// TODO Auto-generated method stub
		return "0";
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
