import com.codeborne.selenide.*;
import com.codeborne.selenide.junit.ScreenShooter;
import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.swing.text.Element;

import java.io.File;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;


public class TestMarket {
    @Test
    public void logIn() throws InterruptedException {
        Configuration.browser = "chrome";
        open("http://market.test2.local");
        SelenideElement username = $("#username").shouldBe(visible).setValue("Notus");
        SelenideElement password = $("#password").shouldNot(disappear).setValue("123qweqwe");
        SelenideElement submitButton = $(By.xpath("//button[contains (@class, 'btn-link-sign')]"));
        submitButton.click();
        Thread.sleep(5000);
        SelenideElement diagram = $(".rz-sellerorder-diagram-block").shouldBe(visible);
        ElementsCollection viewall = $$(".novisited").filterBy(text("Посмотреть все"));
        viewall.get(0).click();
        Thread.sleep(5000);
        SelenideElement h2 = $(byText("В обработке")).shouldBe(visible);
    }

    /*@Test
    public void uploudFile() throws InterruptedException {
        Configuration.browser = "chrome";
        open("http://market.test2.local/main/items/goods");
        File file = $(".input-file").uploadFile(new File((System.getProperty("user.dir") + "\\hello_world.txt")));
        Thread.sleep(5000);
    }*/
    /*@Test
    public void uploudFile() throws InterruptedException {
        Configuration.browser = "chrome";
        open("http://fex.net");
        SelenideElement sendfilesbutton = $(By.xpath("//div[contains (@class, 'main_menu_create')]")).shouldBe(visible);
        sendfilesbutton.click();
        //SelenideElement addfiles = $(By.id("upload")).shouldBe(visible);


        File file = $(By.id("upload")).uploadFile(new File((System.getProperty("user.dir") + "\\hello_world.txt")));
        Thread.sleep(5000);
    }*/
}
