package ru.netology.test;

import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MoneyTransferTest {
    @Test
    void shouldTransferMoneyBetweenOwnCards(){
        open("http://localhost:9999/");

        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        loginPage.validLogin(authInfo);

        $("[data-test-id=code] input").shouldBe(visible);
    }
}