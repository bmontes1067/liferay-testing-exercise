package liferay.form;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

/**
 * This class contains all the tests related to the Liferay form page home page.
 *
 * @author Belén Montes Amarillas
 */

public class MainPageTest {

    /**
     * Sets up the Allure tool (results of the tests can be represented after execution).
     */
    @BeforeClass
    public static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    /**
     * Sets up. Before each test method it performs three main operations:
     * - Selects firefox as browser to be employed in the tests.
     * - Set the browser configuration to start the tests with the windows maximized.
     * - Open the relevant website where the tests from this class are going to be performed.
     */
    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open(MainPage.URL);
    }
    /**
     * Tear down. After each test executed it closes the web driver (close the browser).
     */
    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @Test
    public void testSubmitForm(){
        MainPage.nameInput.sendKeys("Belen Montes");
        MainPage.datePickerButton.click();
        MainPage.todayDatePickerButton.waitUntil(visible,3600).click();
        MainPage.additionalInfoTextarea.sendKeys("This is a test");
        MainPage.submitButton.click();
        MainPage.formName.shouldBe(text("Information sent"));
        MainPage.formDescription.shouldBe(text("Information sent successfully!"));


    }

    @Test
    public void testChangeFormLanguage(){
        MainPage.languagePickerButton.click();
        MainPage.changeLanguageButton.waitUntil(visible, 3600).click();
        MainPage.formName.shouldHave(text("Este é um Liferay Forms"));
        MainPage.formDescription.shouldBe(text("E aqui temos a descrição do nosso forms"));
        MainPage.brazilNameInputLabel.shouldBe(visible);
        MainPage.brazilNameInputLabel.shouldBe(text("Qual é o seu nome?"));
        MainPage.brazilBirthInputLabel.shouldBe(text("Qual é a data do seu nascimento?"));
        MainPage.brazilAdditionalInfoTextareaLabel.shouldBe(text("Porque você ingressou na área de testes?"));
        MainPage.submitButton.shouldBe(text("Submeter"));
    }
}
