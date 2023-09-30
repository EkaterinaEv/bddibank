package ru.netology.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.val;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.awt.SystemColor.text;

public class DashboardPage {
    private SelenideElement header = $("[data-test-id=dashboard]");

    public DashboardPage(){
        header.shouldBe(visible);
    }
//    // к сожалению, разработчики не дали нам удобного селектора, поэтому так
//    private ElementsCollection cards = $$(".list__item div");
//    private final String balanceStart = "баланс: ";
//    private final String balanceFinish = " р.";
//
//    public Dashboard() {
//    }
//
//    public int getCardBalance(String id) {
//         TODO: перебрать все карты и найти по атрибуту data-test-id
//        return extractBalance(text);
//    }
//
//    private int extractBalance(String text) {
//        val start = text.indexOf(balanceStart);
//        val finish = text.indexOf(balanceFinish);
//        val value = text.substring(start + balanceStart.length(), finish);
//        return Integer.parseInt(value);
//    }
}