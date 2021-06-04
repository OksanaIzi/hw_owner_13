package tests;

import config.TestDataConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class GitGubTests extends TestBase {

    TestDataConfig config = ConfigFactory.create(TestDataConfig.class, System.getProperties());

    @Test
    public void openGitHubPageTest() {
        open(config.getBaseUrl());
        step("Check title", () -> {
            $(".font-mktg").shouldHave(text(" Where the world builds software "));
        });
    }
}
