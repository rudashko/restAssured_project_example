package steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojos.UserPojoFull;

import static io.restassured.RestAssured.given;

public class UsersSteps {

    private static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
                    .setBaseUri("https://reqres.in/api")
                    .setBasePath("/users")
                    .setContentType(ContentType.JSON)
                    .build();


    public static UserPojoFull getUser(int id){
        return given().get("/" + id).as(UserPojoFull.class);
    }

}
