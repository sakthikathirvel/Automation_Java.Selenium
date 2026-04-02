package org.testleaf.week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearch {
    public static void main(String[] args) {
        
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

// find the search box and enter the product name
        driver.findElement(By.xpath("//div[@class='nav-search-field ']//input")).sendKeys("Bags for boys");

// click the search button
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

// capture the total number of results
        String totalResults = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-none s-breadcrumb-with-all-filters')]//h2")).getText();
        System.out.println("The total number of results are: "+totalResults);       
        
// click the first product in the search results
          driver.findElement(By.xpath("//li[contains(@id,'p_123')]/span//i[@class='a-icon a-icon-checkbox']")).click();

// click the second product in the search results
          driver.findElement(By.xpath("//li[contains(@id,'418063')]/span//i[@class='a-icon a-icon-checkbox']")).click();
       
 // clicking sort botton
          driver.findElement(By.xpath("//span[@class='a-button-inner']/span[@id='a-autoid-62-announce']")).click();       
            
// selecting the newest arrivals
          driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();            
// capturing the name of the bag brand name  and price of it 
            String bagName = driver.findElement(By.xpath("//span[contains(text(),'38L Printed Laptop Backpack with Raincover')]//preceding::h2/span[text()='Safari']")).getText();
            String bagPrice = driver.findElement(By.xpath("//span[@class='a-price']/span[text()='₹2,045']")).getText();

            System.out.println("The name of the bag brand name is: "+bagName);
            System.out.println("The price of the bag is: "+bagPrice);

// capturing the title of the page
            String title = driver.getTitle();
            System.out.println("page title is: "+title);

             driver.quit();
             
             




    }


}
