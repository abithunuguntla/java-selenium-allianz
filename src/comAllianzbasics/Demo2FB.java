package comAllianzbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2FB {
    public static void main(String[] args){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
          //find Element using ID
        driver.findElement(By.id("email")).sendKeys("abi.thunuguntla@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("7013561501abi");

        //findelement by Name
       // driver.findElement(By.name("login")).click();
    }
}
