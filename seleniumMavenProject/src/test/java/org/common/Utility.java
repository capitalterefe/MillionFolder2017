package org.common;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends WebDriverHelper {

	public void clickOn(By locator) {
		WebElement myElement = driver.findElement(locator);
		explicitWait(myElement);
		myElement.click();
	}


	public void typeInto(By locator, String myText) {
		WebElement myElement = driver.findElement(locator);
		explicitWait(myElement);
		myElement.clear();
		myElement.sendKeys(myText);
	}

	public void uploadDoc(By locator, String filePath) {
		WebElement myElement = driver.findElement(locator);
		myElement.sendKeys(filePath);
	}

	public void selectDropDownByVisibleTxt(By locator, String visibleText) {
		WebElement myElement = driver.findElement(locator);
		explicitWait(myElement);
		Select select = new Select(myElement);
		select.selectByVisibleText(visibleText);
	}

	/**
	 * @param myElement
	 */
	public void explicitWait(WebElement myElement) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(myElement));
	}

	public void dragElement(By source, By target) {
		Actions action = new Actions(driver);
		WebElement sourceElement = driver.findElement(source);
		WebElement targetElement = driver.findElement(target);
		action.dragAndDrop(sourceElement, targetElement).perform();

	}

	public void moveMouseAndClick(By firstLocation, By secondLocation) {
		Actions action = new Actions(driver);
		WebElement firstLocatorElement = driver.findElement(firstLocation);
		WebElement secondLocatorElement = driver.findElement(secondLocation);
		action.moveToElement(firstLocatorElement).moveToElement(secondLocatorElement).click().perform();
	}

	public String getElementText(By locator) {
		WebElement element = driver.findElement(locator);
		String myStringText = element.getText();
		return myStringText;
	}

	public void handlePopupHitOk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void handlePopupHitCancel() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void handlePopupTypeAndOk() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("ACCEPTED ");
		alert.accept();
	}

	public void switchToPopupWindowAndMaximize() {
		String primaryWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String string : handles) {
			if (string != primaryWindow) {
				driver.switchTo().window(string);
				driver.manage().window().maximize();
				driver.close();
			}
		}

	}

	public void scrollToElement(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void takeScreenShot(String fileName) {
		File screenShoot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShoot, new File("./test-output/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sleep(long miliSec) {
		try {
			Thread.sleep(miliSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
