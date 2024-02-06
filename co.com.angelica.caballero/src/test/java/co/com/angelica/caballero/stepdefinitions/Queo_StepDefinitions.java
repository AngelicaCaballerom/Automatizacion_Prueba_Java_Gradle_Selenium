package co.com.angelica.caballero.stepdefinitions;

import co.com.angelica.caballero.models.Datos;
import co.com.angelica.caballero.questions.VerificarAdicionCurso;
import co.com.angelica.caballero.questions.VerificarRegistroUsuario;
import co.com.angelica.caballero.tasks.AbrirPagina;
import co.com.angelica.caballero.tasks.AgregarCursoQueo;
import co.com.angelica.caballero.tasks.RegistroFormCuentanosDeTi;
import co.com.angelica.caballero.tasks.RegistroUsuarioQueo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class Queo_StepDefinitions {
    private Datos datos;
    @Dado("Angelica ingresa a la Plataforma {string}")
    public void angelicaIngresaALaPlataforma(String pag) {
        OnStage.theActor("Angelica").wasAbleTo(AbrirPagina.pagina(pag));
    }

    @Cuando("se dirige al apartado de registro de cuenta")
    public void seDirigeAlApartadoDeRegistroDeCuenta() {

    }

    @Y("completa los datos del registro de cuenta")
    public void completaLosDatosDelRegistroDeCuenta(DataTable tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistroUsuarioQueo.registroDatosCuenta(Datos.setDatos(tablaDatos).get(0)));
    }

    @Y("selecciona agregar curso")
    public void seleccionaAgregarCurso(DataTable tablaDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarCursoQueo.adicionarCurso(Datos.setDatos(tablaDatos).get(0)));
    }

    @Entonces("Verificamos que se haya realizado el registro del curso seleccionado")
    public void verificamosQueSeHayaRealizadoElRegistroDelCursoSeleccionado() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarAdicionCurso.igual("Fundamentos de QA y Testing")));
    }

}
