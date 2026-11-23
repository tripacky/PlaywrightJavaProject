package pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private Page page;
	//private final String timelink = "getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(\"Time\"))";
	//*[@id="app"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span
	
	private final String timelink = "oxd-text oxd-text--span oxd-main-menu-item--name";
	//constructor
		public HomePage(Page page)
		{
		  this.page=page;
		}
		
		public void clickTimeLink() {
			page.locator(timelink).click();
		}
		

}
