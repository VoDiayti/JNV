package com.phanthanh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class XeOtoDAO extends BasicDAO{
	
	public static void insertDataXeOto(String bienso, String tinhtrangvao, Timestamp tgvb) throws Exception {
		Connection cnn = null;
		PreparedStatement sql = null;
		try {
			cnn = getConnection();
			sql = cnn.prepareStatement("insert into XeOto (BienSoXe, TinhTrangLucVao, ThoiGianVaoBai) values (?,?,?)");
			sql.setString(1, bienso);
			sql.setString(2, tinhtrangvao);
			sql.setTimestamp(3, tgvb);
			if(sql.executeUpdate() == 0) throw new Exception("Khong the chen du lieu");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sql != null) sql.close();
			if(cnn != null) cnn.close();
		}
	}
	
	public static void updateDataXeOto(String bienso, Timestamp tgrb, String tinhtrangra) {
		Connection cnn = null;
		PreparedStatement sql = null;
		try {
			cnn = getConnection();
			sql = cnn.prepareStatement("update XeOto " + 
					"set ThoiGianRaBai = ?, TinhTrangLucRa = ? " + 
					"where BienSoXe = ? and ThoiGianVaoBai = (select top 1 ThoiGianVaoBai from XeOto where BienSoXe = ? order by ThoiGianVaoBai desc)");
			sql.setTimestamp(1, tgrb);
			sql.setString(2, tinhtrangra);
			sql.setString(3, bienso);
			sql.setString(4, bienso);
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
