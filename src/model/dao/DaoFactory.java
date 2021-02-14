package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { // Essa classe ter� opera��es est�ticas para inst�nciar os Dao's
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
