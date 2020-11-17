package bo;

import java.util.ArrayList;

import bean.sachBean;
import dao.sachDAO;

public class sachBO {

	public ArrayList<sachBean> getSach(){
		ArrayList<sachBean> ds = new ArrayList<>();
		sachDAO mm = new sachDAO();
		ds = mm.getSach();
		return ds;
	}

}
