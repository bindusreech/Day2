package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumday4q1 {
public static void main(String[] args) {
	//set property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jashu\\eclipse-workspace\\Selenium3day\\drivers\\chromedriver.exe");
	
	//launch browser
	WebDriver d = new ChromeDriver();
	//url
	d.get("http://www.greenstechnologys.com/");
d.manage().window().maximize();	

//to locate a para
WebElement para = d.findElement(By.xpath("//p[contains(text(),'gain real-time')]"));
String text = para.getText();
	System.out.println(text);
	}}
