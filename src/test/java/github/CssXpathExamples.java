package github;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CssXpathExamples {
    void cssXpathExamples() {
        //<input autocomplete="off" pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$" placeholder="name@example.com" type="text" id="userEmail" class="mr-sm-2 form-control">
        $("[id=userEmail]").setValue("some text");


    }

}