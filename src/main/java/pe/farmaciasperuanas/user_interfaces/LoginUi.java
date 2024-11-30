package pe.farmaciasperuanas.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUi {

    //Campos de texto
    public static Target TXT_CORREO_ELECTRONICO_LOGIN = Target.the("Campo de texto Correo Electronico Login")
            .located(By.id("email"));
    public static Target TXT_CONTRASEÑA_LOGIN = Target.the("Campo Password Login")
            .located(By.id("password"));
    public static Target BUTTON_INGRESAR_LOGIN = Target.the("Botón Ingresar Login")
            .located(By.xpath("//a[@id='btnLoginEmailMifarma']/button"));
}
