package order;

import io.restassured.response.ValidatableResponse;

import java.util.List;

import static org.hamcrest.Matchers.*;

public class CheckOrder {
    // Метод для проверки успешного создания заказа
    public void checkCreatedOrderSuccessfully(ValidatableResponse response) {
        response
                .statusCode(201) // Ожидаемый статус код для успешного создания
                .body("track", notNullValue()); // Проверка, что поле track присутствует и не null
    }

    // Метод для проверки успешного получения списка заказов
    public void checkListOrderSuccessfully(ValidatableResponse response) {
        response
                .statusCode(200) // Ожидаемый статус код для успешного получения
                .body("orders", isA(List.class)) // Проверка, что orders — это список
                .body("orders", not(empty())); // Проверка, что список не пустой (если требуется)
    }
}