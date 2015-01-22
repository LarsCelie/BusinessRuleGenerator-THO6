package service;

import java.sql.SQLException;

import controller.Executer;

public class ExecuteService {

	public void executeStatement(String database, String sqlStatement, String type) throws SQLException {
		Executer executer = new Executer();
		executer.executeStatement(database,sqlStatement,type);
	}
}
