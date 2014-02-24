package bin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollerAction { 
	WebDriver drr=null;
	WebElement el=null;
	public void dragAndDrop(WebDriver driver,WebElement e){
		drr=driver;
		el=e;
		String id=el.getAttribute("id");
		String js="var q=document.getElementById('"+id+"').scrollTop=10000";
		((JavascriptExecutor) drr).executeScript(js);
		}
}
