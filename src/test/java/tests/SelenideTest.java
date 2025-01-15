package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @Test
public void testNameIsssue () {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");

        $(".search-input").click();
        $("#query-builder-test").sendKeys("JuliaOshmarina/Lesson8");
        $("#query-builder-test").submit();

        $(linkText("JuliaOshmarina/Lesson8")).click();
        $("#issues-tab").click();
        $("#issue_1_link").shouldHave(text("Lesson8"));

    }
}
