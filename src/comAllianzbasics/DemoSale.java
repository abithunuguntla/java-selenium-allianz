package comAllianzbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoSale {
    public static void main(String [] args ){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/");

        //firstname
        driver.findElement(By.xpath("//input[@name ='UserFirstName']")).sendKeys("Abhishek");
        //lastname
        driver.findElement(By.xpath("//input[@name ='UserLastName']")).sendKeys("narayana");
        //email
        driver.findElement(By.xpath("//input[@name ='UserEmail']")).sendKeys("abi.thunuguntla@gmail.com");

        WebElement ele3 = driver.findElement(By.xpath("//select[@name = 'CompanyCountry']"));
        Select se2 = new Select(ele3);
        se2.selectByVisibleText("Australia");

        WebElement ele2 = driver.findElement(By.xpath("//select[@name = 'CompanyEmployees']"));
        Select se1 = new Select(ele2);
        se1.selectByIndex(3);

        WebElement ele = driver.findElement(By.xpath("//select[@name ='UserTitle']"));
        Select se = new Select(ele);
        se.selectByVisibleText("IT Manager");

        //company nmae
        WebElement comname = driver.findElement(By.xpath("//input[@name = 'CompanyName']"));
        comname.click();
        comname.sendKeys("allianz");
        //phone
        driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("1234123111");
        //state selection
        WebElement ele4 = driver.findElement(By.xpath("//select[@name='CompanyState']"));
        Select s4 = new Select(ele4);
        s4.selectByVisibleText("South Australia");

        //termsandcondition
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[3]")).click();

        driver.quit();



    }
}
