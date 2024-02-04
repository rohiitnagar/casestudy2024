package Test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import POM.loginpages1;
import Utils.DriverUtils;

public class loginTestng {
	 @Test
		public void verifyLogin() throws InterruptedException{
			DriverUtils.getDriver().get("https://webdriveruniversity.com/Login-Portal/index.html");
			Thread.sleep(2000);
			loginpages1 lp = new loginpages1();
			Thread.sleep(5000);
			lp.enterUsername("Rphoti");
			lp.enterPassword("ffgg");
//			lp.enterUsername(ExcelData.getdata("C:\\Users\\hp\\eclipse-workspace\\DemoProject\\src\\test\\resources\\Ussername.xlsx","Sheet1", 0, 0));
//			Thread.sleep(5000);
			//lp.enterPassword(ExcelData.getdata("C:\\Users\\hp\\eclipse-workspace\\DemoProject\\src\\test\\resources\\Ussername.xlsx","Sheet1", 0, 1));
			Thread.sleep(2000);
			lp.PortalLogin();
			Thread.sleep(2000);
			Alert a = DriverUtils.getDriver().switchTo().alert();
			System.out.println(a.getText());
			Thread.sleep(2000);
			a.accept();
			
		}
}
