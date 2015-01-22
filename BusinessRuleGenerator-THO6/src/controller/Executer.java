package controller;

import java.sql.SQLException;

import model.Businessrule;

public class Executer {
	
	public Executer(){}
	private Businessrule businessrule = new Businessrule();
	
	public void executeStatement(String database, String sqlStatement, String type) throws SQLException {
		businessrule.executeStatement(database,sqlStatement,type);
	}
}
