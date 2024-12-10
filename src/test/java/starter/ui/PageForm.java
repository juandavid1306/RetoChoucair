package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PageForm {
    public static Target BUTTON_RECRUITMENT = Target.the("recruitment button").locatedBy("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]");
    public static Target BUTTON_ADD = Target.the("add button").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    public static Target INPUT_FIRST_NAME = Target.the("input first name").locatedBy("//input[@placeholder='First Name']");
    public static Target INPUT_MIDDLE_NAME = Target.the("input middle name").locatedBy("//input[@placeholder='Middle Name']");
    public static Target INPUT_LAST_NAME = Target.the("input last name").locatedBy("//input[@placeholder='Last Name']");
    public static Target VACANCY_DROPDOWN = Target.the("vacancy dropdown").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    public static Target VACANCY_DROPDOWN_OPTION = Target.the("vacancy dropdown option").locatedBy("//span[contains(text(),'test')]");
    public static Target INPUT_EMAIL = Target.the("input email").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public static Target INPUT_CONTACT_NUMBER = Target.the("input contact number").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]");
    public static Target INPUT_KEYWORDS = Target.the("input keywords").locatedBy("//input[@placeholder='Enter comma seperated words...']");
    public static Target INPUT_NOTES = Target.the("input notes").locatedBy("//textarea[@placeholder='Type here']");
    public static Target RADIOBUTTON_CONSENT = Target.the("radio button consent").locatedBy("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    public static Target SAVE_BUTTON = Target.the("save button").locatedBy("//button[@type='submit']");
    public static Target SHORTLIST_BUTTON = Target.the("shortlist button").locatedBy("//button[normalize-space()='Shortlist']");
    public static Target SCHEDULE_INTERVIEW_BUTTON = Target.the("schedule interview button").locatedBy("//button[normalize-space()='Schedule Interview']");
    public static Target INPUT_INTERVIEW_TITLE = Target.the("input interview title").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public static Target INPUT_INTERVIEWER = Target.the("input interviewer").locatedBy("//input[@placeholder='Type for hints...']");
    public static Target INPUT_INTERVIEWER_OPTION = Target.the("input interviewer option").locatedBy("//span[contains(text(),'Butler')]");
    public static Target INPUT_DATE = Target.the("input date").locatedBy("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]");
    public static Target INPUT_DATE_OPTION = Target.the("input date option").locatedBy("//div[contains(text(),'13')]");
    public static Target INPUT_TIME = Target.the("input time").locatedBy("//input[@placeholder='hh:mm']");
    public static Target MARK_INTERVIEW_PASSED_BUTTON = Target.the("mark interview passed button").locatedBy("//button[normalize-space()='Mark Interview Passed']");
    public static Target OFFER_JOB_BUTTON = Target.the("offer job button").locatedBy("//button[normalize-space()='Offer Job']");
    public static Target HIRE_BUTTON = Target.the("hire button").locatedBy("//button[normalize-space()='Hire']");
    public static String STATUS_XPATH = ("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[24]/div[1]/div[6]/div[1]");
    public static String NAME_XPATH = ("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[24]/div[1]/div[3]");
}
