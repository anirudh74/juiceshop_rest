import io.restassured.RestAssured;
import io.restassured.internal.mapping.GsonMapper;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Registration {
    @Test
    public void registration(){
        RestAssured.baseURI="http://localhost:3000";
        //Gson gson = new Gson;
        given()
               .body("{\"email\":\"123@a.com\",\"password\":\"123456\",\"passwordRepeat\":\"123456\",\"securityQuestion\":{\"id\":2,\"question\":\"Mother's maiden name?\",\"createdAt\":\"2021-12-01T04:44:35.877Z\",\"updatedAt\":\"2021-12-01T04:44:35.877Z\"},\"securityAnswer\":\"123e\"}")
                //.body("\""+customerDetailsBuilder()+"\"")
                .header("Content-Type","application/json")
                .when().post("/api/Users")
                .then().log().all().statusCode(201);

    }

    private CustomerDetails.CustomerDetailsBuilder customerDetailsBuilder() {
        return CustomerDetails.builder()
                .email("123@123.com")
                .password("1234")
                .repeatPassword("1234")
                .securityQuestion("\""+"\"id\":2,\"question\":\"Mother's maiden name?\",\"createdAt\":\"2021-12-01T04:44:35.877Z\",\"updatedAt\":\"2021-12-01T04:44:35.877Z\""+"\"")
                .securityAnswer("abbcs");
    }
}
