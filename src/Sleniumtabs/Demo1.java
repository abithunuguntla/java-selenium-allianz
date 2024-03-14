package Sleniumtabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.db4free.net/");
       WebElement phy =  driver.findElement(By.xpath("//*[text()='phpMyAdmin »']"));
       String text = phy.getText();
       System.out.println(text);
       String orginalhandle = driver.getWindowHandle();
       if(text.equalsIgnoreCase("phpMyAdmin »")){
           phy.click();
       }
       else
       {
           System.out.println("Unable to click the element ");
       }

        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(windows);
        for(String window : windows){
            if(!window.equals(driver.getCurrentUrl())){
                driver.switchTo().window(window);
            }
        }
        driver.findElement(By.xpath("//input[@name='pma_username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pma_password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='input_go']")).click();
        driver.switchTo().window(orginalhandle);
        

    }
}