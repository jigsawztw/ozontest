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
    public void removeAllPhoto() {
        for(int i=0;i<2;i++) {
            wait.until(ExpectedConditions.visibilityOfAllElements(info));
            List<WebElement> elements = BaseSteps.getDriver().findElements(By.xpath("//div[@class='eCartControls_buttons']/div"));
            wait.until(ExpectedConditions.visibilityOfAllElements(elements));
            elements.get(0).click();
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e){}
        }
    }
    public void removeAllPhones() {
       BaseSteps.getDriver().findElement(By.xpath("//div[@class='eCartControls_buttons']/div")).click();
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
