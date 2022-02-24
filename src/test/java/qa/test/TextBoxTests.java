package qa.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void fillForm() {
        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("Albina");
        $("#userEmail").setValue("albina.t@rahmetapp.kz");
        $("#currentAddress").setValue("Bayzakova");
        $("#permanentAddress").setValue("Tole Bi");
        $("#submit").click();

        $("#output #name").shouldHave(text("Albina"));
        $("#output").$("#email").shouldHave(text("albina.t@rahmetapp.kz"));
        $("#output").$("#currentAddress").shouldHave(text("Bayzakova"));
        $("#output").$("#permanentAddress").shouldHave(text("Tole Bi"));

  //      $("#output").shouldHave(text("Albina"), text("albina.t@rahmetapp.kz"),
        //              text("Bayzakova"), text("Tole Bi"));




    }

}
