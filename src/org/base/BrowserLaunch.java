package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	public static void main(String[]args) throws IOException, InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajaRajan Kannan\\eclipse-workspace\\SeleniumNovember\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Rajarajan1234");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12956R");
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File Source=tk.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\RajaRajan Kannan\\eclipse-workspace\\SeleniumNov23\\screenshot\\adacthomepage.png");
	
		FileUtils.copyFile(Source, Destination);
		
		WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
		login.click();
		
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.name("location"));
		Select s=new Select(location);
		s.selectByValue("Sydney");
		
		Thread.sleep(2000);
		
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select h=new Select(hotels);
		h.selectByValue("Hotel Cornice");
		
		Thread.sleep(2000);
		
		WebElement roomType = driver.findElement(By.name("room_type"));
		Select r=new Select(roomType);
		r.selectByValue("Deluxe");
		
		Thread.sleep(2000);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select t=new Select(roomno);
		t.selectByIndex(4);
		
		
		Robot act2=new Robot();
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		Actions act=new Actions(driver);
		act.moveToElement(checkin).perform();
		
		Thread.sleep(1000);
		checkin.click();
		act2.keyPress(KeyEvent.VK_CONTROL);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyRelease(KeyEvent.VK_CONTROL);
		act2.keyPress(KeyEvent.VK_BACK_SPACE);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_4);
		act2.keyPress(KeyEvent.VK_SLASH);
		act2.keyPress(KeyEvent.VK_0);
		act2.keyPress(KeyEvent.VK_1);
		act2.keyPress(KeyEvent.VK_SLASH);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_0);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_4);
		
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.name("datepick_out"));
		act.moveToElement(checkout).perform();
		
		checkout.click();
		act2.keyPress(KeyEvent.VK_CONTROL);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyRelease(KeyEvent.VK_CONTROL);
		act2.keyPress(KeyEvent.VK_BACK_SPACE);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_8);
		act2.keyPress(KeyEvent.VK_SLASH);
		act2.keyPress(KeyEvent.VK_0);
		act2.keyPress(KeyEvent.VK_1);
		act2.keyPress(KeyEvent.VK_SLASH);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_0);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_4);
		
		Thread.sleep(2000);
		
		WebElement adults = driver.findElement(By.name("adult_room"));
		Select a=new Select(adults);
		a.selectByIndex(2);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select c=new Select(child);
		c.selectByIndex(2);
		
		WebElement search = driver.findElement(By.name("Submit"));
		search.click();
		
		WebElement radiobutton = driver.findElement(By.name("radiobutton_0"));
		radiobutton.click();
		
		WebElement conti = driver.findElement(By.name("continue"));
		conti.click();
		
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.click();
		act2.keyPress(KeyEvent.VK_R);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyPress(KeyEvent.VK_J);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyPress(KeyEvent.VK_R);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyPress(KeyEvent.VK_J);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.click();
		act2.keyPress(KeyEvent.VK_K);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyPress(KeyEvent.VK_N);
		act2.keyPress(KeyEvent.VK_N);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyPress(KeyEvent.VK_N);
		
		WebElement address = driver.findElement(By.name("address"));
		address.click();
		act2.keyPress(KeyEvent.VK_N);
		act2.keyPress(KeyEvent.VK_O);
		act2.keyPress(KeyEvent.VK_DECIMAL);
		act2.keyPress(KeyEvent.VK_1);
		act2.keyPress(KeyEvent.VK_0);
		act2.keyPress(KeyEvent.VK_ENTER);
		act2.keyPress(KeyEvent.VK_G);
		act2.keyPress(KeyEvent.VK_R);
		act2.keyPress(KeyEvent.VK_E);
		act2.keyPress(KeyEvent.VK_E);
		act2.keyPress(KeyEvent.VK_N);
		act2.keyPress(KeyEvent.VK_S);
		act2.keyPress(KeyEvent.VK_SPACE);
		act2.keyPress(KeyEvent.VK_T);
		act2.keyPress(KeyEvent.VK_E);
		act2.keyPress(KeyEvent.VK_C);
		act2.keyPress(KeyEvent.VK_H);
		act2.keyPress(KeyEvent.VK_N);
		act2.keyPress(KeyEvent.VK_O);
		act2.keyPress(KeyEvent.VK_L);
		act2.keyPress(KeyEvent.VK_0);
		act2.keyPress(KeyEvent.VK_G);
		act2.keyPress(KeyEvent.VK_Y);
		act2.keyPress(KeyEvent.VK_ENTER);
		act2.keyPress(KeyEvent.VK_C);
		act2.keyPress(KeyEvent.VK_H);
		act2.keyPress(KeyEvent.VK_E);
		act2.keyPress(KeyEvent.VK_N);
		act2.keyPress(KeyEvent.VK_N);
		act2.keyPress(KeyEvent.VK_A);
		act2.keyPress(KeyEvent.VK_I);
		act2.keyPress(KeyEvent.VK_SUBTRACT);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_8);
		
		
		WebElement creditcard = driver.findElement(By.name("cc_num"));
		creditcard.click();
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_3);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_4);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_5);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_6);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_7);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_8);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_9);
		act2.keyPress(KeyEvent.VK_3);
		act2.keyPress(KeyEvent.VK_0);
		
		Thread.sleep(2000);
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select c1=new Select(cardtype);
		c1.selectByValue("VISA");
		
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select m1=new Select(month);
		m1.selectByIndex(4);
		//m1.selectByValue("April");

		Thread.sleep(2000);
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select y1=new Select(year);
		y1.selectByIndex(8);
		//y1.selectByValue("2026");
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.click();
		act2.keyPress(KeyEvent.VK_1);
		act2.keyPress(KeyEvent.VK_2);
		act2.keyPress(KeyEvent.VK_3);
		
		WebElement booknow = driver.findElement(By.name("book_now"));
		booknow.click();
		
		Thread.sleep(5000);
		
		WebElement orderno = driver.findElement(By.id("order_no"));
		String attribute = orderno.getAttribute("value");//cntrl2+l for return type
		System.out.println(attribute);
		
		
		
	}

}
