package com.parking.dal;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DataAccessObject {

	public void displayError(SQLException ex) {
		System.out.println("Error Message: " + ex.getMessage());
		System.out.println("SQL State: " + ex.getSQLState());
		System.out.println("Error Code: " + ex.getErrorCode());
	}

	public Connection getConnection() {
		try {
			// 1. Nạp và đăng ký drivers
			// Driver driver = new org.gjt.mm.mysql.Driver();
			Driver driver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();
			DriverManager.registerDriver(driver);

			// 2. Tạo kết nối đến CSDL
			// String url = "jdbc:mysql://localhost:3306/employee";
			String server = "127.0.0.1";
			String dbName = "Park";
			String userName = "k37";
			String password = "12345";
			String url = String.format("jdbc:sqlserver://%s;databaseName=%s",server, dbName);
			Connection conn = DriverManager.getConnection(
				url, 
				userName, 
				password);
			return conn;
		} catch (SQLException ex) {
			displayError(ex);
			return null;
		}
	}
}