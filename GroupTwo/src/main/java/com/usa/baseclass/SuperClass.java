package com.usa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.usa.utility.UtilityFile;

public class SuperClass {
	public static WebDriver driver;
	public static Properties pp;
	public FileInputStream fs;
	public static Logger logger;

	public SuperClass() {
		
		logger= logger.getLogger("QA");
		PropertyConfigurator.configure("log4j.properties");
		pp = new Properties();
		try {
			fs = new FileInputStream(
					System.getProperty("user.dir") + "./src/main/java/com/usa/config/login.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pp.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilityFile.Page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilityFile.Implicit_wait, TimeUnit.SECONDS);

	}

	public void teardown() {
		driver.close();
	}

}
