package edu.kbikineev.eduautotests

import com.codeborne.selenide.Selenide
import org.junit.Test
import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.$$

class LessonThreeHomework_2 {
    @Test
    void notSailItemChange() {
        Selenide.open("http://litecart.stqa.ru/en/acme-corp-m-1/")

        def foundItems = $$(".product")

        foundItems.each {
            def notSailItem = foundItems.remove(By.cssSelector("//div[contains(@class,'sticker sale')]/../../.."))

            println(notSailItem)
        }
    }
}
