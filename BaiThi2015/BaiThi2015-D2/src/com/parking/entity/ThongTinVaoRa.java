package com.parking.entity;
import java.util.Date;

public abstract class ThongTinVaoRa {
	private Date thoiDiemVao;
	private Date thoiDiemRa;

	public Date getThoiDiemVao() {
		return thoiDiemVao;
	}

	public void setThoiDiemVao(Date thoiDiemVao) {
		this.thoiDiemVao = thoiDiemVao;
	}

	public Date getThoiDiemRa() {
		return thoiDiemRa;
	}

	public void setThoiDiemRa(Date thoiDiemRa) {
		this.thoiDiemRa = thoiDiemRa;
	}

	public ThongTinVaoRa(Date thoiDiemVao) {
		this.setThoiDiemVao(thoiDiemVao);
		this.setThoiDiemRa(null);
	}

	/**
	 * Tính tổng thời gian đã gửi xe (tính bằng ngày)
	 * 
	 * @return
	 */
	public double getTongThoiGianGui_theoNgay() {
		if (this.getThoiDiemRa() == null)
			return -1.0;
		else {
			double tongThoiGian = this.getThoiDiemRa().getTime() - this.getThoiDiemVao().getTime();
			return tongThoiGian / (24 * 60 * 60 * 1000);
		}
	}

	/**
	 * Tính tổng thời gian đã gửi xe (tính bằng .5 giờ)
	 * 
	 * @return
	 */
	public double getTongThoiGianGui_theoNuaGio() {
		if (this.getThoiDiemRa() == null)
			return -1.0;
		else {
			double tongThoiGian = this.getThoiDiemRa().getTime() - this.getThoiDiemVao().getTime();
			return tongThoiGian / (.5 * 60 * 60 * 1000);
		}
	}
	
	public abstract String getThongTin();
	
	public abstract double getTienThueBai();
}
