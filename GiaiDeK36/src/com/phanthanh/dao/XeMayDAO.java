package com.phanthanh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class XeMayDAO extends BasicDAO{

	public static void insertDataXeMay(String bienso, Timestamp tgvb) throws Exception {
		Connection cnn = null;
		PreparedStatement sql = null;
		try {
			cnn = getConnection();
			sql = cnn.prepareStatement("insert into XeMay (BienSoXe, ThoiGianVaoBai) values (?, ?)");
			sql.setString(1,bienso);
			sql.setTimestamp(2, tgvb);
			if(sql.executeUpdate() == 0)
				throw new Exception("Không thể chèn dữ liệu vào");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sql != null) sql.close();
			if(cnn != null) cnn.close();
		}
	}
	
	public static void updateDataXeMay(String bienso, Timestamp tgrb) {
		Connection cnn = null;
		PreparedStatement sql = null;
		try {
			cnn = getConnection();
			sql = cnn.prepareStatement("update XeMay set ThoiGianRaBai = ? "
					+ "where BienSoXe = ? and ThoiGianVaoBai = (select top 1 ThoiGianVaoBai "
					+ "from XeMay where BienSoXe = ? order by ThoiGianVaoBai desc)");
			sql.setTimestamp(1, tgrb);
			sql.setString(2, bienso);
			sql.setString(3, bienso);
			if(sql.executeUpdate() == 0) {
				throw new Exception("Không thể cập nhật dữ liệu");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sql != null)
				try {
					sql.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(cnn != null)
				try {
					cnn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
