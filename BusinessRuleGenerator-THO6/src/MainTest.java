import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import controller.Generator;


public class MainTest {
	public static void main(String[] args) throws FileNotFoundException, InvalidPropertiesFormatException, IOException, SQLException {
		Generator g = new Generator();
		g.generate("BRG_IDD_TRG_ACMP_ORA_022");
	}
}
