package org.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class WebDriverHelper {

	public static WebDriver driver = null;

	@BeforeClass
	public void setUp() throws Exception {

		ConfigProperty config = new ConfigProperty();

		if (config.getBrowser().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (config.getBrowser().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (config.getBrowser().equalsIgnoreCase("internetExplorer")) {
			driver = new InternetExplorerDriver();

		} else {
			System.out.println(config.getBrowser());
		}

		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}



	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}



}
