package courier;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.ValidatableResponse;
import order.CheckOrder;
import order.StepOrder;
import org.junit.Test;


public class OrderListTest {

    private final StepOrder order = new StepOrder();
    private final CheckOrder check = new CheckOrder();

    @Test
    @DisplayName("Получение списка заказов")
    @Description("Проверка, что в тело ответа возвращается список заказов")
    public void getListOrder() {
        ValidatableResponse orderResponse = order.getListOrder();
        check.checkListOrderSuccessfully(orderResponse);
    }
}