package steps;
import pages.CartPage;
import org.junit.*;
import io.qameta.allure.Step;
public class CartSteps {

    @Step("Проверили что покупки добавились в корзину")
    public void сheckBuys(){
        new CartPage().checkBuys();
    }

    @Step("Удалили все фотоаппараты из корзины")
    public void removeAllPhoto(){
        new CartPage().removeAllPhoto();
    }
    @Step("Удалили все телефоны из корзины")
    public void removeAllPhones(){
        new CartPage().removeAllPhones();
    }

    @Step("Проверили что корзина пуста")
    public void checkCart(){
        new CartPage().checkCart();
    }

}
