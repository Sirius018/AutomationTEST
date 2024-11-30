package step_definition.aliviamed;

import io.cucumber.java.es.Dado;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import pe.farmaciasperuanas.user_interfaces.CommonUi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginAliviamedDoctor {
    @Dado("que Jon Doe ingresa a session")
    public void queJonDoeIngresaASession(Actor actor) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        String usernameAliviamed = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("users.aliviamed.correo.username");
        String passwordAliviamed = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("users.aliviamed.correo.password");
        System.out.println("Usuario doctor: " + usernameAliviamed);
        System.out.println("clave doctor: " + passwordAliviamed);

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CommonUi.INPUT_USERNAME_ALIVIAMED, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(CommonUi.INPUT_USERNAME_ALIVIAMED, isEnabled()).forNoMoreThan(30).seconds(),
                Clear.field(CommonUi.INPUT_USERNAME_ALIVIAMED),
                Enter.theValue(usernameAliviamed).into(CommonUi.INPUT_USERNAME_ALIVIAMED),

                WaitUntil.the(CommonUi.INPUT_CLAVE_ALIVIAMED, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(CommonUi.INPUT_CLAVE_ALIVIAMED, isEnabled()).forNoMoreThan(30).seconds(),
                Clear.field(CommonUi.INPUT_CLAVE_ALIVIAMED),
                Enter.theValue(passwordAliviamed).into(CommonUi.INPUT_CLAVE_ALIVIAMED)
//
//                WaitUntil.the(CommonUi.BUTTON_INGRESAR_ALIVIAMED, isClickable()).forNoMoreThan(30).seconds(),
//                Click.on(CommonUi.BUTTON_INGRESAR_ALIVIAMED)
        );

        System.out.println("inicio de session aliviamed completo");
        try {
            Thread.sleep(9000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
