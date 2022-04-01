package po.assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class TestYahooLogin {
	
	YahooLoginPage myHomePage;
  @Test
  public void f() throws InterruptedException {
	  myHomePage.login("prathameshjavaselenium21","JavaSelenium@21");
	  String expectedTitleAfterLogin ="Yahoo Search - Web Search";
	  String actualTitleAfterLogin = myHomePage.getTitleAfterLogin();
	  assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin,"Login was unsuccessful");
  }

  @BeforeClass
  public void beforeClass() {
	  myHomePage = new YahooLoginPage();
  }

  @AfterClass
  public void afterClass() {

  }

}
