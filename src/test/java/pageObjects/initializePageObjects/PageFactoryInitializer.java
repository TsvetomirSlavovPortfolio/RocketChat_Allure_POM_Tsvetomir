/**
 * 
 */
package pageObjects.initializePageObjects;

import controllers.BrowserFactory;
import org.openqa.selenium.support.PageFactory;
import pageObjects.modules.GMailPageObjects;
import pageObjects.modules.GoogleHomePageObjects;
import pageObjects.modules.LoginPageObjects;

/**
 * @author ${Gladson Antony}
 * @date Sep 17, 2016
 * 
 */
public class PageFactoryInitializer extends BrowserFactory
{
	public GoogleHomePageObjects googleHomePage()
	{
		return PageFactory.initElements(driver, GoogleHomePageObjects.class);
	}

	public GMailPageObjects gmailPage()
	{
		return PageFactory.initElements(driver, GMailPageObjects.class);
	}

	public LoginPageObjects rocketChatLoginPage(){
		return PageFactory.initElements(driver, LoginPageObjects.class);
	}
	

}
