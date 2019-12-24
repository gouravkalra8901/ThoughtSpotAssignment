package com.company.project.tests;

import com.company.project.validations.RestaurantCategoryValidation;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ApiConfig;
import utils.ApiUtils;
import utils.ResponseCode;

public class RestaurantCategory extends BaseTest implements ResponseCode {

    private static final Logger logger= LoggerFactory.getLogger("Restaurant Category");

    RestaurantCategoryValidation dataValidation=new RestaurantCategoryValidation();

    /**
     * This method will fetch and validate the details of restaurants filtered with search query
     */
    @Test
    void searchCategory(){
        logger.info("Fetching data for restaurants with search query");
        RestAssured.baseURI= ApiConfig.getHost();
        String uri=ApiConfig.getCategoryApi();
        Response response= ApiUtils.getApiResponse(OK,uri);
        Assert.assertTrue(dataValidation.validateCategory(response),"Search query results for restaurants have produced invalid response");
    }
}
