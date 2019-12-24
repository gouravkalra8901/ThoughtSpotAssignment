package com.company.project.validations;

import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import utils.ApiUtils;
import java.util.List;

public class DetailByIdValidation {
    private static final Logger logger= LoggerFactory.getLogger(" details validation ");

    public boolean validateRestaurantDetailById(Response response){
        Assert.assertTrue(ApiUtils.isJSONValid(response.asString()),"The given String is not a valid JSON");
        List<String> cuisines = response.jsonPath().get("highlights");
        long nullCount = cuisines.stream().filter(cuisine -> cuisine == null).count();
        logger.info("Null value count in cuisines data-  "+nullCount);
        return nullCount==0;
    }
}
