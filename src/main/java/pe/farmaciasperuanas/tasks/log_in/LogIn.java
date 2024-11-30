package pe.farmaciasperuanas.tasks.log_in;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import pe.farmaciasperuanas.user_interfaces.CommonUi;
import pe.farmaciasperuanas.user_interfaces.FormUi;
import pe.farmaciasperuanas.user_interfaces.LoginUi;
import pe.farmaciasperuanas.utils.ConvertCucumberDataTable;
import pe.farmaciasperuanas.utils.CryptDecrypt;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogIn {
    public static Task withEmailMiFarma(DataTable credentials){
        Map<String,String> credenciales =  ConvertCucumberDataTable.toMap(credentials);
        String user = credenciales.get("usuario");
        String passDecrypt = CryptDecrypt.decrypt(credenciales.get("contraseña"));
        theActorInTheSpotlight().remember("EMAIL", user);
        return Task.where("{0} ingresa con email a MiFarma",
                Enter.theValue(user).into(FormUi.TXT_CORREO_ELECTRONICO),
//                WaitUntil.the(CommonUi.BUTTON_INGRESAR, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CommonUi.BUTTON_INGRESAR),
                WaitUntil.the(LoginUi.TXT_CORREO_ELECTRONICO_LOGIN, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(user).into(LoginUi.TXT_CORREO_ELECTRONICO_LOGIN),
                Enter.theValue(passDecrypt).into(LoginUi.TXT_CONTRASEÑA_LOGIN),
                Click.on(LoginUi.BUTTON_INGRESAR_LOGIN)
        ).withNoReporting();


    }
    public static Task withEmailInkaFarma(DataTable credentials){
        Map<String,String> credenciales =  ConvertCucumberDataTable.toMap(credentials);
        String user = credenciales.get("usuario");
        String passDecrypt = CryptDecrypt.decrypt(credenciales.get("contraseña"));
        theActorInTheSpotlight().remember("EMAIL", user);
        return Task.where("{0} ingresa con email a InkaFarma",
                Click.on(By.xpath("//button[contains(text(),'Ingresa con correo electrónico')]")),
                Enter.theValue(user).into(By.xpath("//input[@id='ctrl--login-email']")),
                Enter.theValue(passDecrypt).into(By.xpath("//input[@id='ctrl--login-password']")),
                Click.on(By.xpath("//button[contains(text(),'Ingresa a tu cuenta')]"))
        ).withNoReporting();
    }
}
