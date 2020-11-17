package com.parking.ui;

import java.util.List;

import com.parking.dal.ThongTinVaoRaDAO;
import com.parking.entity.ThongTinVaoRa;

public class ChuongTrinh {

	public static void main(String[] args) {
		// Yeu cau 2 - Đọc thông tin từ file input1.txt
		List<ThongTinVaoRa> lst;//= ThongTinVaoRaDAO.docThongTinGuiXe("input1.txt");

		ThongTinVaoRaDAO dao = new ThongTinVaoRaDAO();
		lst = dao.layThongTinVaoRa_XeDap();

		System.out.println("Thong tin gui xe:");
		for (ThongTinVaoRa x : lst) {
			System.out.println(x.getThongTin());
		}

		/*
		// Yêu cầu 3 - Đọc thông tin lấy xe
		ThongTinVaoRaDAO.docThongTinLayXe("input2.txt", lst);
		System.out.println("Thong tin sau khi cap nhat viec lay xe");
		for (ThongTinVaoRa x : lst) {
			System.out.println(x.getThongTin());
		}
		*/
	}

}
