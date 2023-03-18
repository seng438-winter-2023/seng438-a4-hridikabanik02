// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void test1category() {
    // Test name: test1category
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1005x816 |  | 
    driver.manage().window().setSize(new Dimension(1005, 816));
    // 3 | click | css=.hm-icon-label |  | 
    driver.findElement(By.cssSelector(".hm-icon-label")).click();
    // 4 | mouseDown | css=.hmenu-visible > li:nth-child(7) |  | 
    {
      WebElement element = driver.findElement(By.cssSelector(".hmenu-visible > li:nth-child(7)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 5 | mouseUp | css=li:nth-child(16) > .hmenu-item > div |  | 
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(16) > .hmenu-item > div"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 6 | click | css=.hmenu:nth-child(1) |  | 
    driver.findElement(By.cssSelector(".hmenu:nth-child(1)")).click();
    // 7 | runScript | window.scrollTo(0,0) |  | 
    js.executeScript("window.scrollTo(0,0)");
    // 8 | click | css=li:nth-child(16) .nav-sprite |  | 
    driver.findElement(By.cssSelector("li:nth-child(16) .nav-sprite")).click();
    // 9 | click | linkText=Textbooks |  | 
    driver.findElement(By.linkText("Textbooks")).click();
    // 10 | pause | 3000 |  | 
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 11 | assertText | css=h1 > b | Textbooks | 
    assertThat(driver.findElement(By.cssSelector("h1 > b")).getText(), is("Textbooks"));
    // 12 | close | css=.octopus-pc-category-card-v2-title > .a-size-extra-large |  | 
    driver.close();
  }
  @Test
  public void test3checkaccorders() {
    // Test name: test3checkaccorders
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1005x816 |  | 
    driver.manage().window().setSize(new Dimension(1005, 816));
    // 3 | mouseOver | css=#nav-link-accountList > .nav-line-2 |  | 
    {
      WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList > .nav-line-2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 4 | click | css=#nav-link-accountList > .nav-line-2 |  | 
    driver.findElement(By.cssSelector("#nav-link-accountList > .nav-line-2")).click();
    // 5 | click | css=.ya-card-row:nth-child(2) > .ya-card-cell:nth-child(1) .a-color-secondary |  | 
    driver.findElement(By.cssSelector(".ya-card-row:nth-child(2) > .ya-card-cell:nth-child(1) .a-color-secondary")).click();
    // 6 | pause | 5000 |  | 
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 7 | assertText | css=h1 | Your Orders | 
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Your Orders"));
    // 8 | close |  |  | 
    driver.close();
  }
  @Test
  public void testaddlocation() {
    // Test name: testaddlocation
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1006x816 |  | 
    driver.manage().window().setSize(new Dimension(1006, 816));
    // 3 | click | id=nav-global-location-popover-link |  | 
    driver.findElement(By.id("nav-global-location-popover-link")).click();
    // 4 | click | id=GLUXZipUpdateInput_0 |  | 
    driver.findElement(By.id("GLUXZipUpdateInput_0")).click();
    // 5 | type | id=GLUXZipUpdateInput_0 | T3A | 
    driver.findElement(By.id("GLUXZipUpdateInput_0")).sendKeys("T3A");
    // 6 | type | id=GLUXZipUpdateInput_1 | 3H1 | 
    driver.findElement(By.id("GLUXZipUpdateInput_1")).sendKeys("3H1");
    // 7 | click | css=#GLUXZipUpdate .a-button-input |  | 
    driver.findElement(By.cssSelector("#GLUXZipUpdate .a-button-input")).click();
    // 8 | pause | 3000 |  | 
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 9 | assertText | id=glow-ingress-line2 | T3A 3H‌ | 
    assertThat(driver.findElement(By.id("glow-ingress-line2")).getText(), is("T3A 3H‌"));
    // 10 | close |  |  | 
    driver.close();
  }
  @Test
  public void testchangecountry() {
    // Test name: testchangecountry
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1006x816 |  | 
    driver.manage().window().setSize(new Dimension(1006, 816));
    // 3 | runScript | window.scrollTo(0,5138.39990234375) |  | 
    js.executeScript("window.scrollTo(0,5138.39990234375)");
    // 4 | click | css=.icp-flag-3 |  | 
    driver.findElement(By.cssSelector(".icp-flag-3")).click();
    // 5 | click | css=.a-button-inner > .a-declarative |  | 
    driver.findElement(By.cssSelector(".a-button-inner > .a-declarative")).click();
    // 6 | click | id=icp-dropdown_8 |  | 
    driver.findElement(By.id("icp-dropdown_8")).click();
    // 7 | click | css=.a-button-input |  | 
    vars.put("window_handles", driver.getWindowHandles());
    // 8 | storeWindowHandle | root |  | 
    driver.findElement(By.cssSelector(".a-button-input")).click();
    // 9 | selectWindow | handle=${win2976} |  | 
    vars.put("win2976", waitForWindow(2000));
    // 10 | pause | 3000 |  | 
    vars.put("root", driver.getWindowHandle());
    // 11 | close |  |  | 
    driver.switchTo().window(vars.get("win2976").toString());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.close();
  }
  @Test
  public void testlanguage() {
    // Test name: testlanguage
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1006x816 |  | 
    driver.manage().window().setSize(new Dimension(1006, 816));
    // 3 | click | css=.nav-line-2 > div |  | 
    driver.findElement(By.cssSelector(".nav-line-2 > div")).click();
    // 4 | click | css=.a-row:nth-child(6) > .a-radio |  | 
    driver.findElement(By.cssSelector(".a-row:nth-child(6) > .a-radio")).click();
    // 5 | click | css=.a-row:nth-child(6) .a-icon |  | 
    driver.findElement(By.cssSelector(".a-row:nth-child(6) .a-icon")).click();
    // 6 | click | css=.a-button-input |  | 
    driver.findElement(By.cssSelector(".a-button-input")).click();
    // 7 | assertText | css=.nav-line-2 > div | FR | 
    assertThat(driver.findElement(By.cssSelector(".nav-line-2 > div")).getText(), is("FR"));
    // 8 | pause | 5000 |  | 
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 9 | close |  |  | 
    driver.close();
  }
  @Test
  public void testordertracking() {
    // Test name: testordertracking
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1005x816 |  | 
    driver.manage().window().setSize(new Dimension(1005, 816));
    // 3 | click | css=.hm-icon-label |  | 
    driver.findElement(By.cssSelector(".hm-icon-label")).click();
    // 4 | click | linkText=Help |  | 
    driver.findElement(By.linkText("Help")).click();
    // 5 | click | css=.issue-card-wrapper:nth-child(1) .bold |  | 
    driver.findElement(By.cssSelector(".issue-card-wrapper:nth-child(1) .bold")).click();
    // 6 | runScript | window.scrollTo(0,142.39999389648438) |  | 
    js.executeScript("window.scrollTo(0,142.39999389648438)");
    // 7 | pause | 3000 |  | 
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 8 | click | css=.issue-option:nth-child(4) > .fs-button |  | 
    driver.findElement(By.cssSelector(".issue-option:nth-child(4) > .fs-button")).click();
    // 9 | pause | 3000 |  | 
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 10 | close |  |  | 
    driver.close();
  }
  @Test
  public void testsignout() {
    // Test name: testsignout
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1011x816 |  | 
    driver.manage().window().setSize(new Dimension(1011, 816));
    // 3 | mouseOver | css=#nav-link-accountList > .nav-line-2 |  | 
    {
      WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList > .nav-line-2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 4 | click | css=#nav-item-signout > .nav-text |  | 
    driver.findElement(By.cssSelector("#nav-item-signout > .nav-text")).click();
    // 5 | pause | 5000 |  | 
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  @Test
  public void testFileter() {
    // Test name: TestFileter
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://www.amazon.ca/");
    // 2 | setWindowSize | 1004x815 |  | 
    driver.manage().window().setSize(new Dimension(1004, 815));
    // 3 | click | id=twotabsearchtextbox |  | 
    driver.findElement(By.id("twotabsearchtextbox")).click();
    // 4 | type | id=twotabsearchtextbox | bookshelf | 
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bookshelf");
    // 5 | sendKeys | id=twotabsearchtextbox | ${KEY_ENTER} | 
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
    // 6 | runScript | window.scrollTo(0,36) |  | 
    js.executeScript("window.scrollTo(0,36)");
    // 7 | runScript | window.scrollTo(0,300) |  | 
    js.executeScript("window.scrollTo(0,300)");
    // 8 | runScript | window.scrollTo(0,414) |  | 
    js.executeScript("window.scrollTo(0,414)");
    // 9 | click | css=#p_36\/12035760011 .a-size-base |  | 
    driver.findElement(By.cssSelector("#p_36\\/12035760011 .a-size-base")).click();
    // 10 | runScript | window.scrollTo(0,101) |  | 
    js.executeScript("window.scrollTo(0,101)");
    // 11 | mouseOver | css=#p_72\/11192168011 section |  | 
    {
      WebElement element = driver.findElement(By.cssSelector("#p_72\\/11192168011 section"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 12 | pause | 2000 |  | 
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // 13 | assertText | css=.a-link-normal > .a-text-bold | Under $25 | 
    assertThat(driver.findElement(By.cssSelector(".a-link-normal > .a-text-bold")).getText(), is("Under $25"));
    // 14 | mouseOut | css=#p_72\/11192168011 section |  | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}