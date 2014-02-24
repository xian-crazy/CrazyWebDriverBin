package bin;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BrowersSize {
	private  Dimension screenDims;
	private int width;
	private int height;

	public  void maxBrowersSize(WebDriver driver){
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.moveTo(0,0)");
	    this.width = (int) this.getScreenDims().getWidth();
	    this.height = (int) screenDims.getHeight()-10; 
	    js.executeScript("window.resizeTo("+this.width+","+this.height+")");
	    System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getHeight());
	    System.out.println(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
	    
	    }

	public  Dimension getScreenDims() {
		screenDims = Toolkit.getDefaultToolkit().getScreenSize();
	    System.out.println(screenDims.getHeight());
	    System.out.println(screenDims.getWidth());
		return screenDims;
	}
	
	public void setBrowserSize(WebDriver driver, int width, int height) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.moveTo(0,0)");
		this.width = width;
		this.height = height;
		js.executeScript("window.resizeTo(" + this.width + "," + this.height+ ")");
	}
	
	public void setBrowserSize(WebDriver driver, Dimension dimension){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.moveTo(0,0)");
		this.width = (int) dimension.getWidth();
		this.height = (int) dimension.getHeight();
		js.executeScript("window.resizeTo(" + this.width + "," + this.height+ ")");
	}

}
