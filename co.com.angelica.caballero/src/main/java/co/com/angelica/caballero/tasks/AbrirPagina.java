package co.com.angelica.caballero.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;


public class AbrirPagina implements Task {
    private final String url;

    public AbrirPagina(String url) {
        this.url = url;
    }
    public static AbrirPagina pagina(String url) {
        return Tasks.instrumented(AbrirPagina.class,url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url), Browser.maximize()
        );

    }
}
