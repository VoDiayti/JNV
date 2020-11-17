package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import bean.UngVienBean;
import bo.UngVienBo;
import dao.DungChung;

public class UngVienView {
	public void Xuat() {
		try {
			//Mo File
			FileInputStream fis=new FileInputStream("input.txt");
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			while (true) {
				String st=br.readLine();
				if (st==""||st==null) break;				
				System.out.println(st);
			}
			//Dong File
			br.close();
		} catch (Exception e) {
			System.out.println("Loi o ham Xuat:"+e.getMessage());
		}
	}
	public static void main(String[] args) throws Exception {
		try {
			UngVienView uvv=new UngVienView();
			UngVienBo uvb= new UngVienBo();
			ArrayList<UngVienBean> uv= uvb.getds(); 
			uvv.Xuat();
			//uvb.kthople(uv);
			
			//String tenmaychu,tendatabase,user,pass;
			DungChung dc = new DungChung();
			/*InputStreamReader sr = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(sr);
			System.out.println("Nhap server name = ");
			tenmaychu = input.readLine();
			System.out.println("Nhap ten database = ");
			tendatabase = input.readLine();
			System.out.println("Nhap user = ");
			user = input.readLine();
			System.out.println("Nhap pass = ");
			pass = input.readLine();
			dc.ketnoi(tenmaychu,tendatabase,user,pass);*/
			dc.KetNoi();
			uvb.AddDatabase(uv);
			System.out.println("Cau 3: Da luu vao database");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}

}
