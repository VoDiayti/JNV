package com.phanthanh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicDAO {
	public static Connection getConnection() throws SQLException {
		String dbURL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=parking";
//		String dbURL = "jdbc:mysql://localhost/parking";
//		System.out.println("Chuẩn bị kết nối...");
		Connection cnn = DriverManager.getConnection(dbURL, "sa", "thanh1234");
//		System.out.println("... Đã kết nối OK!");
		return cnn;
	}
}
