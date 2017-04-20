package com.jquerui;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;

public class DroppableActionPage extends WebDriverHelper {

	Utility utility = new Utility();
	By sourceElement = By.xpath("//div[@id='draggable']");
	By targetElement = By.xpath("//div[@id='droppable']");

	public void dragMeToTarget() {
		utility.dragElement(sourceElement, targetElement);
	}

}
