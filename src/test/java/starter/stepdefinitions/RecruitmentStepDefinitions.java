package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.tasks.AddCandidate;
import starter.tasks.LoginUser;
import starter.tasks.ShouldSeeCorrectData;

public class RecruitmentStepDefinitions {

    @Given("{actor} wants to login in the application")
    public void loginInTheApplication(Actor actor) {
        actor.attemptsTo(
                new LoginUser()
        );
    }

    @When("{actor} follow the steps to hire a person through the platform")
    public void hireAPersonThroughThePlatform(Actor actor) {
        actor.attemptsTo(
                new AddCandidate()
        );
    }

    @Then("{actor} should can see the person hired in the platform")
    public void shouldCanSeeThePersonHiredInThePlatform(Actor actor) {
        actor.attemptsTo(
                new ShouldSeeCorrectData()
        );
    }
}
