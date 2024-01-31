package com.virgingames.cucumber.steps;

import com.virgingames.virgingamesinfo.CurrencySteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;


public class MyStepDefs {


    @Steps
    CurrencySteps steps;

    @When("User send GET request to Bingo endpoint with currency as a {string}")
    public void userSendGETRequestToBingoEndpointWithCurrencyAsA(String currency) {
        steps.getAllDataByEndPoints(currency);
    }

    @Then("I verify currency is in {string}")
    public void iVerifyCurrencyIsIn(String currency) {
       List<HashMap<String, Object>> expectedCurrency = steps.getAllDataByEndPoints(currency);
        Assert.assertTrue(expectedCurrency.contains(currency));
    }
}
