package selenium_demo_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
   public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "D://selenium file//selenium-java-3.141.59//geckodriver-v0-30.0-win64");
	FirefoxDriver driver = new FirefoxDriver(); 
	driver.get("https://login.salesforce.com/?locale=in");
	
  }
 }
 