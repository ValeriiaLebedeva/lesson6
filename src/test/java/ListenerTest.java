import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ListenerTest {

    private static final String REPOSITORY = "selenide";

    @Test
    public void issuesTabShouldBeVisible() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $("[name=q]").setValue(REPOSITORY).pressEnter();

        $(byPartialLinkText(REPOSITORY)).click();

        $(byPartialLinkText("Issues")).shouldBe(visible);

    }

}
