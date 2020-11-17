package com.parking.entity;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThongTinVaoRa_XeMay extends ThongTinVaoRa {
	private String bienSo;

	public String getBienSo() {
		return bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	public ThongTinVaoRa_XeMay(Date thoiDiemVao, String bienSo) {
		super(thoiDiemVao);
		this.setBienSo(bienSo);
	}

	@Override
	public String getThongTin() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");

		if (this.getThoiDiemRa() == null)
			return String.format("Xe may. Bien so: %s. Vao: %s", this.getBienSo(), sdf.format(this.getThoiDiemVao()));
		else
			return String.format("Xe may. Bien so: %s. Vao: %s. Ra: %s. So ngay gui: %g", this.getBienSo(),
					sdf.format(this.getThoiDiemVao()), sdf.format(this.getThoiDiemRa()),
					this.getTongThoiGianGui_theoNgay());

	}

	@Override
	public double getTienThueBai() {
		// TODO Auto-generated method stub
		return 0;
	}
}
