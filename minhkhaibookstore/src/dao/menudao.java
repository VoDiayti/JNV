package dao;

import java.util.ArrayList;

import bean.menubean;

public class menudao {

	public ArrayList<menubean> getmenu(){
		ArrayList<menubean> ds = new ArrayList<>();
		menubean m = new menubean("tc", "Trang chu");
		ds.add(m);
		m = new menubean("tin", "Tin Học");
		ds.add(m);
		m = new menubean("li", "Vật");
		ds.add(m);
		m = new menubean("hoa", "Hóa học");
		ds.add(m);
		m = new menubean("news", "Thời sự");
		ds.add(m);
		return ds;
	}

}
