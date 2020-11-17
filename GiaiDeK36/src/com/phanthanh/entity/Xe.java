package com.phanthanh.entity;

import java.sql.Timestamp;

public abstract class Xe {
	private Timestamp ThoiGianVaoBai;
	private Timestamp ThoiGianRaBai;
	
	public Timestamp getThoiGianVaoBai() {
		return ThoiGianVaoBai;
	}
	public void setThoiGianVaoBai(Timestamp thoiGianVaoBai) {
		ThoiGianVaoBai = thoiGianVaoBai;
	}
	public Timestamp getThoiGianRaBai() {
		return ThoiGianRaBai;
	}
	public void setThoiGianRaBai(Timestamp thoiGianRaBai) {
		ThoiGianRaBai = thoiGianRaBai;
	}
	
	public abstract String getBienSoXe();
	public abstract String getSoVeXe();
	public abstract String getLoaiXe();
	public abstract String getTinhTrangVaoBai();
	public abstract String getTinhTrangRaBai();
}
