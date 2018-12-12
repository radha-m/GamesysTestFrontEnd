package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Radha on 10/12/2018.
 */
public class HomePage {


    public HomePage(WebDriver driver) {
          PageFactory.initElements(driver, this);

    }
        @FindBy(how = How.XPATH , using = "//a[@title='Login']")
        public WebElement login_btn;

       public void login_click()
       {
           login_btn.click();
       }

}


