package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.NetflixPage;

public class NetflixSteps {
    NetflixPage netflixPage = new NetflixPage();

    @Given("Iniciar la página de Netflix")
    public void iniciarLaPáginaDeNetflix()   {
        netflixPage.iniciarGoogleChrome();
        netflixPage.navegarANetflix();
    }

    @When("Se maximiza la pantalla")
    public void seMaximizaLaPantalla()  {
        netflixPage.maximizarPantalla();
    }

    @Then("Se imprime el título")
    public void seImprimeElTitulo()   {
        netflixPage.imprimirTitulo();
    }

    @And("Se imprime la URL")
    public void seImprimeLaUrl()   {
        netflixPage.imprimirURL();
    }
}
