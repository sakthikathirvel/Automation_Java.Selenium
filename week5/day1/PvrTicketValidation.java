package org.testleaf.week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrTicketValidation {

    public static void main(String[] args) {
        
        ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.pvrcinemas.com/");       
         driver.manage().window().maximize();
       
         driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
         driver.findElement(By.xpath("//span[text()='Cinema']")).click();
         driver.findElement(By.xpath("//div[@id='cinema']//span")).click();
  
         driver.findElement(By.xpath("//li[@class='p-dropdown-item'][3]")).click();
        
         driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[contains(text(),'Tomorrow')]")).click();
         //  selecting the movie name
         driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='YOUTH']")).click();

         //  selecting the time 
         driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span")).click();

         // clicking the book button
         driver.findElement(By.xpath("//div[@class='quick-lefts ']//button")).click();

        //  accepting the terms and conditions        
         driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']//button[text()='Accept']")).click();

        //  selecting the seat
         driver.findElement(By.xpath("//tr[@class='seats-row']//span[@id='EX.EXECUTIVE|L:7']")).click();

        //  capturinng the seat info

         String seatInfo = driver.findElement(By.xpath("//div[@class='seat-info'] ")).getText();
            System.out.println(seatInfo);

         // capturing the total amount
            String totalAmount = driver.findElement(By.xpath("//div[@class='all-summary ']//div[@class='grand-amount']")).getText();
                System.out.println(totalAmount);
       
        //   clicking the proceed button
         driver.findElement(By.xpath("//div[@class='register-btn']/button[text()='Proceed']")).click();

        // continuing with the payment
         driver.findElement(By.xpath("//div[@class='fb-added-divdesk']//button[text()='Continue']")).click();

        //  close the pop up
            driver.findElement(By.xpath("(//div[@class='cross-icon mx-2']//i)[2]")).click();
    
        // capturing the title of the page
            String title = driver.getTitle();
                System.out.println(title);  

        // closing the browser
            driver.close();
         

        
        


}
}

