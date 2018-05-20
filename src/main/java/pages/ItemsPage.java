package pages;
import steps.BaseSteps;
import org.openqa.selenium.WebElement;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.*;
public class ItemsPage extends BasePage{

    @FindBy(xpath = "//div[@class='eFilterList_Content']//li/a")
    List<WebElement>brandsPhoto;

    @FindBy(xpath = "//div[@class='eFilterList_Content']//li/span")
    List<WebElement>brandsPhone;

    @FindBy(xpath = "//input[@class='eFromToInput_InputField mFrom']")
   WebElement priceFromInput;

    @FindBy(xpath = "//div[@style='display: inline-block;']")
    WebElement applyBtn;


    @FindBy(xpath = "//div[@class='bTilesModeShow clear_group']/div")
    List<WebElement> listOfItems;


    @FindBy(xpath = "//div[@class='bSaleBlockButton jsButton']")
    WebElement saleBtn;

    @FindBy(xpath = "//div[@class='eMyOzon_Item_Bottom']")
    WebElement cartBtn;


    @FindBy(xpath = "//h1[@itemprop='name']")
    WebElement itemName;



    public void selectBrandsPhoto(String name){
        for (WebElement item : brandsPhoto ){
            if (item.getText().startsWith(name)){
                item.click();
                return;
            }
        }
        org.junit.Assert.fail("Не найден элмент коллекции - " + name);
    }
    public void selectBrandsPhones(String name){
        for (WebElement item : brandsPhone ){
            if (item.getText().startsWith(name)){
                item.click();
                return;
            }
        }
        org.junit.Assert.fail("Не найден элмент коллекции - " + name);
    }

    public void setPriceFrom(String value){
        fillField(priceFromInput,value);
        wait.until(ExpectedConditions.visibilityOf(applyBtn));
        wait.until(ExpectedConditions.elementToBeClickable(applyBtn)).click();

    }


    public void selectOddItems(){
        for(int i=0;i<listOfItems.size();i++){
            wait.until(ExpectedConditions.visibilityOf(listOfItems.get(i)));
            wait.until(ExpectedConditions.elementToBeClickable(listOfItems.get(i)));
            if(i%2==0||i==0){
            listOfItems.get(i).click();
            wait.until(ExpectedConditions.visibilityOf(saleBtn));
            wait.until(ExpectedConditions.elementToBeClickable(saleBtn));
            if(saleBtn.isDisplayed()){
                steps.BaseSteps.itemsInCartlist.add(itemName.getText());
            }
            saleBtn.click();
            BaseSteps.getDriver().navigate().back();
            }
            else {
                continue;
            }
    }
   }

   public void gotoCart(){
       wait.until(ExpectedConditions.visibilityOf(cartBtn));
       wait.until(ExpectedConditions.elementToBeClickable(cartBtn));
       cartBtn.click();
   }











}
