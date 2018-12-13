package edu.kbikineev.eduautotests

import org.junit.Test
import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.*
import static com.codeborne.selenide.Condition.*



class DogsSearch {
    @Test
    public void debugTst() {
        def searchRequest = "Dog"

        open("https://yandex.ru/")
        def searchInput = $(By.name("text"))
        searchInput.value = searchRequest
        searchInput.pressEnter()

        def found = $$(By.xpath(".//*[text()='Dog']/.."))
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)
    }
}
