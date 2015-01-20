//package resource;
//
//import javax.servlet.http.HttpServlet;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.QueryParam;
//
//import service.DatabaseService;
//
//public class TargetDatabaseResource extends HttpServlet {
//
//	DatabaseService databaseService = new DatabaseService();
//	
//	@POST
//	@Path("/{database}/execute")
//	public String executeSQLStatement(@PathParam(value = "database") String databaseName,
//			@QueryParam("sqlStatement") String sqlStatement) {
//		this.getServletConfig().getServletContext().getContextPath();
//		return databaseService.getDatabaseByName(databaseName).execute(sqlStatement);
//	}
//}
