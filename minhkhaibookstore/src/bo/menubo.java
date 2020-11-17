package bo;

import java.util.ArrayList;

import bean.menubean;
import dao.menudao;

public class menubo {
	menudao mn = new menudao();
	
	public ArrayList<menubean> getMenu(){
		return mn.getmenu();
	}

}
