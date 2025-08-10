package com.shadow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDemoAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		WebDriver wd = new ChromeDriver(chromeoptions);
		
		wd.get("https://jatin99.github.io/ShadowDomAssignment/");
		
		By inputTextLocator=By.cssSelector("input#email");
		WebElement inputText=wd.findElement(inputTextLocator);
		inputText.sendKeys("Nitish");
		
		By divheaderLocator=By.cssSelector("div.header");
		WebElement divheader=wd.findElement(divheaderLocator);
		System.out.println(divheader.getText());
		
		By userNameTextBoxLocator=By.cssSelector("input[name=username]");
		WebElement userNameTextBox=wd.findElement(userNameTextBoxLocator);
		userNameTextBox.sendKeys("1234");
		
		By submitButtonLocator=By.cssSelector("button[type='submit']");
		WebElement submitButton=wd.findElement(submitButtonLocator);
		System.out.println(submitButton.getText());
		
		By combinedDivLocator=By.cssSelector("div.main.header");
		WebElement combinedDiv=wd.findElement(combinedDivLocator);
		System.out.println(combinedDiv.getText());
		
		By itemOneLocator=By.cssSelector("ul>li");
		WebElement itemOne=wd.findElement(itemOneLocator);
		System.out.println(itemOne.getText());
		
		List<WebElement> itemList=wd.findElements(itemOneLocator);
		System.out.println(itemList.size());
		
		By itemThreeLocator=By.cssSelector("ul>li:nth-child(3)");
		WebElement itemThree=wd.findElement(itemThreeLocator);
		System.out.println(itemThree.getText());
		
		By nestedSpanLocator=By.cssSelector("div > span");
		WebElement nestedSpan=wd.findElement(nestedSpanLocator);
		System.out.println(nestedSpan.getText());
		
		//finding the div inside the shadow DOM
		By myComponentLocator=By.xpath("//my-component");
		WebElement myComponent=wd.findElement(myComponentLocator);
		SearchContext shadowContext=myComponent.getShadowRoot();
		
		By shadowDivHeaderLocator=By.cssSelector("div.header");
		WebElement shadowDivHeader=shadowContext.findElement(shadowDivHeaderLocator);
		System.out.println(shadowDivHeader.getText());
		
	}

}
