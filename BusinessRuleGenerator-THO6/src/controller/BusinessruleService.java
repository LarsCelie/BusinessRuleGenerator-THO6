package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

public class BusinessruleService {
	public String getBusinessRuleByName(String rule) throws InvalidPropertiesFormatException, IOException, SQLException {
		String reply = new Generator().generate(rule);
		if(reply != null) {
			return reply; 
		} else {
			return "An error has occured fetching the businessrule with name: "+rule+" \n please contact a developer";
		}
		
	}	
}
