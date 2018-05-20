package steps;
import pages.ItemsPage;
import org.junit.*;
import io.qameta.allure.Step;
public class ItemsSteps {

    @Step("Выбрали бренд Фотоаппаратов -  {name}")
    public void selectBrandsPhoto(String name){
        new ItemsPage().selectBrandsPhoto(name);
    }
    @Step("Выбрали бренд телефонов -  {name}")
    public void selectBrandsPhones(String name){
        new ItemsPage().selectBrandsPhones(name);
    }
    @Step("Установили нижний порог цены - {value}")
    public void setPriceFrom(String value){
        new ItemsPage().setPriceFrom(value);
    }
    @Step("Выбрали все нечетные товары и добавили в корзину")
    public void selectOddItems(){
        new ItemsPage().selectOddItems();
    }
    @Step("Перешли в корзину")
    public void goToCart(){
        new ItemsPage().gotoCart();
    }

}
