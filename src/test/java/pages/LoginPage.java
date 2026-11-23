package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	private final String usernameTextbox="input[name = 'username']";
	private final String passwordTextbox ="input[name='password']";
	private final String loginbutton = "button[type='submit']";
	
	//constructor
	public LoginPage(Page page)
	{
	  this.page=page;
	}
	public void addusername(String username)
	{
		page.fill(usernameTextbox, username);
	}
	public void addpassword(String password)
	{
		page.fill(passwordTextbox, password);
	}
	public void clickLoginButton()
	{
		page.click(loginbutton);
	}
}
