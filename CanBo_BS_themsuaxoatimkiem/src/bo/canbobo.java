package bo;

import java.util.ArrayList;

import bean.canbobean;
import dao.canbodao;

public class canbobo {
	canbodao cb = new canbodao();
	ArrayList<canbobean> dscb;
	
	public ArrayList<canbobean> getcb() throws Exception{
		dscb = cb.getcb();
		return dscb;
	}
	public boolean Them(String macb,String hoten,Double hsl) throws Exception{
		//Kiem tra trung ma
		for(canbobean c: dscb) {
			if(c.getMacb().equals(macb))
				return false;//thoat khoi ham
			
		}//Them vao 1 can bo
		canbobean c = new canbobean();
		c.setMacb(macb); c.setht(hoten); c.setHsl(hsl);
		dscb.add(c);
		return true;
	}
	public void Save(ArrayList<canbobean> ds) throws Exception {
		cb.LuuFile(ds);
	}
	public boolean Xoa(String macb) {
		int n = dscb.size();
		for(int i=0;i<n;i++) {
			if(dscb.get(i).getMacb().equals(macb))
			{	dscb.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean Sua(String macb, String hsl) {
		for(canbobean c:dscb) {
			if(c.getMacb().equals(macb)) {
				c.setHsl(Double.parseDouble(hsl));
				return true;
			}
		}
		return false;
	}
}
