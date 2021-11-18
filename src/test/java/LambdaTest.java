import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTest {

    private static final String REPOSITORY = "selenide";
    private static final String TABNAME = "Issues";

    @Test
    void tabShouldBeVisible() {

        step("Open main page", () -> {
            open("https://github.com");
                });

        step("Find repository " + REPOSITORY, () -> {
            $("[name=q]").setValue(REPOSITORY).pressEnter();
                });

        step("Go to repository " + REPOSITORY, () -> {
            $(byPartialLinkText(REPOSITORY)).click();
                }
        );

        step("Check " + TABNAME + " is visible", () -> {
            $(byPartialLinkText(TABNAME)).shouldBe(visible);
                }
        );
    }

}

