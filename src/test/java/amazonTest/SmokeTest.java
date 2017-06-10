package amazonTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utility.BaseMain;
import utility.WebUtility;

/**
 * Created by SOHAM on 08/06/2017.
 */
public class SmokeTest {
    BaseMain baseMain=new BaseMain();
    @Before
    public void setUp() throws Throwable {

        baseMain.openBrowser();
    }
    @After
    public void tearDown(){

        baseMain.closeBrowser();
    }

    @Test
    public void signInTest(){
        HomePage homePage=new HomePage();
        homePage.click_SignIn_Button();
        WebUtility.sleepTime(3000);
    }
}
