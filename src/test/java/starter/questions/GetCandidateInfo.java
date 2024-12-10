package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.ui.PageForm;

public class GetCandidateInfo {

    public static Question<String> getCandidateStatus() {
        return Question.about("final status candidate").answeredBy(
                actor -> BrowseTheWeb.as(actor).textOf(PageForm.STATUS_XPATH)
        );
    }

    public static Question<String> getCandidateName() {
        return Question.about("candidate name").answeredBy(
                actor -> BrowseTheWeb.as(actor).textOf(PageForm.NAME_XPATH)
        );
    }
}
