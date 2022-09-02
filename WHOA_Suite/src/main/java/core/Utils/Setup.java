package core.Utils;

import core.CustomExceptions.CustomException;

public class Setup  {

	public void loadAllConfigData() throws CustomException {
		
		ConfigReader.loadPropertiesFile();
		
	}
	
	
}
