package service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

import controller.Generator;

public class BusinessruleService {
	public String getBusinessRuleByName(String rule) throws InvalidPropertiesFormatException, IOException, SQLException {
		return new Generator().generate(rule); 
	}	
}
