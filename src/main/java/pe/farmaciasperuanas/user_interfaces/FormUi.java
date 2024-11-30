package pe.farmaciasperuanas.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormUi {
    //Campos de texto
    public static Target TXT_CORREO_ELECTRONICO = Target.the("Campo de texto Correo Electronico")
            .located(By.id("ctrl--register-email"));
}
