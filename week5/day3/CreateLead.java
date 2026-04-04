package org.testleaf.week5.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest" );
    
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
         

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SAKTHI");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");
       driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
       String actualTitle = driver.findElement(By.xpath("//span[text()='Automation Tester']")).getText();
       System.out.println(actualTitle);

         if (actualTitle.equals("Automation Tester")) {
          System.out.println("The title is correct");
         } else {
          System.out.println("The title is incorrect");
         }

         driver.quit();
        



       



    }

}
