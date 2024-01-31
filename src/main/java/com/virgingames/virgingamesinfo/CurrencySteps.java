package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;
import java.util.List;

public class CurrencySteps {

    @Step("Verifying currency with Currency : {0} ")
    public List<HashMap<String, Object>> getAllDataByEndPoints(String currency) {
        return SerenityRest.given().log().all()
                .queryParam("currency", currency)
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_BINGO)
                .then().statusCode(200).log().all()
                .extract().path("data.pots.currency");
    }
}
