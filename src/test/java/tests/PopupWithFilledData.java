package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PopupWithFilledData {
    FakerData fakerData = FakerData.sharedInstance();

    String firstName = fakerData.firstName,
            lastName = fakerData.lastName,
            emailAddress = fakerData.emailAddress,
            userNumber = fakerData.phoneNumber,
            gender = fakerData.gender,
            dateOfBirth = "03",
            monthOfBirth = "May",
            yearOfBirth = "1964",
            subject = "Chemistry",
            hobby = "Music",
            picture = "1.png",
            currentAddress = fakerData.currentAddress,
            state = "Haryana",
            city = "Karnal";


    void checkData() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName + ' ' + lastName), text(emailAddress), text(gender),
                text(userNumber), text(dateOfBirth + ' ' + monthOfBirth + ',' + yearOfBirth), text(subject),
                text(hobby), text(picture), text(currentAddress), text(state + " " + city));
    }
}
