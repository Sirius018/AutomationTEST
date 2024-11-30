package step_definition.common;

import io.cucumber.java.es.Y;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.Assert;
import pe.farmaciasperuanas.tasks.navigate.GoTo;

public class CommonStepDefinition {
    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
    @Y("que {actor} ingresa al micrositio de {string}")
    public void elIngresaIngresaAlMicrositioDelMódulo(Actor actor, String accion) {
        actor.remember("MICROSITIO", accion);
        String property = "";
        Assert.assertNotEquals("Falta ingresar la URL del micrositio", property, null);

        if(accion.equals("mifarma")){
            property = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url.ecommerce.mifarma");
        }else if(accion.equals("inkafarma")){
            property = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url.ecommerce.inkafarma");
        }else if (accion.equals("aliviamed")) {
            property = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("url.ecommerce.aliviamed");
        }

        Assert.assertNotEquals("Falta ingresar la URL del micrositio", property, null);

        actor.wasAbleTo(GoTo.openInTheMicroSite(property));
    }
}
