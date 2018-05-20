package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import  org.junit.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
public class BasePage {
    static WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 10);
    public BasePage()
    {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }





    public void selectCollectionItem(String itemName, List<WebElement> collection){
        for (WebElement item : collection ) {
            wait.until(ExpectedConditions.visibilityOf(item));
            wait.until(ExpectedConditions.elementToBeClickable(item));
            if (item.getText().trim().equalsIgnoreCase(itemName)) {
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элемент коллеции - " + itemName);
    }

    public void fillField(WebElement element, String value)  {
        element.clear();
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }

}
