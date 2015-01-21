package exception;

import java.io.FileNotFoundException;

public class XmlNotFoundException extends FileNotFoundException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8391699677934543413L;
	public XmlNotFoundException(){
		super();
	}
	/**
	 * Constructor with a specific error message.
	 * @param fileLocation
	 */
	public XmlNotFoundException(String fileLocation){
		super("The file located at '" + fileLocation + "' can not be found.");
	}

}
