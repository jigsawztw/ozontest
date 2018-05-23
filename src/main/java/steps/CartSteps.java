package steps;
import pages.CartPage;
import org.junit.*;
import io.qameta.allure.Step;
public class CartSteps {

    @Step("Проверили что покупки добавились в корзину")
    public void сheckBuys(){
        new CartPage().checkBuys();
    }

    @Step("Удалили все из корзины")
    public void removeAll(){
        new CartPage().removeAll();
    }

    @Step("Проверили что корзина пуста")
    public void checkCart(){
        new CartPage().checkCart();
    }

}
