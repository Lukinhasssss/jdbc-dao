package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { // Essa classe terá operações estáticas para instânciar os Dao's
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

}
