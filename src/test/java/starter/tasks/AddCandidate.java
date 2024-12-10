package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.ui.PageForm;

public class AddCandidate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageForm.BUTTON_RECRUITMENT),
                Click.on(PageForm.BUTTON_ADD),
                Enter.theValue("Juan").into(PageForm.INPUT_FIRST_NAME),
                Enter.theValue("David").into(PageForm.INPUT_MIDDLE_NAME),
                Enter.theValue("Ospina").into(PageForm.INPUT_LAST_NAME),
                Click.on(PageForm.VACANCY_DROPDOWN),
                Click.on(PageForm.VACANCY_DROPDOWN_OPTION),
                Enter.theValue("juanda@gmail.com").into(PageForm.INPUT_EMAIL),
                Enter.theValue("32648793").into(PageForm.INPUT_CONTACT_NUMBER),
                Enter.theValue("Administrator").into(PageForm.INPUT_KEYWORDS),
                Enter.theValue("adding candidate").into(PageForm.INPUT_NOTES),
                Click.on(PageForm.RADIOBUTTON_CONSENT),
                Click.on(PageForm.SAVE_BUTTON),
                Click.on(PageForm.SHORTLIST_BUTTON),
                Enter.theValue("the candidate passes to the next round").into(PageForm.INPUT_NOTES),
                Click.on(PageForm.SAVE_BUTTON),
                Click.on(PageForm.SCHEDULE_INTERVIEW_BUTTON),
                Click.on(PageForm.INPUT_INTERVIEW_TITLE),
                Enter.theValue("Technical Interview").into(PageForm.INPUT_INTERVIEW_TITLE),
                Enter.theValue("jame").into(PageForm.INPUT_INTERVIEWER),
                Click.on(PageForm.INPUT_INTERVIEWER_OPTION),
                Click.on(PageForm.INPUT_DATE),
                Click.on(PageForm.INPUT_DATE_OPTION),
                Click.on(PageForm.INPUT_TIME),
                Enter.theValue("schedule interview").into(PageForm.INPUT_NOTES),
                Click.on(PageForm.SAVE_BUTTON),
                Click.on(PageForm.MARK_INTERVIEW_PASSED_BUTTON),
                Enter.theValue("the candidate passes the selection").into(PageForm.INPUT_NOTES),
                Click.on(PageForm.SAVE_BUTTON),
                Click.on(PageForm.OFFER_JOB_BUTTON),
                Enter.theValue("candidate get the job").into(PageForm.INPUT_NOTES),
                Click.on(PageForm.SAVE_BUTTON),
                Click.on(PageForm.HIRE_BUTTON),
                Enter.theValue("the candidate is hired").into(PageForm.INPUT_NOTES),
                Click.on(PageForm.SAVE_BUTTON),
                Click.on(PageForm.BUTTON_RECRUITMENT),
                Scroll.to(PageForm.STATUS_XPATH)


        );
    }
}
