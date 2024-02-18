package week5Project;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsterikLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Hello2");
		logger2.error("Hello2");

	}

}
