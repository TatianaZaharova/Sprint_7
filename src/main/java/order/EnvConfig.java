package order;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class EnvConfig {
    protected static final String BASE_URI = "http://qa-scooter.praktikum-services.ru";
    private static final String BASE_PATH = "/api/v1";

    public RequestSpecification spec() {
        return given().log().all()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH);
    }
}