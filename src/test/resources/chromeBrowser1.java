
public class chromeBrowser1 {

	
	
	// /home/satya/Desktop/selenium/drivers
	@Test
	public test() 
	{
	String exePath = "\\home\\satya\\Desktop\\selenium\\drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

	}
	

}
