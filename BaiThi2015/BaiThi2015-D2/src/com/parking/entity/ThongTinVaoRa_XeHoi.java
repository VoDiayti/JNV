package com.parking.entity;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThongTinVaoRa_XeHoi extends ThongTinVaoRa {
	private String bienSo;
	private String tinhTrangKhiVao;
	private String tinhTrangKhiRa;

	public String getBienSo() {
		return bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	public String getTinhTrangKhiVao() {
		return tinhTrangKhiVao;
	}

	public void setTinhTrangKhiVao(String tinhTrangKhiVao) {
		this.tinhTrangKhiVao = tinhTrangKhiVao;
	}

	public String getTinhTrangKhiRa() {
		return tinhTrangKhiRa;
	}

	public void setTinhTrangKhiRa(String tinhTrangKhiRa) {
		this.tinhTrangKhiRa = tinhTrangKhiRa;
	}

	public ThongTinVaoRa_XeHoi(Date thoiDiemVao, String bienSo, String tinhTrangKhiVao) {
		super(thoiDiemVao);
		this.setBienSo(bienSo);
		this.setTinhTrangKhiVao(tinhTrangKhiVao);
	}

	@Override
	public String getThongTin() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");

		if (this.getThoiDiemRa() == null)
			return String.format("Xe oto. Bien so: %s. Vao: %s (%s).", this.getBienSo(),
					sdf.format(this.getThoiDiemVao()), this.getTinhTrangKhiVao());
		else
			return String.format("Xe oto. Bien so: %s. Vao: %s (%s). Ra: %s (%s). So 1/2 gio gui: %g", this.getBienSo(),
					sdf.format(this.getThoiDiemVao()), this.getTinhTrangKhiVao(), sdf.format(this.getThoiDiemRa()),
					this.getTinhTrangKhiRa(), this.getTongThoiGianGui_theoNuaGio());
	}

	@Override
	public double getTienThueBai() {
		// TODO Auto-generated method stub
		return 0;
	}
}
