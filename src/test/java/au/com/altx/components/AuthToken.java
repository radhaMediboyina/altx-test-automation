package au.com.altx.components;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.log4j.Log4j2;

import static io.restassured.RestAssured.given;
@Log4j2
public class AuthToken {
    public static RequestSpecification requestSpecification;
    public static Response response;
    public static String IdentityServer_AccessToken_URL="https://uat-affinityidentity.azurewebsites.net/connect/token";
    public static String token;
    public static String ClientID="bbd.vanguard.ui.sp.web";
    public static String GrantType="password";
    public static String ClientSecret="secret";
    public static String Username="svc-affinity";
    public static String Password="KcurPcDNb2tQttZ00rfpL8mDdOwVDlWBfJ9Ets48RLIgO";
    public static int expectedStatusCode=200;

    public static String keyCloak_ClientID = "customer-portal-bff-client";
    public static String keyCloak_ClientSecret = "712ac317-905f-4fd2-8d37-34b504d58302";
    public static String keyCloak_GrantType = "client_credentials";
    public static String keyCloak_Scope = "customer-portal";
    public static String keyCloak_Access_Token_URL = "https://uat-affinitykeycloak.azurewebsites.net/auth/realms/Affinity/protocol/openid-connect/token";

    public static void Identity_OAuth_token(){
        requestSpecification = given().param("grant_type",GrantType)
                .param("username",Username)
                .param("password",Password)
                .auth()
                .preemptive().basic(ClientID,ClientSecret);

        response = requestSpecification.post(IdentityServer_AccessToken_URL);
        token = response.jsonPath().get("access_token");
        log.info("token is "+token);
    }


   public static void keyCloak_OAuth_Token(){
       requestSpecification = given().formParam("client_id",keyCloak_ClientID)
               .formParam("client_secret",keyCloak_ClientSecret)
               .formParam("grant_type",keyCloak_GrantType)
               .formParam("Scope",keyCloak_Scope);

       response = requestSpecification.post(keyCloak_Access_Token_URL);
       token = response.jsonPath().get("access_token");
       log.info("token is "+token);

   }

}
