package org.testleaf.week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();

        // clicking accounts header
        driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Accounts']")).click();
        
        // clicking create account
        driver.findElement(By.xpath("//div[@class='frameSectionBody']//li[2]")).click();


        // entering the name for the account
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("SAKTHI");

        //entering description
       WebElement description = driver.findElement(By.name("description"));
       description.sendKeys("Selenium Automation Teste");

       WebElement industry =driver.findElement(By.name("industryEnumId"));
       industry.click();
       Select opt1 = new Select(industry);
       opt1.selectByIndex(3);

         WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
         ownership.click();
         Select ownershipOption=new Select(ownership);
         ownershipOption.selectByVisibleText("S-Corporation");


         WebElement sourceOption = driver.findElement(By.id("dataSourceId"));
         sourceOption.click();
         Select sourceField=new Select(sourceOption);
         sourceField.selectByVisibleText("Employee");

         WebElement marketCampOpt= driver.findElement(By.id("marketingCampaignId"));
         marketCampOpt.click();
         Select marketCampField = new Select(marketCampOpt);
         marketCampField.selectByIndex(6);


         WebElement stateOrProvince=driver.findElement(By.id("generalStateProvinceGeoId"));
         stateOrProvince.click();
         Select StateOrProvinceField=new Select(stateOrProvince);
          StateOrProvinceField.selectByVisibleText("Texas");


          driver.findElement(By.className("smallSubmit")).click();


          String actualAccName="SAKTHI";
        
          String expectedAccName = driver.findElement(By.className("tabletext")).getText();

          if(actualAccName.contains(expectedAccName)){
            System.out.println(actualAccName+ "matches to the " +expectedAccName);
          } else{
                 System.out.println(actualAccName+ "is not matches to the " +expectedAccName);

          }

          driver.quit();
         




    }

}
