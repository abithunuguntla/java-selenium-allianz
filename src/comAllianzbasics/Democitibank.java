package comAllianzbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Democitibank {
    public static void main(String [] args ){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
       //parent tag
        WebElement accounttype = driver.findElement(By.xpath("//a[text()='What if I have multiple products with the bank?']/preceding::a[10]"));
        accounttype.click();
        accounttype.findElement(By.xpath("//a[text()='Credit Card']")).click();
        //enetring credit card number
        driver.findElement(By.xpath("//input[@name='citiCard1']")).sendKeys("1111111111111111");
        //cvv
        driver.findElement(By.xpath("//input[@name='CCVNO']")).sendKeys("111");
        //dob
        driver.findElement(By.xpath("//input[@name='DOB']")).click();
        //year
        WebElement year = driver.findElement(By.xpath("//*[text()='Date of Birth:']/following::select[2]"));
       Select se = new Select(year);
       se.selectByVisibleText("1998");
       //month
        WebElement month = driver.findElement(By.xpath("//*[text()='Date of Birth:']/following::select[1]"));
        Select se1 = new Select(month);
        se1.selectByVisibleText("Apr");
        //day
        driver.findElement(By.xpath("//*[text()='23']")).click();
        //agreeterms
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();










    }
}