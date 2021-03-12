package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EmployeePage {
    @FindBy(how = How.ID, using = "name")
    private WebElement nameText;
    @FindBy(how = How.ID, using = "surname")
    private WebElement surnameText;
    @FindBy(how = How.ID, using = "job")
    private WebElement jobText;
    @FindBy(how = How.ID, using = "dob")
    private WebElement dataEnterText;
    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    private List<WebElement> checkBoxes;
    @FindBy(how = How.XPATH, using = "//checkbox[@id='english']")
    private WebElement selectedEnglish;
    @FindBy(how = How.XPATH, using = "//checkbox[@id='french']")
    private WebElement selectedFrench;
    @FindBy(how = How.ID, using = "spanish")
    private WebElement selectedSpanish;
    @FindBy(how = How.XPATH, using = "//input[@type='radio']")
    private List<WebElement> radioBtns;
    @FindBy(how = How.CSS, using = "#male")
    public WebElement selectedMale;
    @FindBy(how = How.CSS, using = "#female")
    private WebElement selectedFemale;
    @FindBy(how = How.ID, using = "status")
    private WebElement dropdownStatus;
    @FindBy(how = How.XPATH, using = "//option[text()='Employee']")
    private WebElement selectedOptionEmployee;
    @FindBy(how = How.XPATH, using = "//option[text()='Intern']")
    private WebElement selectedOptionIntern;
    @FindBy(how = How.XPATH, using = "//option[text()='Contractor']")
    private WebElement selectedOptionContractor;

    public String employeePageURL = "https://kristinek.github.io/site/tasks/list_of_people";

    @FindBy(how = How.ID, using = "addPersonBtn")
    private WebElement addPersonBtn;

    @FindBy(how = How.XPATH, using = "//*[@id='modal_button'][text()='Add']")
    private WebElement addBtn;
    @FindBy(how = How.CSS, using = "#person3 > span:nth-child(2) > i")
    private WebElement editBtn;
    @FindBy(how = How.XPATH, using = "//*[@id='modal_button'][text()='Edit']")
    private WebElement otherEditBtn;
    @FindBy(how = How.CSS, using = "#person3 > span:nth-child(1)")
    private WebElement removeBtn;
    @FindBy(how = How.CSS, using = "button.w3-btn:nth-child(3)")
    private WebElement resetBtn;
    @FindBy(how = How.ID, using = "addPersonBtn")
    private WebElement clearAllFieldsBtn;

    public void enterName(String name) {
        nameText.clear();
        nameText.sendKeys(name);
    }

    public String getName(){
        return nameText.getText();
    }

    public void enterSurname(String surname) {
        surnameText.clear();
        surnameText.sendKeys(surname);
    }

    public String getSurname(){
        return surnameText.getText();
    }

    public void enterJob(String job) {
        jobText.clear();
        jobText.sendKeys(job);
    }

    public String getJob(){
        return jobText.getText();
    }

    public void enterDataEnter(String DataEnter) {
        dataEnterText.clear();
        dataEnterText.sendKeys(DataEnter);
        dataEnterText.sendKeys("\n");
    }

    public String getDataEnter(){
        return dataEnterText.getText();
    }

    public void selectEnglishOption(){selectedEnglish.click();}
    public void selectFrenchOption(){selectedFrench.click();}
    public void selectSpanishOption(){selectedSpanish.click();}
    public boolean verifyCheckBoxIsSelected(int index)
    {
        return checkBoxes.get(index).isSelected();
    }
    public boolean verifyRadioButtonIsSelected(int index)
    {
        return radioBtns.get(index).isSelected();
    }
    public void selectMaleGender(){selectedMale.click();}
    public void selectFemaleGender(){selectedFemale.click();}

    public String getSelectedOption()
    {
        Select dropdown  = new Select(dropdownStatus);
        return dropdown.getFirstSelectedOption().getText();
    }

    public void selectStatusEmployee(){selectedOptionEmployee.click();}
    public void selectStatusIntern(){selectedOptionIntern.click();}
    public void selectStatusContractor(){selectedOptionContractor.click();}

    public void clickOnAddPersonBtn() {
        addPersonBtn.click();
    }

    public void clickAddBtn() {
        addBtn.click();
    }

    public void clickEditBtn() {
        editBtn.click();
    }

    public void clickEditOtherBtn() {
        otherEditBtn.click();
    }

    public void clickOnRemoveAPerson() {
        removeBtn.click();
    }

    public void clickOnResetListBtn() {
        resetBtn.click();
    }

    public void clickOnClearAllFieldsBtn() {
        clearAllFieldsBtn.click();}


}

