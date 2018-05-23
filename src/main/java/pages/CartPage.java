package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import steps.BaseSteps;
import  org.junit.*;
import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.support.ui.*;
public class CartPage  extends BasePage{
    @FindBy(xpath = "//span[@class='eCartItem_nameValue']")
    List<WebElement> buysList;
    @FindBy(xpath = "//div[@class='eCartControls_infoDate']")
    List<WebElement> info;

    @FindBy(xpath = "//*[text()='Удалить всё']/..")
    WebElement clearAllButton;

    @FindBy(xpath = "//*[@id=\"PageCenter\"]/div[2]/div[3]/div[1]/div[1]/div/div/span")
    WebElement cartTitle;


    public void checkBuys(){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(info));
      for(WebElement item : buysList){
          if(steps.BaseSteps.itemsInCartlist.contains(item.getText())){
              continue;
          }
          else{
              Assert.fail("Элемент "+item.getText()+" не найден");
          }
      }
    }

    public void removeAll(){
        wait.until(ExpectedConditions.visibilityOfAllElements(info));
        while (isElementPresent(By.xpath("//*[text()='Удалить всё']"))){
            Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(clearAllButton)).click();
            BaseSteps.getDriver().navigate().refresh();
            wait.until(ExpectedConditions.visibilityOfAllElements(info));
        }
    }



    public void checkCart() {
        wait.until(ExpectedConditions.textToBePresentInElement(By.className("jsInnerContentpage_title"),"Корзина пуста"));
        if(cartTitle.getText().trim().equalsIgnoreCase("Корзина пуста")){
            return;
        }
        else{
            Assert.fail("Корзина не пуста!");
        }
    }

}
