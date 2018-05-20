package steps;
import pages.MainPage;
import org.junit.*;
import io.qameta.allure.Step;
public class MainSteps {

    @Step("выбрали категорию  - {titleName}")
    public void getCategorie(String titleName){
        new MainPage().getCategorie(titleName);
    }
    @Step("Выбрали подкатегорию - {name}")
    public void getMenuItems(String name){
        new MainPage().getMenuItems(name);
    }

}
