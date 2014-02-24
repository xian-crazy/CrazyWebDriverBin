package crazy;
/*
 * 作者：叶浩\西安-疯子\xian-crazy
 * github：https://github.com/xian-crazy/CrazyWebDriverBin.git
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollerAction {
	private WebDriver drr = null;

	public ScrollerAction(WebDriver driver) {
		this.drr = driver;
	}

	public void dragAndDrop(WebElement e) {
		String id = e.getAttribute("id");
		String js = "var q=document.getElementById('" + id+ "').scrollTop=10000";
		((JavascriptExecutor) drr).executeScript(js);
	}
	
	public void dragAndDrop(WebElement e ,int px) {
		String id = e.getAttribute("id");
		String js = "var q=document.getElementById('" + id+ "').scrollTop="+px;
		((JavascriptExecutor) drr).executeScript(js);
	}
}
