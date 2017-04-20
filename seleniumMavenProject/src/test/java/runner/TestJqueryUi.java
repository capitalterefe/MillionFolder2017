package runner;

import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jquerui.DroppableActionPage;
import com.jquerui.JqueryUiHomePage;

public class TestJqueryUi extends WebDriverHelper {

	JqueryUiHomePage jqueryUiHomePage = new JqueryUiHomePage();
	DroppableActionPage droppableActionPage = new DroppableActionPage();

	@Test(groups = "droppablePage")
	public void testJqueryHomePage() {
		jqueryUiHomePage.clickDroppable();
		WebElement dropabbleElement = driver.findElement(By.xpath("//h1[text()='Droppable']"));
		Assert.assertEquals(dropabbleElement.getText(), "Droppable");
	}

	@Test(dependsOnGroups = "droppablePage")
	public void testDragAndDrop() {
		driver.switchTo().frame(0);
		WebElement actualElement = driver.findElement(By.xpath("//div[@id='droppable']/p"));
		String actualTextBeforDrag = actualElement.getText();
		System.out.println("Befor Drag " + actualTextBeforDrag);
		droppableActionPage.dragMeToTarget();
		String actualTextAfterDrag = actualElement.getText();
		System.out.println("After Drag " + actualTextAfterDrag);
		Assert.assertEquals(actualTextAfterDrag, "Dropped!");
	}

	// @Test
	public void testMoveMouseOver() {
		jqueryUiHomePage.gotoForumsPage();
		WebElement forumsElement = driver.findElement(By.xpath("//div[text()='All Forums']"));
		String forumsText = forumsElement.getText();
		Assert.assertEquals(forumsText, "All Forums");
	}
}
