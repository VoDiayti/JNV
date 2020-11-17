package com.parking.entity;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThongTinVaoRa_XeDap extends ThongTinVaoRa {
	private String soVe; // số vé

	public String getSoVe() {
		return soVe;
	}

	public void setSoVe(String soVe) {
		this.soVe = soVe;
	}

	public ThongTinVaoRa_XeDap(Date thoiDiemVao, String soVe) {
		super(thoiDiemVao);
		this.setSoVe(soVe);
	}

	@Override
	public String getThongTin() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");

		if (this.getThoiDiemRa() == null)
			return String.format("Xe dap. So ve: %s. Vao: %s", this.getSoVe(), sdf.format(this.getThoiDiemVao()));
		else
			return String.format("Xe dap. So ve: %s. Vao: %s. Ra: %s. So ngay gui: %g", this.getSoVe(),
					sdf.format(this.getThoiDiemVao()), sdf.format(this.getThoiDiemRa()),
					this.getTongThoiGianGui_theoNgay());
	}

	@Override
	public double getTienThueBai() {
		// TODO Auto-generated method stub
		if (this.getThoiDiemRa() == null)
			return -1;
		else
			return this.getTongThoiGianGui_theoNgay()*1000; // chưa chính xác!!
	}
}
