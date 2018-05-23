package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    ItemsSteps itemsSteps = new ItemsSteps();
    CartSteps cartSteps = new CartSteps();

    @When("^Выбрали категорию меню -  \"(.+)\"$")
    public void getCategorie(String name){
        mainSteps.getCategorie(name);
    }
    @When("^Выбрали подкатегорию -  \"(.+)\"$")
    public void getMenuItems(String name){
        mainSteps.getMenuItems(name);
    }

    @Then("^Выбрали бренд фотоаппаратов -  \"(.+)\"$")
    public void selectBrandsPhoto(String name){
        itemsSteps.selectBrandsPhoto(name);
    }

    @Then("^Выбрали бренд телефонов -  \"(.+)\"$")
    public void selectBrandsPhones(String name){
        itemsSteps.selectBrandsPhones(name);
    }

    @Then("^Установили нижний предел цены -  \"(.+)\"$")
    public void setPriceFrom(String value){
        itemsSteps.setPriceFrom(value);
    }
    @Then("Добавили все нечетные элементы в корзину")
    public void selectOddItems(){
        itemsSteps.selectOddItems();
    }
    @Then("Перешли в корзину")
    public void goToCart(){
        itemsSteps.goToCart();
    }
    @Then("Проверили что покупки добавились в корзину")
    public void checkBuys(){
       cartSteps.сheckBuys();
    }
    @Then("Удалили все из корзины")
    public void removeAll(){
        cartSteps.removeAll();
    }
    @Then("Проверили что корзина пуста")
    public void checkCart(){
        cartSteps.checkCart();
    }

}
