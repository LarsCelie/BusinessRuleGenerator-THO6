package service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

import controller.Generator;

public class BusinessruleService {
	public String getBusinessRuleByName(String rule) throws InvalidPropertiesFormatException, IOException, SQLException {
		String reply = new Generator().generate(rule);
		if(reply != null) {
			return reply; 
		} else {
			return "an error has occured fetching the businessrule with name: "+rule+" \n please contact a developer";
		}
		
	}	
}
