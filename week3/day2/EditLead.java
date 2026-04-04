package org.testleaf.week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class EditLead {
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
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("SAKTHI");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("SAKTHIVEL");
        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
        driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("This is for editing the lead");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sakthi@gmail.com");
        WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
        state.click();
        Select select = new Select(state);
        select.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath("//textarea[text()='This is for editing the lead']")).clear();
        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("This is for editing the lead");
        driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
        String Title = driver.getTitle();
        System.out.println(Title);
        driver.quit();




        



          



}
}

