package co.com.angelica.caballero.questions;

import co.com.angelica.caballero.userinterfaces.RegistroQueoPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;


public class VerificarAdicionCurso implements Question<Boolean> {
    private final String Curso;

    public VerificarAdicionCurso(String Curso) {
        this.Curso = Curso;
    }

    public static VerificarAdicionCurso igual(String Curso) {
        return new VerificarAdicionCurso(Curso);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade elementoNombre = BrowseTheWeb.as(actor).find(RegistroQueoPage.INPUT_CURSO_REGISTRADO);
        return Curso.equals(elementoNombre.getText());

    }
}
