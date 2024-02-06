package co.com.angelica.caballero.stepdefinitions;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.questions.VerificarRegistroUsuario;
import co.com.angelica.caballero.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


public class Utest_StepDefinitions {

    @Before
    public void iniciarTest() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("Angelica ingresa al aplicativo de Utest")
    public void angelicaIngresaAlAplicativoDeUtest() {
        OnStage.theActor("Angelica").wasAbleTo(AbrirPagina.pagina("https://utest.com"));
    }

    @Cuando("inicio en el apartado de join today")
    public void inicioEnElApartadoDeJoinToday() {
        OnStage.theActor("Angelica").attemptsTo(IngresarAlRegistro.registroToday());

    }

    @Y("completa los datos de cuentanos de ti")
    public void completaLosDatosDeCuentanosDeTi(DataTable tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroFormCuentanosDeTi.llenarFormCuentanosDeTi(Datos.setDatos(tablaDatos).get(0)));
    }

    @Y("completa los datos de Direccion")
    public void completaLosDatosDeDireccion(DataTable tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroFormDireccion.llenarFormDireccion(Datos.setDatos(tablaDatos).get(0)));

    }

    @Y("lleno los datos de mis los dispositivos")
    public void llenoLosDatosDeMisLosDispositivos(DataTable tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroFormDispositivos.llenarFormDispositivos(Datos.setDatos(tablaDatos).get(0)));
    }

    @Y("lleno los datos de mi contrasenna")
    public void llenoLosDatosDeMiContrasenna(DataTable tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroFormContrasena.llenarFormContrasena(Datos.setDatos(tablaDatos).get(0)));
    }

    @Entonces("Verificamos que se haya realizado el registro del usuario")
    public void verificamosQueSeHayaRealizadoElRegistroDelUsuario() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarRegistroUsuario.usuario(), Matchers.equalTo("Welcome to the world's largest community of freelance software testers!")));
    }


}
