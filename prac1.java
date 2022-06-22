package pro3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {
	public static void main(String[] args) {
    	String path1="D:\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",path1);
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://adactinhotelapp.com/");
    	driver.close();
    }
}

