
package browser;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowsersPro {
	public WebDriver driver = null;
	private FirefoxProfile firefoxprofile = null;
	private static DesiredCapabilities caps = null;
	private String projectpath = System.getProperty("user.dir");

	public enum BrowsersType {
		firefox, ie, chrome;
	}
 
	public BrowsersPro(BrowsersType browserstype) {
		switch (browserstype) {
		case firefox:

			File firebug = new File(projectpath+ "/tool/firebug@software.joehewitt.com.xpi");
			File firepath = new File(projectpath+ "/tool/FireXPath@pierre.tholence.com.xpi");
			firefoxprofile = new FirefoxProfile();
			try {
				firefoxprofile.addExtension(firebug);
				firefoxprofile.addExtension(firepath);
				firefoxprofile.setPreference(
						"webdriver.accept.untrusted.certs", "true");
				firefoxprofile.setPreference(
						"extensions.firebug.currentVersion", "1.12.6");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver = new FirefoxDriver(firefoxprofile);
			break;
		case ie:
			System.setProperty("webdriver.ie.driver", projectpath+ "/tool/IEDriverServer32.exe");
			caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS,
					false);
			caps.setCapability(
					InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					true);
			caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
			break;
		case chrome:
			System.setProperty("webdriver.chrome.driver", projectpath
					+ "/tool/chromedriver.exe");
			caps = DesiredCapabilities.chrome();
			caps.setCapability("chrome.switches",
					Arrays.asList("--start-maximized")); // ���browser
			// capabilities.setCapability("chrome.switches",
			// Arrays.asList("--proxy-server=http://your-proxy-domain:4443"));
			// //���ô���
			driver = new ChromeDriver(caps);
			break;
		}

	}
}
