package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import  org.junit.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.*;
public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class='bHeaderCategoryLinks ']/a")
    List<WebElement> categories;

    @FindBy(xpath = "//div[@class='eLeftMainMenu_ElementsBlock']/a")
    List<WebElement> leftMenuItems;

    @FindBy(xpath = "//div[@class='close-icon eDYbanner_close jsCloseBanner']")
    WebElement popUpBtn;




    public void getCategorie(String name){
        try{
            popUpBtn.click();
        }
        catch (Exception e){}
        finally {
            selectCollectionItem(name, categories);
        }
    }
    public void getMenuItems(String name){
        selectCollectionItem(name, leftMenuItems);
    }


}
