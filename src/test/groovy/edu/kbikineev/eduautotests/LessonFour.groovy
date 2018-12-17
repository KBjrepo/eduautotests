package edu.kbikineev.eduautotests

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement
import org.junit.Test

import static com.codeborne.selenide.Selenide.$

class LessonFour {
    static openYandex() {
        Selenide.open("https://ya.ru")
    }

    static search(String searchRequest) {
        def searchField = $("[name='text']")
        def searchButton = $(".search2__button")
        searchField.value = searchRequest
        searchButton.click()
    }

    @Test
    void calcTest() {
        openYandex()
        search("100/2=")
        assert calcResult == "50"
        clickCalcButton("C")
        clickCalcButton("5")
        clickCalcButton("−")
        clickCalcButton("2")
        clickCalcButton("=")
        assert calcResult == "3"
    }

    static clickCalcButton(String buttonName) {
        calcElement.$x(".//button[.='$buttonName']").click()

    }

    static String getCalcResult() {
        def resultField = $(".calculator-display__result")
        return resultField.getText()
    }

    static SelenideElement getCalcElement() {
        $(".calculator__wrapper")

    }
}