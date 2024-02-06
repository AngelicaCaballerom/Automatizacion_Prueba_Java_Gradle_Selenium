package co.com.angelica.caballero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroQueoPage {
    public static final Target BTN_REGISTRO= Target.the("Boton de registro de nueva cuenta").located(By.xpath("//*[contains(text(),'sign up for an account')]//ancestor::a"));
    public static final Target INPUT_NOMBRE= Target.the("input de nombre").located(By.xpath("//input[@id='data.name']"));
    public static final Target INPUT_CORREO= Target.the("input de correo").located(By.xpath("//input[@id='data.email']"));
    public static final Target INPUT_CONTRASENA= Target.the("input de contrasena").located(By.xpath("//input[@id='data.password']"));
    public static final Target INPUT_CONFIRMAR_CONTRASENA= Target.the("input de confirmar contrasena").located(By.xpath("//input[@id='data.passwordConfirmation']"));
    public static final Target BTN_CREAR_CUENTA= Target.the("Boton de crear cuenta ").located(By.xpath("//button[@type='submit']"));
    public static final Target BTN_AGREGAR_CURSO= Target.the("Boton de agregar  cursos ").located(By.xpath("//*[contains(text(),'Add new course')]//ancestor::button"));
    public static final Target SELECT_CURSOS= Target.the("Seleccionar listado de cursos ").located(By.xpath("//div[@role='combobox']"));
    public static final Target INPUT_CURSO= Target.the("input de curso").located(By.xpath("//input[@name='search_terms']"));
    public static final Target OPTION_CURSO= Target.the("Primera opcion del select").located(By.xpath("//div[@role='listbox']//child::div[1]"));
    public static final Target BTN_ADICION_CURSO= Target.the("Boton adicion curso ").located(By.xpath("//*[contains(text(),'Submit')]//ancestor::button"));
    public static final Target BTN_VERIFICAR_ADICION_CURSO= Target.the("Boton verificar la adicion del curso seleccionado ").located(By.xpath("//*[contains(text(),'Course Registrations')]//ancestor::a"));
    public static final Target INPUT_CURSO_REGISTRADO= Target.the("input curso registrsdo").located(By.xpath("(//*[contains(@class,'fi-ta-text-item-label text-sm leading-6 text-gray-950 dark:text-white  ')])[1]"));
}
