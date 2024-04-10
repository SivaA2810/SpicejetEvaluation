package org.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UtilityMethods {
		public static WebDriver driver;	
		public void launchbrowser(String browser, String url) {
			switch (browser) {
			case "chrome" :driver = new ChromeDriver();
			break;
			case "edge"	  :driver = new EdgeDriver();
			break;
			case "firefox":driver = new FirefoxDriver();
			break;
		    default 	  :driver = new ChromeDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void urlLoad(String url) {	
		}
		
		public void switch_toChildwindowHandles() {
			String maindwindow = driver.getWindowHandle();
	    	Set<String> windowHandles = driver.getWindowHandles();
	    	for (String handle : windowHandles) {
	    	if(!handle.equals(maindwindow)) {
				driver.switchTo().window(handle);
					
		}
	    	
	    }

		}
		
		public String picktitle() {
		String tit =driver.getTitle();
		return tit;
		}
		
		public void backthewindow() {
		driver.navigate().back();	
		}
		
		public void forwardthewindow() {
		driver.navigate().forward();	
		}
		
		public void multipleWindows() {
			Set<String> windowHandles = driver.getWindowHandles();
		
		}
		
		public void browserClose() {
			
			driver.close();
		}
		
		public void clickbtn(WebElement element) {
		element.click();
		}
		
		public void findelementbyid(String attribute) {
		driver.findElement(By.id(attribute));
		}
		
		public void findelementbyxpathandsendkey(String attribute) {
		driver.findElement(By.xpath(attribute));
		}
		
		public void sendkey(WebElement element, String value) {
		element.sendKeys(value);
		}
		
		public void acceptA() {
		driver.switchTo().alert().accept();
		}
		
		public String gettextfromAlert() {
		String text= driver.switchTo().alert().getText();
		return text;
		}
		
		public void explicitwait(WebElement ele,int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(ele));
		}
		
		public  String[][] getValuefromExcel() throws Exception {
			XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\HP\\Eclipse workspace new\\BestBuy_Evaluation\\File\\signupdatas.xlsx");
			XSSFSheet sheet = book.getSheet("Sheet1");
			int rowcount = sheet.getLastRowNum(); 
			XSSFRow allrow = sheet.getRow(0);
			int colomncount = allrow.getLastCellNum();
			String[][] data = new String[rowcount][colomncount];	
			for (int i = 1; i <=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			System.out.println();
			for (int j = 0; j <colomncount ; j++) {
				XSSFCell cell = row.getCell(j);
				data [i-1][j]= cell.getStringCellValue();
		}
		}
			System.out.println("datas fetched Successfully");
			return data;
		}
		
		public void getValuefromExcelanothermethod() throws Exception {
			XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\HP\\Eclipse workspace new\\Pom\\pomdata.xlsx");
			XSSFSheet sheet = book.getSheet("Sheet1");
			XSSFRow row1 = sheet.getRow(0);
			int allRows = sheet.getPhysicalNumberOfRows();
			int allcells = row1.getPhysicalNumberOfCells();
			for (int i = 0; i < allRows; i++) {
				System.out.println();
				XSSFRow row = sheet.getRow(i);
			for (int j=0; j<allcells;j++) {
				XSSFCell cell2 = row.getCell(j);
			}
			}
			}
		
		public String takeScreenShot(String sreenshotname) throws Exception {
		String path = "C:\\Users\\HP\\Eclipse workspace new\\SpicejetEvaluation\\Screeenshots\\"+sreenshotname+".png";
		TakesScreenshot taksc =(TakesScreenshot)driver;
		File source = taksc.getScreenshotAs(OutputType.FILE);
		File destination =new File(path);
		FileUtils.copyFile(source, destination);	
		return path;
		}

		public void scrollDownpage() {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			for (int i = 0; i < 30; i++) {
				js.executeScript("window.scrollBy(0,43)");
			}
			

		}
		public void selectbyindex(WebElement element,int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		public void dropdownselectbyvalue(WebElement element,String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}

		public void clickusingjavascript(WebElement element) {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", element);

		}
		
		public void movetoelement(WebElement element ) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
		}
		public void dropdown(WebElement element,int value) {
			Select select = new Select(element);
			select.selectByIndex(value);
		}
		
		
		public void webdriverwait(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		public void scrolluppage() {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			for (int i = 0; i < 50; i++) {
				js.executeScript("window.scrollBy(0,-50)");
			}

		}
		public String filereader(String value) throws Exception {

			FileReader reader = new FileReader("C:\\Users\\HP\\Eclipse workspace new\\SpicejetEvaluation\\src\\test\\resources\\testData.properties");
			Properties prop = new Properties();
			prop.load(reader);
			String property = prop.getProperty(value);
			return property;
		}
		
		public void checkBrokenlink() {
		    WebDriver driver = new ChromeDriver();
	        driver.get("https://www.bestbuy.com/");
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                try {
	                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	                    connection.setRequestMethod("HEAD");
	                    connection.connect();
	                    int responseCode = connection.getResponseCode();
	                    if (responseCode >= 400) {
	                        System.out.println("Broken link : " + url + " - Response Code: " + responseCode);
	                    } else {
	                        System.out.println("Valid link: " + url);
	                    }
	               } catch (Exception e) {
	            	   System.out.println(url + " - " + "is a broken link");
	    }   
	    }
	    }
	        driver.close();
	    }
	
		
		
		}
