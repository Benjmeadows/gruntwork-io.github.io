import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
System.setProperty('webdriver.chrome.driver', "./src/test/resources/chromedriver")
//driver = {new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome())}
driver = "chrome"
reportsDir = "build/reports/geb"
baseUrl = "http://www.wikipedia.org"
