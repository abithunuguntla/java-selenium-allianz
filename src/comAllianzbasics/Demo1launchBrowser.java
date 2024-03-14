package comAllianzbasics;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class Demo1launchBrowser {
    public static void main(String[] args) {
        WebDriver driver = null;
        String browser;
        System.out.println("chose the browser to launch chrome/edge");
        Scanner sc = new Scanner(System.in);
        browser = sc.nextLine().toLowerCase();
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Unabale to open browser");
        }

                driver.get("https://www.facebook.com/");
                String gettitle = driver.getTitle();
                String pagesrc = driver.getPageSource();
                System.out.println("the title of the page is - " + gettitle);
                System.out.println("the Html of current page is - " + pagesrc);
                driver.quit();
        }
    }
