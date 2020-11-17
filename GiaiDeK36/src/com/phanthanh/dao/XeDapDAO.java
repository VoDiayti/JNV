package com.phanthanh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class XeDapDAO extends BasicDAO{
	//hàm insert dữ liệu xe vào
	public static void insertDataXeDap(String sovexe, Timestamp tgvb) throws Exception {
		Connection cnn = null;
		PreparedStatement sql = null;
		
		try {
			cnn = getConnection();
			sql = cnn.prepareStatement("insert into XeDap (SoVeXe, ThoiGianVaoBai) values (?,?)");
			sql.setString(1,sovexe);
			sql.setTimestamp(2, tgvb);
			if(sql.executeUpdate() == 0)
				throw new Exception("Không thể chèn dữ liệu vào") ;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sql != null) sql.close();
			if(cnn != null) cnn.close();
		}
	}
	//hàm update dữ liệu xe ra
	public static void updateDataXeDap(String sovexe, Timestamp tgrb) {
		Connection cnn = null;
		PreparedStatement sql = null;
		try {
			cnn = getConnection();
			sql = cnn.prepareStatement("update XeDap set ThoiGianRaBai = ? "
					+ "where SoVeXe = ? and ThoiGianVaoBai = (select top 1 ThoiGianVaoBai "
					+ "from XeDap where SoVeXe = ? order by ThoiGianVaoBai desc)");
			sql.setTimestamp(1, tgrb);
			sql.setString(2, sovexe);
			sql.setString(3, sovexe);
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
