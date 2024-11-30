package pe.farmaciasperuanas.tasks.navigate;

import groovy.util.logging.Slf4j;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

@Slf4j
public class GoTo {

    public static Performable openInTheMicroSite(String url) {
        return Task.where("{0} ingresa al micrositio ",
                Open.url(url)
        );
    }

}
