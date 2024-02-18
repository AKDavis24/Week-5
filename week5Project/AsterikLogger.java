package week5Project;

public class AsterikLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		
		String asterik = "";
		String lf = System.lineSeparator();
		
		for(int i = 0; i < (error.length() + 6); i++) {
			asterik += "*";
		}
		
		System.out.println(asterik + lf + "***" + error + "***"  + lf + asterik);
		
	}
	
	

}
