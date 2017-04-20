package org.common;

import org.openqa.selenium.By;
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

}
