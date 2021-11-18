import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.WebSteps;

public class AnnotationTest {

    private static final String REPOSITORY = "selenide";
    private static final String TABNAME = "Issues";


    private WebSteps steps = new WebSteps();

    @Test
    @DisplayName("Test name")
    @Owner("Lerik")
    public void tabShouldBeVisible() {
        steps.openMainPage();
        steps.findRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.checkIssueTabIsVisible(TABNAME);

    }
}
