package crazy;
/*
 * 作者：叶浩\西安-疯子\xian-crazy
 * github：https://github.com/xian-crazy/CrazyWebDriverBin.git
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	private WebDriver driver = null;

	public MouseAction(WebDriver driver) {
		this.driver = driver;
	}

	// 鼠标右键单击
	public void rightClickTheMouse(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 左键双击鼠标
	public void doubleClickTheLeftMouseButton(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();

	}

	// 鼠标拖动元素到指定元素上
	public void dragElementToElementByMouse(WebElement source, WebElement target) {

		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);

	}
	
	// 将目标元素拖拽到指定的区域里
	public void dragElementToArea(WebElement element, int xOffset,int yOffset) {
		Actions action = new Actions(driver);
		action.dragAndDropBy(element,xOffset,yOffset);

	}
}
