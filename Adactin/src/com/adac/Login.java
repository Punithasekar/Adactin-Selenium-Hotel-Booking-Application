package com.adac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navin\\eclipse-workspace\\Adactin\\Chrome\\chromedriver.exe");// browser access
		WebDriver driver = new ChromeDriver();// new driver
		driver.manage().window().maximize();// maxi
		driver.get("https://adactinhotelapp.com/index.php");// open application

		// login

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Punitha1234");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Navinnivan@902");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		Thread.sleep(2000);

		// search hotel

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select locate = new Select(location);
		locate.selectByIndex(6);
		Thread.sleep(2000);

		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select hotel = new Select(hotels);
		hotel.selectByValue("Hotel Sunshine");
		Thread.sleep(2000);

		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select type = new Select(room);
		type.selectByVisibleText("Deluxe");
		Thread.sleep(2000);

		WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select rooms = new Select(no);
		rooms.selectByIndex(3);
		Thread.sleep(2000);

		WebElement datein = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		datein.clear();
		datein.sendKeys("20/02/2023");//change the date
		Thread.sleep(2000);

		WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		dateout.clear();
		dateout.sendKeys("23/02/2023");//change the date 
		Thread.sleep(2000);

		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select aroom = new Select(adult);
		aroom.selectByIndex(2);
		Thread.sleep(2000);

		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select croom = new Select(child);
		croom.selectByValue("1");
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);

		// select hotel

		WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
		select.click();

		WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
		cont.click();

		// book hotel

		WebElement first = driver.findElement(By.xpath("//input[@name='first_name']"));
		first.sendKeys("Shivani");

		WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
		last.sendKeys("M");

		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("Namakkal");

		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		card.sendKeys("1234765489765467");

		WebElement ctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s = new Select(ctype);
		s.selectByValue("MAST");

		WebElement exmonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select se = new Select(exmonth);
		se.selectByValue("2");

		WebElement exyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select sel = new Select(exyear);
		sel.selectByValue("2022");

		WebElement cv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cv.sendKeys("456");

		WebElement book = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		book.click();

		TakesScreenshot screen = (TakesScreenshot) driver;
		File screens = screen.getScreenshotAs(OutputType.FILE);
		File shot = new File("C:\\Users\\navin\\eclipse-workspace\\Adactin\\ScreenShot\\adactin.png");
		FileHandler.copy(screens, shot);

	}

}


