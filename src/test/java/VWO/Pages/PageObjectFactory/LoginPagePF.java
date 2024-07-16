package VWO.Pages.PageObjectModal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    // set up your drivers
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    //Page locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By signUpLink = By.partialLinkText("Start a free trial");

    // error page locator 
    By error_message = By.id("js-notification-box-msg");

    // Page Actions
    // Navigate to the url
    // write some text to email and password
    // click on the button
    // new page -> loaded Dashboard

    public void navigateUrl(String url){
        driver.get(url);
    }

    public void writeToElement(By element, String text){
        driver.findElement(element).sendKeys(text);
    }

    public void clickToElement(By element ){
        driver.findElement(element).click();
    }

    public void loginToVWO(String email, String password_sent){
        writeToElement(username,email);
        writeToElement(password,password_sent);
        clickToElement(signButton);
    }

    public DashBoardPage afterLogin(){
        return new DashBoardPage(driver);
    }
    
    // negative test case 
      public String errorMessage() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(error_message).getText();
      }
}
