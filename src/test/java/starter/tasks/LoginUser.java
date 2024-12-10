package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import starter.ui.LoginForm;

import static starter.ui.LoginForm.INPUT_PASSWORD;
import static starter.ui.LoginForm.INPUT_USERNAME;

public class LoginUser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"),
                Enter.theValue("Admin").into(INPUT_USERNAME),
                Enter.theValue("admin123").into(INPUT_PASSWORD),
                Click.on(LoginForm.BUTTON_LOGIN)
        );

    }
}
