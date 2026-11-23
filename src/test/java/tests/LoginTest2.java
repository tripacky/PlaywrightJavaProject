package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void test() {
		
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);
		
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginpage.addusername("Admin");
		loginpage.addpassword("admin123");
		loginpage.clickLoginButton();
		homepage.clickTimeLink();
		
	//	page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
		//	page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).press("Tab");
		//	page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin");
		//		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("CapsLock");
		//		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
		//		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		//		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

}
