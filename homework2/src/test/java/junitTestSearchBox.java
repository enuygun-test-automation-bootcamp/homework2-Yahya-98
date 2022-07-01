import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class junitTestSearchBox {


    @Test
    public void junitTest(){

        // Create object from Customers
        Customers customers = new Customers();
        // Path for chromedriver
        Path resourceDirectory = Paths.get("src","main","resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        // Find the chromedriver
        System.setProperty("webdriver.chrome.driver", absolutePath + "/binary/chromedriver.exe");
        // Create chromedriver
        WebDriver driver = new ChromeDriver();
        // Get url
        String url = "https://demoqa.com/webtables";
        driver.get(url);
        // Create list for table
        List<WebElement> webElementList = new ArrayList();
        // Find first name from table
        webElementList = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div[1]/div[1]"));
        // Find Searchbox for table
        WebElement nameSpace = driver.findElement(By.xpath("//*[@id='searchBox']"));


        for(int i = 0; i < customers.customerList.size(); i++){
            // This loop send the customers to searchbox one by one
            nameSpace.sendKeys(customers.customerList.get(i));
            // Check the filtered table first name equals customer name
            Assert.assertEquals(webElementList.get(0).getText(),customers.customerList.get(i));
            // Clear searchbox for another testcase
            nameSpace.clear();
        }


    }
}
