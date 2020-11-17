package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public static Connection cn;
	public void KetNoi() throws Exception{
		//b1: Nap database driver : xac dinh he quan tri csdl
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.print("Da nap driver");
		//b2: Ket noi vao sqlserver:
		//ten server: ..., csdl: QuanLyThuVien, user: sa, pass: 123
		cn= DriverManager.getConnection("jdbc:sqlserver://NHAHUYEN-PC:1433;databaseName=QuanLyThuVien;user=sa; password=123");
		System.out.print("Da ket noi");
	}
}
