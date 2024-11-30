package pe.farmaciasperuanas.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommonUi {
    public static Target BUTTON_INICIAR_SESION = Target.the("Botón Iniciar sesión")
            .located(By.xpath("//span[@id='signIn']/../img"));
    public static Target BUTTON_INGRESAR = Target.the("Botón Ingresar")
            .located(By.xpath("//button[@id='btn--register-email']"));
    //Botones
    public static Target BUTTON_CERRAR_MODAL_INICIO = Target.the("Botón Cerrar modal de inicio")
            .located(By.xpath("//div[@class='close-up']/span"));
    public static Target BUTTON_ACEPTAR_POLÍTICA_COOKIES = Target.the("Botón Cerrar política de cookies")
            .located(By.xpath("//button[contains(text(),'Aceptar')]"));



    public static Target INPUT_USERNAME_ALIVIAMED = Target.the("Input de usuario aliviamed")
            .located(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/div[2]/input"));
    public static Target INPUT_CLAVE_ALIVIAMED = Target.the("Input de clave aliviamed")
            .located(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/input"));
}
