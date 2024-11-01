package Parabank_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_Parabank {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://parabank.parasoft.com");

        //Customer Login Register

        //Click for Register
        driver.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a:nth-child(1)")).click();
        Thread.sleep(3000);

               //******Register Page**********
        //Signing up is easy!
        //First Name:
        driver.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("Shihab1");
        Thread.sleep(3000);
        //Last Name:
        driver.findElement(By.cssSelector("input[id='customer.lastName']")).sendKeys("Ahmed1");
        Thread.sleep(3000);
        //Address:
        driver.findElement(By.cssSelector("input[id='customer.address.street']")).sendKeys("Mirpur-1, Dhaka-1216");
        Thread.sleep(3000);
        //City:
        driver.findElement(By.cssSelector("input[id='customer.address.city']")).sendKeys("Dhaka");
        Thread.sleep(3000);
        //State:
        driver.findElement(By.cssSelector("input[id='customer.address.state']")).sendKeys("Mirpur");
        Thread.sleep(3000);
        //Zip Code:
        driver.findElement(By.cssSelector("input[id='customer.address.zipCode']")).sendKeys("1216");
        Thread.sleep(3000);
        //Phone #:
        driver.findElement(By.cssSelector("input[id='customer.phoneNumber']")).sendKeys("01768114612");
        Thread.sleep(3000);
        //SSN:
        driver.findElement(By.cssSelector("input[id='customer.ssn']")).sendKeys("4616");
        Thread.sleep(3000);
        //Username:
        driver.findElement(By.cssSelector("input[id='customer.username']")).sendKeys("shihab1");
        Thread.sleep(3000);
        //Password:
        driver.findElement(By.cssSelector("input[id='customer.password']")).sendKeys("shihab1");
        Thread.sleep(3000);
        //Confirm:
        driver.findElement(By.cssSelector("input[id='repeatedPassword']")).sendKeys("shihab1");
        Thread.sleep(3000);
        //Click on Register
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        Thread.sleep(3000);
//        driver.quit();
    }
}
