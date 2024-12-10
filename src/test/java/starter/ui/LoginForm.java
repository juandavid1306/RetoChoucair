package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginForm {
    public static Target INPUT_USERNAME = Target.the("input username").locatedBy("//input[@placeholder='Username']");
    public static Target INPUT_PASSWORD = Target.the("input password").locatedBy("//input[@placeholder='Password']");
    public static Target BUTTON_LOGIN = Target.the("input password").locatedBy("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
}
