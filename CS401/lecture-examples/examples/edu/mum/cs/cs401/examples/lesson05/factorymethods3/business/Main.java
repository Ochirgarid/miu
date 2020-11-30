package edu.mum.cs.cs401.examples.lesson05.factorymethods3.business;

import java.sql.SQLException;
import java.util.List;

import edu.mum.cs.cs401.examples.lesson05.factorymethods3.dataaccess.Dao;
import edu.mum.cs.cs401.examples.lesson05.factorymethods3.dataaccess.DataAccess;
import edu.mum.cs.cs401.examples.lesson05.factorymethods3.dataaccess.DataAccessFactory;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Dao dao = new AddressDao();
		DataAccess da = DataAccessFactory.getDataAccess();
		try {
			da.read(dao);
			List<Address> addresses = (List<Address>) dao.getResults();
			// display addresses
		} catch (SQLException e) {
			// handle
		}

	}

}
