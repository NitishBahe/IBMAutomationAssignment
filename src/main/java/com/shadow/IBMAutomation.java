package com.shadow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IBMAutomation {

	public static void main(String[] args) {

		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--start-maximized");
		WebDriver wd = new ChromeDriver(chromeoption);
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));

		wd.get("https://www.ibm.com/in-en");

		By hybridCloudMenuLocator = By.xpath("//c4d-megamenu-top-nav-menu[@menu-label='Hybrid Cloud']");
		WebElement hybridCloudMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(hybridCloudMenuLocator));
		SearchContext hybridCloudMenuShadow = hybridCloudMenu.getShadowRoot();

		By hybridCloudLinkLocator = By.cssSelector("a[part='trigger']");
		WebElement hybridCloudMenuLink = hybridCloudLinkLocator.findElement(hybridCloudMenuShadow);
		hybridCloudMenuLink.click();
		
		By iTinfrastructureMenuLocator=By.xpath("//c4d-megamenu-category-heading[@title=\"IT infrastructure\"]");
		WebElement iTinfrastructureMenu=wait.until(ExpectedConditions.visibilityOfElementLocated(iTinfrastructureMenuLocator));
		iTinfrastructureMenu.click();
	}

}
