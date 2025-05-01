package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("--------Browser launched----------------");
        System.out.println("Title--->"+driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
        System.out.println("--------driver quit successfully--------");
    }
}
