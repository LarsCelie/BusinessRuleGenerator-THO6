package rest.resource;


import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import rest.service.BusinessruleService;

@Path("/businessrule")
public class BusinessRuleResource {
	private BusinessruleService businessRuleService = new BusinessruleService();
	
	@GET 
	@Path("{businessRuleName}")
	public String getBusinessRuleByName(@PathParam("businessRuleName") String rule) throws InvalidPropertiesFormatException, IOException, SQLException {
		return businessRuleService.getBusinessRuleByName(rule);
	}

}
