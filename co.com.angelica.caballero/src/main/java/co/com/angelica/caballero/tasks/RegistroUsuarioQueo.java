package co.com.angelica.caballero.tasks;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.userinterfaces.RegistroQueoPage;
import co.com.angelica.caballero.userinterfaces.RegistroUsuarioPage;
import co.com.angelica.caballero.utils.ModificarCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class RegistroUsuarioQueo implements Task {
    private Datos datos;
    private ModificarCorreo modificarCorreo;

    public RegistroUsuarioQueo(Datos datos) {
        this.datos = datos;
    }

    public static RegistroUsuarioQueo registroDatosCuenta(Datos datos) {
        return Tasks.instrumented(RegistroUsuarioQueo.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroQueoPage.BTN_REGISTRO),
                Enter.theValue(datos.getNombre()).into(RegistroQueoPage.INPUT_NOMBRE),
                Enter.theValue(modificarCorreo.numAleatorio(datos.getCorreo())).into(RegistroQueoPage.INPUT_CORREO),
                Enter.theValue(datos.getContrasena()).into(RegistroQueoPage.INPUT_CONTRASENA),
                Enter.theValue(datos.getConfirmar_contrasena()).into(RegistroQueoPage.INPUT_CONFIRMAR_CONTRASENA),
                Click.on(RegistroQueoPage.BTN_CREAR_CUENTA)
        );
    }
}
