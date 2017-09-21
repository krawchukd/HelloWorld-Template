package edu.uwp.cs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {
	private static Logger logger = LogManager.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("info log");
		logger.error("error log");
	}

}
