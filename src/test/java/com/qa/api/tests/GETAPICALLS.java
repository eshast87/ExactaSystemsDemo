package com.qa.api.tests;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class GETAPICALLS {

    @Test
    public void getUsersApiTest(){

        Playwright playwright = Playwright.create();
        APIRequest request = playwright.request();
        APIRequestContext apiRequestContext = request.newContext();
       APIResponse apiResponse =  apiRequestContext.get("https://gorest.co.in/public/v2/users");

       int statusCode = apiResponse.status();
       System.out.println("response status Code: "+ statusCode);


    }

}
