package bin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	private WebDriver driver = null;

	public MouseAction(WebDriver driver) {
		this.driver = driver;
	}

	// ����Ҽ�����
	public void rightClickTheMouse(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// ���˫�����
	public void doubleClickTheLeftMouseButton(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();

	}

	// ����϶�Ԫ�ص�ָ��Ԫ����
	public void dragElementToElementByMouse(WebElement source, WebElement target) {

		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);

	}
	
	// ��Ŀ��Ԫ����ק��ָ����������
	public void dragElementToArea(WebElement element, int xOffset,int yOffset) {
		Actions action = new Actions(driver);
		action.dragAndDropBy(element,xOffset,yOffset);

	}
}
