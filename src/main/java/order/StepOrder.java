package order;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class StepOrder {
    // Метод для создания заказа
    public ValidatableResponse createOrder(CreateOrder order) {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .body(order)
                .when()
                .post("/orders") // Замените на правильный путь к вашему API
                .then();
    }

    // Метод для получения списка заказов
    public ValidatableResponse getListOrder() {
        return RestAssured.given()
                .header("Content-Type", "application/json")
                .when()
                .get("/orders") // Замените на правильный путь к вашему API
                .then();
    }
}
