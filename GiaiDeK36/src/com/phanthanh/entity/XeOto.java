package com.phanthanh.entity;

public class XeOto extends Xe{
	private String BienSoXe;
	private String TinhTrangVaoBai;
	private String TinhTrangRaBai;
	
	@Override
	public String getBienSoXe() {
		return BienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		BienSoXe = bienSoXe;
	}
	
	@Override
	public String getTinhTrangVaoBai() {
		// TODO Auto-generated method stub
		return TinhTrangVaoBai;
	}
	public void setTinhTrangVaoBai(String tinhTrangVaoBai) {
		TinhTrangVaoBai = tinhTrangVaoBai;
	}
	
	@Override
	public String getTinhTrangRaBai() {
		// TODO Auto-generated method stub
		return TinhTrangRaBai;
	}
	public void setTinhTrangRaBai(String tinhTrangRaBai) {
		TinhTrangRaBai = tinhTrangRaBai;
	}
	
	//Cai ham show ra console de test thoi. De k yeu cau thi khoi viet :))
	public String toString() {
		return String.format(this.getBienSoXe() + " - " + this.getThoiGianVaoBai() + " - " + this.TinhTrangVaoBai + this.TinhTrangRaBai);
	}
	
	@Override
	public String getSoVeXe() {
		// TODO Auto-generated method stub
		return "Not Available";
	}
	
	@Override
	public String getLoaiXe() {
		// TODO Auto-generated method stub
		return "4";
	}
}
