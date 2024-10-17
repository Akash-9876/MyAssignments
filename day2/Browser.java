package week1.day2;

public class Browser {

	public void launchbrowser(String browsername) {
	System.out.println("Browser Launched Sucessfully");
        
	
	}
	private void LoadURL() {
	System.out.println("Application URL Loaded Successfully");	
	
	}

	public static void main(String[] args) {
		Browser a = new Browser();
		a.launchbrowser("chrome");
		a.LoadURL();
	}
	
}
