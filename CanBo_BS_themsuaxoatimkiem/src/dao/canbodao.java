package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import bean.canbobean;


public class canbodao {
	ArrayList<canbobean> dscb;
	public ArrayList<canbobean> getcb() throws Exception{
		ArrayList<canbobean> dscb = new ArrayList<canbobean>();
		File f = new File("cb.txt");
		FileReader r = new FileReader(f);
		BufferedReader doc = new BufferedReader(r);
		while(true) {
			String st=doc.readLine();
			if(st==""||st==null) break;
			String[] ds = st.split("[;]");//Tach chuoi ra ba phan
			canbobean cb = new canbobean();		//Cap phat bo nho de luu can bo - Ton nhieu bo nho nhat
			cb.setMacb(ds[0]);
			cb.setht(ds[1]);
			cb.setHsl(Double.parseDouble(ds[2]));
			dscb.add(cb);
		}
		doc.close();
		return dscb;
	}
	public void LuuFile(ArrayList<canbobean> ds) throws Exception{
		File f= new File("cb.txt");
		FileWriter fw = new FileWriter(f); //Ghi de vao file
		PrintWriter ghi = new PrintWriter(fw);
		int n =ds.size();
		for(int i=0;i<n;i++) {
			ghi.println(ds.get(i).getMacb()+";"+ds.get(i).getht()+";"+ds.get(i).getHsl().toString());
		}
		ghi.close();
	}
	
	public void KiemTraMa(String macb) {
		
	}
	
	
/*	public void NgayThang(ArrayList<canbobean> ds) throws Exception{
		try {
			int n = dscb.size();
			for(int i=0;i<n;i++) {
				String ngaysinh = dscb.get(i).getNgaysinh();
				SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
				Date d1= f.parse(ngaysinh); //Doi chuoi ra ngay
				if() {
					
				}
			}
		}catch(Exception e) {
		}
	}*/
	
	
}