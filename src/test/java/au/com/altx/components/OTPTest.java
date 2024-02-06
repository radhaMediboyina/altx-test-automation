package au.com.altx.components;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j2;

import static io.restassured.RestAssured.given;

@Log4j2
public class OTPTest {

    public static String OTPValue;

    public String ClientID = "customer-portal-bff-client";
    public String ClientSecret = "712ac317-905f-4fd2-8d37-34b504d58302";
    public String GrantType = "client_credentials";
    public String Scope = "customer-portal";
    public String Access_Token_URL = "https://uat-affinitykeycloak.azurewebsites.net/auth/realms/Affinity/protocol/openid-connect/token";
    public String GetOTP_Testing_Endpoint = "https://uat-affinitycustomerportalbff.azurewebsites.net/api/email/testing";
    public String Delete_Email_Endpoint = "https://uat-affinitycustomerportalbff.azurewebsites.net/api/email/testing/removal";

    public void generateAccessToken(String email){
        Response response = given().formParam("client_id",ClientID)
                .formParam("client_secret",ClientSecret)
                .formParam("grant_type",GrantType)
                .formParam("Scope",Scope)
                .post(Access_Token_URL);

        String token = response.jsonPath().get("access_token");

        Response response1 = RestAssured.given()
                                        .auth()
                                        .oauth2(token)
                                        .queryParam("email",email)
                                        .get(GetOTP_Testing_Endpoint);

        OTPValue = response1.body().prettyPrint();
        log.info("OTP is "+OTPValue);

    }

    public void deleteEmail(){
        try {
            Response response = given().formParam("client_id", ClientID)
                    .formParam("client_secret", ClientSecret)
                    .formParam("grant_type", GrantType)
                    .formParam("Scope", Scope)
                    .post(Access_Token_URL);

            String token = response.jsonPath().get("access_token");

            Response response1 = RestAssured.given()
                    .auth()
                    .oauth2(token)
                    .get(Delete_Email_Endpoint);
            log.info("Status code after removing of email id is " + response1.getStatusCode());
        }catch (Exception e){
            log.info("Email is already deleted");
        }

    }

}
