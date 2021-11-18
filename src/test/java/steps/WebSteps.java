package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step
    public void openMainPage() {
        open("https://github.com");
    }

    @Step
    public void findRepository(String value) {
        $("[name=q]").setValue(value).pressEnter();
    }

    @Step
    public void goToRepository(String value) {
        $(byPartialLinkText(value)).click();
    }

    @Step
    public void checkIssueTabIsVisible(String value) {
        $(byPartialLinkText(value)).shouldBe(visible);

    }
}
