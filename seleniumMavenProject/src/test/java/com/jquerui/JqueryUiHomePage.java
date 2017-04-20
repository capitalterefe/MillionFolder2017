package com.jquerui;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;

public class JqueryUiHomePage extends WebDriverHelper {
	Utility utility = new Utility();
	By droppableElement = By.xpath("//a[text()='Droppable']");
	By supportElement = By.xpath("(//a[text()='Support'])[1]");
	By forumElement = By.xpath("//a[text()='Forums']");

	public void clickDroppable() {
		utility.clickOn(droppableElement);
	}

	public void gotoForumsPage() {
		utility.moveMouseAndClick(supportElement, forumElement);
	}

}

