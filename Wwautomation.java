//Rebecca Amarh-Adjei
//WW-Weight Watchers Automation Exercise
//QUESTION 2 -SELENIUM WEBDRIVER AUTOMATION
//The following exercise does not require user login. Please use ID or class as selectors
//Write an automated test for this scenario using WebDriver.
package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wwautomation {

	public static void main(String[] args) {
		
		//Selenium Code
				// Create object for Chromedriver
				//We strictly implement methods of webdriver
				/*Class name= Chromedriver
				X drivername= new X();*/
				//invoke .exe file first
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rwhit\\Documents\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
//STEP 1  	Navigate to https://www.weightwatchers.com/us/		
				driver.get("https://www.weightwatchers.com/us/");//hit url on browser
				System.out.println(driver.getTitle());//validate if your page title is correct
				
//STEP 2	Verify loaded page title matches “Weight Loss Program, Recipes & Help | Weight Watchers”		
				System.out.println(driver.getCurrentUrl());//validate you have landed on correct url. 
				//This assures you there is no redirects due to hacking
				
				//System.out.println(driver.getPageSource());//Print Page Source. Page source can usually be obtained by right clicking on page; 
				//but in cases such as banks which do not allow right clicks, you execute this
				
//STEPS 3	On the right corner of the page, click on “Find a Meeting		
				driver.findElement(By.linkText("Find a Studio")).click();//Validate
				
//STEP 4	Verify loaded page title contains “Get Schedules & Times Near You”		
				System.out.println(driver.getCurrentUrl());
				
//STEP 5	In the search field, search for meetings for zip code: 10011		
				driver.findElement(By.id("meetingSearch")).sendKeys("10011"); 
				//driver.findElement(By.xpath("//*[@id='meetingSearch']")).sendKeys("10011");Another alternative
				driver.findElement(By.xpath("//button[@spice='SEARCH_BUTTON']")).click();
				// driver.findElement(By.xpath("//button[@type='button']")).click();-Another alternative
				
//STEP 6 		6. Print the title of the first result and the distance (located on the right of location title/name)						
				System.out.println(driver.getTitle());
				
//STEP 7	Click on the first search result and then, verify displayed location name matches with the name of the first searched result that was clicked.
				driver.findElement(By.xpath("//span[@ng-if='!linkName']")).click();
				
//STEP 8	From this location page, print TODAY’s hours of operation (located towards the bottom of the page)	
				System.out.println(driver.findElement(By.xpath("//h2 [@spice='HOURS_LABEL']")));
				//driver.close();//closes current browser
				//driver.quit(); //closes all all browsers opened by Selenium script -both child and parent
							
	}

}
//CONSOLE OUTPUT
//Step 2: WW (Weight Watchers): Weight Loss & Wellness Help
//Step 1: https://www.weightwatchers.com/us/
//Step 4: https://www.weightwatchers.com/us/find-a-meeting/
//Step 6: Weight Loss Meeting Locations; 10011 | WW USA
//Step 7: [[ChromeDriver: chrome on XP (832ba07dbd3d3c5a6857cb13cb0fa339)] -> xpath: //h2 [@spice='HOURS_LABEL']]

