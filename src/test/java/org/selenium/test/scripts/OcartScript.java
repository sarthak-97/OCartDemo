package org.selenium.test.scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.test.objrepo.ReadXpathData;
import org.selenium.test.ocartlib.OCartLoginLibrary;
import org.selenium.test.testdata.DriverProperties;
import org.selenium.test.testdata.TestData;

public class OcartScript {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		DriverProperties prop = new DriverProperties();

		System.setProperty(prop.getWebdriver(), prop.getDriverpath());
		WebDriver driver = new ChromeDriver();

		// ***********getting to the url **************

		driver.get(prop.getUrl());
		driver.manage().window().maximize();
		
		//**************calling the lib functions***********

		OCartLoginLibrary loginLib = new OCartLoginLibrary();

		loginLib.getMyAccountDropDown(driver);
		loginLib.getLoginLink(driver);
		loginLib.automateLoginPage(driver);

		driver.close();

	}

}
