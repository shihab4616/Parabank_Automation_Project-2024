package Parabank_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_New_Account {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://parabank.parasoft.com");

//                  *********Customer Login************
        //Username
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("shihab");
        Thread.sleep(3000);
        //Password
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("shihab");
        Thread.sleep(3000);
        //Password
        driver.findElement(By.cssSelector("input[value='Log In']")).click();
        Thread.sleep(3000);

//        Account Services
//        Open New Account
        //Click on for Open New Account
        driver.findElement(By.linkText("Open New Account")).click();
        Thread.sleep(3000);

//        What type of Account would you like to open?
//        A minimum of $200.00 must be deposited into this account at time of opening.
//        Please choose an existing account to transfer funds into the new account.
//        input[value='Open New Account']
        driver.findElement(By.linkText("input[value='Open New Account']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
