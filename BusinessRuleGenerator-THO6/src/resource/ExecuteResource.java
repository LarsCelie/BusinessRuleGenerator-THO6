package resource;

import java.sql.SQLException;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import service.ExecuteService;

@Path("/execute")
public class ExecuteResource {

	ExecuteService executeService = new ExecuteService();
	
	@PUT
	@Path("{databasetype}/{database}")
	public void executeSQLStatement(@PathParam("databasetype") String type,
			@PathParam("database") String database, 
			@QueryParam("sqlstatement") String sqlStatement) throws SQLException {
		executeService.executeStatement(database, sqlStatement, type);
	}
}
