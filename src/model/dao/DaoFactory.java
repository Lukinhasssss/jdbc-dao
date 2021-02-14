package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { // Essa classe terá operações estáticas para instânciar os Dao's
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
