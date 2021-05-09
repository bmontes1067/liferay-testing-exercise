package liferay.form;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

/**
 * The class represents all the web items from the Liferay form page.
 *
 * @author Belén Montes Amarillas
 */
public class MainPage {

    /**
     * The Url.
     */
    public static final String URL = "https://forms.liferay.com/web/forms/shared/-/form/122548";

    /**
     * The language picker
     */
    public static final SelenideElement languagePickerButton = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[1]/div/div/div/button"));

    /**
     * The USA/Brazil option on the language picker
     */

    public static final SelenideElement changeLanguageButton = $(byXpath("/html/body/div[1]/div/div/div/ul/li/a"));

    /**
     * The form name.
     */
    public static final SelenideElement formName = $(byClassName("ddm-form-name"));

    /**
     * The description field.
     */
    public static final SelenideElement formDescription = $(byClassName("ddm-form-description"));

    /**
     * The form page title
     */
    public static final SelenideElement formPageTitle = $(byClassName("lfr-ddm-form-page-title"));

    /**
     * The form page description
     */
    public static final SelenideElement formPageDescription = $(byClassName("lfr-ddm-form-page-description"));

    /**
     * The required fields annotation
     * Note: the id related to this element is dynamic so that I decided to use the full xpath
     */
    public static final SelenideElement requiredFields = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/p"));

    /**
     * The label for Name input field
     */
    public static final SelenideElement usaNameInputLabel = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div/div/label"));
    public static final SelenideElement brazilNameInputLabel = $(byXpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div/div/label"));

    /**
     * The Name input field
     */
    public static final SelenideElement nameInput = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div/div/input"));

    /**
     * The label for Birth input field
     */
    public static final SelenideElement usaBirthInputLabel = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/div/label"));
    public static final SelenideElement brazilBirthInputLabel = $(byXpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/div/label"));

    /**
     * The Birth input field
     */
    public static final SelenideElement birthInput = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/input[2]"));

    /**
     * The date picker button
     */
    public static final SelenideElement datePickerButton = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div/div/div/button"));

    /**
     * The today button (date picker)
     */
    public static final SelenideElement todayDatePickerButton= $(byXpath("/html/body/div[3]/div/div/div/div[1]/div/div[3]/button[2]"));

    /**
     * The label for additionalInfo textarea field
     */
    public static final SelenideElement usaAdditionalInfoTextareaLabel = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/label"));
    public static final SelenideElement brazilAdditionalInfoTextareaLabel = $(byXpath("/html/body/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/label"));

    /**
     * The additionalInfo textarea field
     */
    public static final SelenideElement additionalInfoTextarea = $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/div[3]/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/textarea"));

    /**
     * The Submit button
     */
    public static final SelenideElement submitButton = $(byId("ddm-form-submit"));

    private MainPage() {
        throw new IllegalStateException("MainPage class");
    }


}
