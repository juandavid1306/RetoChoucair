package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.questions.GetCandidateInfo;

public class ShouldSeeCorrectData implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetCandidateInfo.getCandidateStatus()).contains("Hired"),
                Ensure.that(GetCandidateInfo.getCandidateName()).contains("Juan David Ospina")
        );

    }
}
