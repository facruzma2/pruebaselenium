package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends TestBase {

    @Given("^que el usuario abre el aplicativo por primera vez accediendo al login$")
    public void que_el_usuario_abre_el_aplicativo_por_primera_vez_accediendo_al_login() throws Throwable {
        Thread.sleep(4000);
    }

    @When("^digita usuario \"([^\"]*)\" y clave \"([^\"]*)\" validos$")
    public void digita_usuario_y_clave_validos(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^dar click en el boton login$")
    public void dar_click_en_el_boton_login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^se abre pantalla home dashboard del aplicativo con accesos segun su perfil$")
    public void se_abre_pantalla_home_dashboard_del_aplicativo_con_accesos_segun_su_perfil() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
