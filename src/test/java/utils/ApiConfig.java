package utils;

import java.util.ResourceBundle;

/**
 *
 * This class will return values from respective config files
 */

public class ApiConfig {

    private static ResourceBundle resourceBundle=ResourceBundle.getBundle("configs/"+System.getProperty("envType"));

    public static String getHost(){
        return resourceBundle.getString("host");
    }

    public static String getApiKey(){
        return resourceBundle.getString("apiKey");
    }

    public static String getRestaurantSearchQueryApi(){
        return resourceBundle.getString("restaurantSearchQueryApi");
    }

    public static String getCityCuisinesDetails(){
        return resourceBundle.getString("cityCuisinesDetailsApi");
    }

    public static String getRestaurantByIdApi(){
        return resourceBundle.getString("detailByIdSearchApi");
    }

    public static String getCategoryApi(){
        return resourceBundle.getString("categoryApi");
    }

    public static String getRestaurantByIdQuery(){
        return resourceBundle.getString("detailIdSearchQuery");
    }


    public static String getRestaurantSearchQuery(){
        return resourceBundle.getString("restaurantSearchQuery");
    }


}
