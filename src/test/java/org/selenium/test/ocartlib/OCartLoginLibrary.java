package org.selenium.test.ocartlib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.test.objrepo.ReadXpathData;
import org.selenium.test.testdata.TestData;

/**
 * 
 * @author sarthak-pc
 *
 */
public class OCartLoginLibrary {

	ReadXpathData xpath = new ReadXpathData(); //Getting Xpaths from property file

	/**
	 * 
	 * @param driver
	 * @throws IOException
	 */
	public void getMyAccountDropDown(WebDriver driver) throws IOException {

		WebElement accountLink = driver.findElement(new By.ByXPath(xpath.getXpaths().getProperty("xPath_MyAccount")));
		if (accountLink.isEnabled()) {
			System.out.println("link found");

			accountLink.click();

		}
	}

	/**
	 * 
	 * @param driver
	 * @throws IOException
	 */

	public void getLoginLink(WebDriver driver) throws IOException {

		WebElement loginLink = driver.findElement(new By.ByXPath(xpath.getXpaths().getProperty("xPath_LoginLink")));
		if (loginLink.isEnabled()) {
			System.out.println(" Login  link found");

			loginLink.click();

		}

	}

	/**
	 * 
	 * @param driver
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void automateLoginPage(WebDriver driver) throws InterruptedException, IOException {

		TestData testData = new TestData();

		driver.findElement(By.xpath(xpath.getXpaths().getProperty("xPath_Email"))).sendKeys(testData.getUsername());
		driver.findElement(By.xpath(xpath.getXpaths().getProperty("xPath_Pass"))).sendKeys(testData.getPassword());

		Thread.sleep(2000);

		driver.findElement(By.xpath(xpath.getXpaths().getProperty("xPath_LoginButton"))).click();

		System.out.println("The title of the Page is :" + driver.getTitle());
		Thread.sleep(2000);

		if (driver.findElement(By.partialLinkText("Edit your account information")).getText()
				.equals("Edit your account information")) {

			System.out.println("verified the login page");

		}

	}

}
