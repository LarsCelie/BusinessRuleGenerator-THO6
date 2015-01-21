package servlet;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// Do nothing
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		Logger logger = Logger.getLogger("defaultLogger");
		try {
			FileHandler fh = new FileHandler("log.txt");
			fh.setFormatter(new SimpleFormatter());
			logger.addHandler(fh);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		logger.setLevel(Level.ALL);
		logger.info("Logger is actief");
	}

}
