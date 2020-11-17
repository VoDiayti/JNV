package com.phanthanh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class XeDAO extends BasicDAO{
	//Class này có chút lộn xộn nên sẽ k dùng đến - Khi nào nghĩ ra sẽ update :)) >_< vì đề nó cho quá nhiều mâu thuẫn =>? Vãi cả đề
	public static void insertDataXe(String maXe, Timestamp date) throws Exception {
		Connection cnn = null;
		PreparedStatement sql = null;
		try {
			cnn = getConnection();
			sql = cnn.prepareStatement("insert into Xe (MaXe, ThoiGianVaoBai) values (?,?)");
			sql.setString(1, maXe);
			sql.setTimestamp(2, date);
			
			int n = sql.executeUpdate();
			if(n == 0) {
				throw new Exception("Không chèn dữ liệu được");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sql != null) {
				sql.close();
			}
			if(cnn != null) {
				cnn.close();
			}
		}
	}
}
