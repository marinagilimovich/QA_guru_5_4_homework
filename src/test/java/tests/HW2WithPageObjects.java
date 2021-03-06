package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HW2WithPageObjects {
    FormPage formPage = new FormPage();
    PopupWithFilledData popupWithFilledData = new PopupWithFilledData();

    @Test
    void FillingFieldsTests() {
        formPage.openSearchPage();
        formPage.fillForm();
        popupWithFilledData.checkData();
    }

}
