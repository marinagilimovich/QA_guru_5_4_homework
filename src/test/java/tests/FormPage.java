package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormPage {
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
            currentAddress = faker.address().fullAddress(),
            state = "Haryana",
            city = "Karnal";

    void openSearchPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }

    void fillForm() {
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(emailAddress);
        $(byText(gender)).click();
        $("#userNumber").setValue(userNumber);
        setBirthDate();
        $("#hobbiesWrapper").$(byText(hobby)).click();
        $("#uploadPicture").uploadFromClasspath("img/" + picture);
        $("#currentAddress").setValue(currentAddress);
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#submit").scrollTo().click();
    }

    void setBirthDate() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(monthOfBirth);
        $(".react-datepicker__year-select").selectOption(yearOfBirth);
        $(".react-datepicker__day--0" + dateOfBirth + ":not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue(subject).pressEnter();
    }

}
