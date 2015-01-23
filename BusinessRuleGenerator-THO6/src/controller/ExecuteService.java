package controller;

import java.sql.SQLException;

public class ExecuteService {

	public void executeStatement(String database, String sqlStatement, String type) throws SQLException {
		Executer executer = new Executer();
		executer.executeStatement(database,sqlStatement,type);
	}
}
