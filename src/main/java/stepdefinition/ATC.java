package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ATC {
    @When("user selects the ATC button for the product {}")
    public void userSelectsTheATCButtonForTheProduct(String arg0) {
    }

    @Then("verify the mini cart is updated with qty {int}")
    public void verifyTheMiniCartIsUpdatedWithQty(int arg0) {
    }
}
