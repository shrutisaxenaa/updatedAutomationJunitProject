package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Page1;
import util.BrowserFactory;

////input[@type='checkbox' and @name='todo[1]']

public class Page1_Test {
	
	WebDriver driver;
	@Test
	public void validateTheCheckBox() throws InterruptedException {
		driver=BrowserFactory.init();
		
		Page1 pg= PageFactory.initElements(driver, Page1.class);
		
		
		pg.insertDataInCheckBox("Junit");
		pg.clickCheckBoxButton();
		pg.clickToggleAllBox();
		pg.validationOfCheckedBox();
		pg.clickCheckBox1();
		pg.removeCheckedBox();
		pg.validationOfRemoveButton1();
		pg.removeAllCheckedBoxes();
		pg.validationOfRemoveButton2();
		
		BrowserFactory.TearDown();
	}
	
}
