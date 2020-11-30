package edu.mum.cs.cs401.examples.lesson05.factorymethods3.dataaccess;

import java.sql.SQLException;

public interface DataAccess {
	void read(Dao dao) throws SQLException;

	void write(Dao dao) throws SQLException;

}
