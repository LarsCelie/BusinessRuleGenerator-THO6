package dbutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;

public abstract class DBcon extends HttpServlet{
	public static String path;
	protected String dbms;
	protected String jarFile;
	protected String dbName;
	protected String userName;
	protected String password;
	protected String sid;
	protected String urlString;

	protected String driver;
	protected String serverName;
	protected int portNumber;
	protected Properties prop;
	protected Connection conn = null;
	
	protected void setProperties(String fileName) throws FileNotFoundException,
			IOException, InvalidPropertiesFormatException {
		Logger logger = Logger.getLogger("defaultLogger");
		this.prop = new Properties();
		//load the XML file as resource because the location changes and FileInputStream can't find it.
		InputStream xmlFile = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		prop.loadFromXML(xmlFile);

		this.dbms = this.prop.getProperty("dbms");
		this.jarFile = this.prop.getProperty("jar_file");
		this.driver = this.prop.getProperty("driver");
		this.dbName = this.prop.getProperty("database_name");
		this.userName = this.prop.getProperty("user_name");
		this.password = this.prop.getProperty("password");
		this.sid = this.prop.getProperty("sid");
		this.serverName = this.prop.getProperty("server_name");
		this.portNumber = Integer.parseInt(this.prop.getProperty("port_number"));
		logger.config("Server properties: "+prop);
		
	}

	public abstract Connection getConnection() throws SQLException;
	public final void closeConnection() throws SQLException{
		conn.close();
	}

	public static String getPath() {
		return path;
	}

	public static void setPath(String path) {
		DBcon.path = path;
	}

}