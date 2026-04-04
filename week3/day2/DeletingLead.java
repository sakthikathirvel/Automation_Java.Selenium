package org.testleaf.week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class DeletingLead {
    public static void main(String args[]){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
         ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
         

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        String leadId = driver.findElement(By.linkText("10520")).getText();
        System.out.println(leadId);
        driver.findElement(By.linkText("10520")).click();
        driver.findElement(By.linkText("Delete")).click();
         driver.findElement(By.linkText("Find Leads")).click();
         driver.findElement(By.name("id")).sendKeys("10520");
         driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
          String noRecordsMessage = driver.findElement(By.xpath("//div[@class='x-panel-bbar']/div//div[text()='No records to display']")).getText();
          System.out.println(noRecordsMessage);
          if(noRecordsMessage.equals("No records to display")){
            System.out.println("The lead is successfully deleted");
          } else {
            System.out.println("The lead is not deleted");
          }

          driver.quit();





    }

}
