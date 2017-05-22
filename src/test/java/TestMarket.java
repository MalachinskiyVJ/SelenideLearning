import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import javax.swing.text.Element;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TestMarket {
    @Test
    public void logIn() {
        Configuration.browser = "chrome";
        open("http://market.test2.local");
        SelenideElement username = $("#username").shouldBe(visible).setValue("Notus");
        SelenideElement password = $("#password").shouldNot(disappear).setValue("123qweqwe");
        SelenideElement submitButton = $(".btn-link-i");
        submitButton.click();
    }

}
