package tests;

import controllers.ExcelDataProvider;
import org.testng.annotations.Test;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import pageObjects.modules.LoginPageObjects;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Parameter;
import ru.yandex.qatools.allure.annotations.TestCaseId;

/**
 * Created by cccce on 09/03/2017.
 */
public class LoginTests extends PageFactoryInitializer{


    @TestCaseId("TC_RocketChatLogin_001")
    @Description("To verify the login with valid credentials")
    @Test(dataProvider="excelSheetNameAsMethodName", dataProviderClass= ExcelDataProvider.class)
    public void login(@Parameter("TestCaseID")String TestCaseID, @Parameter("UserName")String UserName,@Parameter("Password") String Password)
            throws Exception
    {

//        LoginPageObjects loginPageObjects = PageFactoryInitializer.rocketChatLoginPage();
//        loginPageObjects.login();

        rocketChatLoginPage().login();


    }


}
