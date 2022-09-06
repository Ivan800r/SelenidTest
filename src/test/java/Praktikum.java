import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.internal.WrapsElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;

public class Praktikum {

    @Test
    public void test() {
        open("https://qa-mesto.praktikum-services.ru/");
        $(byId("email")).setValue("testik285555@gmail.com");
        $(byId("password")).setValue("123");
        $(byCssSelector(".profile__image")).click();
        $(byId("owner-avatar")).setValue("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/avatarSelenide.png");
        $(byXpath("//form[@name='edit-avatar']//*[text()='Сохранить']")).click();
    }

    @Test
        public void test1() {
            // создай драйвер для браузера Chrome
            // перейди на страницу тестового стенда
            open("https://qa-mesto.praktikum-services.ru/");
            // выполни авторизацию
            $(byId("email")).setValue("testik285555@gmail.com");
            $(byId("password")).setValue("123");
            $(byClassName("auth-form__button")).click();
            // кликни по изображению профиля
            $(byClassName("profile__add-button")).click();
            $(byName("name")).setValue("Москва");
            // в поле ссылки на изображение введи ссылку
            $(byId("place-link")).setValue("https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenium.jpg");
            // сохрани новое изображение
            $(byXpath(".//form[@name='new-card']/button[text()='Сохранить']")).shouldBe(visible).click();
            $(byXpath(".//button[@class='card__delete-button card__delete-button_visible']")).click();
            // закрой браузер
        }
    @Test
    public void test3() {

        // создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-mesto.praktikum-services.ru/");
        // выполни авторизацию
        $(byId("email")).setValue("testik285555@gmail.com");
        $(byId("password")).setValue("123");
        $(byClassName("auth-form__button")).click();
        // кликни по кнопке редактирования профиля
        $(byClassName("profile__edit-button")).click();
        // введи «Аристарх Сократович» в поле «Имя»
        $(byId("owner-name")).setValue("Аристарх Сократович");
        // введи «Автор автотестов» в поле «Занятие»
        $(byId("owner-description")).setValue("Автор автотестов");
        // сохрани изменения
        $(byXpath(".//form[@name='edit']/button[text()='Сохранить']")).click();
    }
    @Test
    public void test4() {

        // создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-mesto.praktikum-services.ru/");
        // выполни авторизацию
        $(byId("email")).setValue("testik285555@gmail.com");
        $(byId("password")).setValue("123");
        $(byClassName("auth-form__button")).click();
        String cardText = $$(byClassName("card")).get(2).find(byClassName("card__title")).getText();
        System.out.println(cardText);

    }
}

