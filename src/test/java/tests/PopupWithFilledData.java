package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PopupWithFilledData {
    String firstName = "Migde",
            lastName = "Maisel",
            userEmail = "midgeme123@gmail.com",
            userNumber = "0123456789",
            gender = "Female",
            dateOfBirth = "03",
            monthOfBirth = "May",
            yearOfBirth = "1964",
            subject = "Chemistry",
            hobby = "Music",
            picture = "1.png",
            currentAddress = "10 Main str.",
            state = "Haryana",
            city = "Karnal";


    void checkData() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName + ' ' + lastName), text(userEmail), text(gender),
                text(userNumber), text(dateOfBirth + ' ' + monthOfBirth + ',' + yearOfBirth), text(subject),
                text(hobby), text(picture), text(currentAddress), text(state + " " + city));
    }

}
