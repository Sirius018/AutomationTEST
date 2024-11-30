package step_definition.log_in;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.E;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pe.farmaciasperuanas.tasks.log_in.LogIn;
import pe.farmaciasperuanas.user_interfaces.CommonUi;
import pe.farmaciasperuanas.utils.CommonClass;

import java.util.HashMap;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LogInStepoDefinition {
    @E("inicia sesión con tipo de autentificación {string} en {string}")
    public void iniciaSesiónConTipoDeAutentificación(String registrationType, String brand) {

//        try {
//            Thread.sleep(10000);
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        theActorInTheSpotlight().attemptsTo(
//                Check.whether(CommonUi.BUTTON_CERRAR_MODAL_INICIO.resolveFor(theActorInTheSpotlight()).isVisible()).andIfSo(
//                        WaitUntil.the(CommonUi.BUTTON_CERRAR_MODAL_INICIO, isVisible()).forNoMoreThan(60).seconds(),
//                        Click.on(CommonUi.BUTTON_CERRAR_MODAL_INICIO)
//                ),
//                Check.whether(CommonUi.BUTTON_ACEPTAR_POLÍTICA_COOKIES.resolveFor(theActorInTheSpotlight()).isVisible()).andIfSo(
//                        WaitUntil.the(CommonUi.BUTTON_ACEPTAR_POLÍTICA_COOKIES, isPresent()).forNoMoreThan(60).seconds(),
//                        Click.on(CommonUi.BUTTON_ACEPTAR_POLÍTICA_COOKIES)
//                )
//        );
//
//        theActorInTheSpotlight().attemptsTo(
//                WaitUntil.the(CommonUi.BUTTON_INICIAR_SESION, isClickable()).forNoMoreThan(60).seconds(),
//                Click.on(CommonUi.BUTTON_INICIAR_SESION)
//        );
//        HashMap<String, String> mapExcel = theActorInTheSpotlight().recall("mapExcel");
//        if (mapExcel == null) {
//            mapExcel = new HashMap<>();
//        }
//
//
//        theActorInTheSpotlight().attemptsTo(
//                WaitUntil.the(CommonUi.BUTTON_INICIAR_SESION, isVisible()).forNoMoreThan(60).seconds()
//        );
//        switch (registrationType) {
//            case "Correo Electronico"-> {
//                DataTable dataTable = CommonClass.getCredentialsInDataTable(brand, "correo");
//                if (brand.equals("inkafarma")) {
//                    theActorInTheSpotlight().attemptsTo(
//                            LogIn.withEmailInkaFarma(dataTable)
//                    );
//                } else {
//                    theActorInTheSpotlight().attemptsTo(
//                            LogIn.withEmailMiFarma(dataTable)
//                    );
//                }
//            }
//        }
//        theActorInTheSpotlight().remember("mapExcel", mapExcel);
//        theActorInTheSpotlight().remember("MARCA", brand);
    }
}
