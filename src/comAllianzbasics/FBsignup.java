package comAllianzbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FBsignup {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.facebook.com/");
        //clcik on create new account
        driver.findElement(By.linkText("Create new account")).click();
        //enter the first name
        driver.findElement(By.name("firstname")).sendKeys("jack");
        //lastname
        driver.findElement(By.name("lastname")).sendKeys("wick");
        //custom radio button
        driver.findElement(By.xpath("//input[@name = 'sex'and @value='-1']")).click();
        WebElement ele = driver.findElement(By.name("birthday_day"));
           Select se = new Select(ele);
           se.selectByValue("23");

           WebElement ele1 = driver.findElement(By.name("birthday_month"));
           Select se1 = new Select(ele1);
           se1.selectByVisibleText("Mar");


           WebElement ele2 = driver.findElement(By.name("birthday_year"));
           Select se2 = new Select(ele2);
           se2.selectByVisibleText("1998");

           WebElement ele3 = driver.findElement(By.xpath("//select[@name = 'preferred_pronoun']"));
           Select se3 = new Select(ele3);
                   se3.selectByIndex(2);
    }
}