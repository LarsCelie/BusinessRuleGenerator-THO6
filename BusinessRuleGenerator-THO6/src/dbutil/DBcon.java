package dbutil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.logging.Logger;

public abstract class DBcon{
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
	
	protected void setProperties(String databasename,String fileName) throws IOException{
		Logger logger = Logger.getLogger("defaultLogger");
		this.prop = new Properties();
		InputStream xmlFile = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		prop.loadFromXML(xmlFile);

		this.dbms = this.prop.getProperty(databasename+"_dbms");
		this.jarFile = this.prop.getProperty(databasename+"_jar_file");
		this.driver = this.prop.getProperty(databasename+"_driver");
		this.dbName = this.prop.getProperty(databasename+"_database_name");
		this.userName = this.prop.getProperty(databasename+"_user_name");
		this.password = this.prop.getProperty(databasename+"_password");
		this.sid = this.prop.getProperty(databasename+"_sid");
		this.serverName = this.prop.getProperty(databasename+"_server_name");
		this.portNumber = Integer.parseInt(this.prop.getProperty(databasename+"_port_number"));
		logger.config("Server properties: "+prop);
		
	}

	public abstract Connection getConnection() throws SQLException;
	public final void closeConnection() throws SQLException{
		conn.close();
	}
}