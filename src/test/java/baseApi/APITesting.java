package baseApi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.sql.SQLOutput;


public class APITesting {
@Test
    public void GetWeatherDetails()
    {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification t = RestAssured.given();

        Response r =t.request(Method.GET, "/Plano");

        String Body = r.getBody().asString();
        System.out.println("Response Body is =>  " + Body);
    }

    public void WeatherDetails1(){

    RestAssured.baseURI= "http://restapi.demoqa.com/utilities/weather/city";
    RequestSpecification httpRequest = RestAssured.given();
    Response response = httpRequest.request(Method.GET, "/Richardson");
    String reponseBody = response.getBody().asString();
       System.out.println("Response Body is => " +reponseBody);

    }

    public void DetailsWeather2(){

    RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
    RequestSpecification httpRequest = RestAssured.given();
    Response response = httpRequest.request(Method.GET,"/Dallas");
    String responseBody = response.getBody().asString();
        System.out.println("Response Body is=>" +responseBody);


    }

    public void WeatherDelGet3(){

    RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
    RequestSpecification httpRequest = RestAssured.given();
    Response response = httpRequest.request(Method.GET,"/Houston");
    String responseBody=response.getBody().asString();
     System.out.println("Response Body=>" +responseBody);


    }
  @Test
   public void TexasWeather(){
    RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
    RequestSpecification requs = RestAssured.given();
    Response resp = requs.request(Method.GET,"/plano");
    String ss = resp.getBody().asString();

       System.out.println("the weather in plano is =>" +ss);



   }

    }


