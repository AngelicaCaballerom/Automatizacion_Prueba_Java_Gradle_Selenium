package co.com.angelica.caballero.tasks;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.userinterfaces.RegistroQueoPage;
import co.com.angelica.caballero.utils.ModificarCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarCursoQueo implements Task {
    private Datos datos;

    public AgregarCursoQueo(Datos datos) {
        this.datos = datos;
    }

    public static AgregarCursoQueo adicionarCurso(Datos datos) {
        return Tasks.instrumented(AgregarCursoQueo.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroQueoPage.BTN_AGREGAR_CURSO),
                Click.on(RegistroQueoPage.SELECT_CURSOS),
                Enter.theValue(datos.getCurso()).into(RegistroQueoPage.INPUT_CURSO),
                Click.on(RegistroQueoPage.OPTION_CURSO),
                Click.on(RegistroQueoPage.BTN_ADICION_CURSO),
                Click.on(RegistroQueoPage.BTN_VERIFICAR_ADICION_CURSO)


        );
    }
}
