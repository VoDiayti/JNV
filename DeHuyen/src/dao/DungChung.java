package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DungChung {
	public static Connection cn;
	/*public void  ketnoi(String tenmaychu,String tendatabase, String user,String pass) throws Exception {
		//b1: Nap database driver : Xac dinh he QTCSDL
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//System.out.println("Da nap driver");
		//b2: ket noi sql server: csdl
		// ten server: ...,  csdl: abc ...
		String ConnectionString ="jdbc:sqlserver://"+tenmaychu+":1433;databaseName="+tendatabase+";user="+user+"; password="+pass;
		cn = DriverManager.getConnection(ConnectionString);
		//System.out.println("Da ket noi");
	}*/
	public void KetNoi() throws Exception{
		//b1: Nap database driver : xac dinh he quan tri csdl
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.print("Da nap driver");
		//b2: Ket noi vao sqlserver:
		//ten server: ..., csdl: QuanLyThuVien, user: sa, pass: 123
		cn= DriverManager.getConnection("jdbc:sqlserver://NHAHUYEN-PC:1433;databaseName=DeHuyen;user=sa; password=123");
		System.out.print("Da ket noi");
	}
}
