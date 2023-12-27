package github;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class demoqatest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000; // default 4000
    }

    @Test
    void FillFormTest() {
        open("/automation-practice-form");
        $("id=firstName").setValue("Sadam");
        $("id=lastName").setValue("Husein");
        $("id=userEmail").setValue("SlavaRodu@mail.ru");
        $("id=gender-radio-1").selectOptionByValue("Male");
        $("dateOfBirthInput").setValue("28.12.2023");
        $("id=subjectsContainer").setValue("FireWorks");
        $("id=hobbies-checkbox-1").setValue("1");
        $("type=file").uploadFile(new File("C:/Users/1111/Downloads/file"));
        $("id=currentAddress").setValue("Iloveiraq 228");
        $("class= css-1uccc91-singleValue").setValue("Rajastanhan");
    }



}



