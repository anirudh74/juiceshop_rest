import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class login {
    @Test
    public void login() {
        RestAssured.baseURI = "http://localhost:3000";
        given()
                .body("{\"email\":\"a2@a.com\",\"password\":\"123456\"}")

                .header("Content-Type","application/json")
                .when().post("/rest/user/login")
                .then().log().all().statusCode(200);
    }
}