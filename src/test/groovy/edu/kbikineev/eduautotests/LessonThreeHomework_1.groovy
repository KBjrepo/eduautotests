package edu.kbikineev.eduautotests

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide
import org.junit.Test

import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$x

class LessonThreeHomework_1 {
    @Test
    void regionChange() {
        Selenide.open("http://litecart.stqa.ru/en/")

        def changeButton = $(".fancybox-region")
        def countryField = $("[name='country_code']")
        def zoneField = $x("//select[@name='zone_code']")

        changeButton.click()

        def foundRegionChangeWindow = $("#fancybox-content")

        foundRegionChangeWindow.shouldBe(Condition.visible)

        countryField.selectOptionContainingText("United States")
        zoneField.selectOptionContainingText("Florida")


    }
}
