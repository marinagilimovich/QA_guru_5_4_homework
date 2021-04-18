package tests;

import com.github.javafaker.Faker;

public class FakerData {
    private static FakerData instance;

    private Faker faker;
    String firstName;
    String lastName;
    String emailAddress;
    String phoneNumber;
    String gender;
    String currentAddress;

    public static FakerData sharedInstance() {
        if (instance == null) {
            instance = new FakerData();
        }
        return instance;
    }

    private FakerData() {
        this.faker = new Faker();
        this.firstName = this.faker.name().firstName();
        this.lastName = this.faker.name().lastName();
        this.emailAddress = this.faker.internet().emailAddress();
        this.phoneNumber = this.faker.number().digits(10);
        this.gender = this.faker.demographic().sex();
        this.currentAddress = this.faker.address().fullAddress();
    }
}
