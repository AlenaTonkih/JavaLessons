package ProductAndOrders;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private LocalDateTime timeOfRegistration;
    private LocalDateTime timeOfPayment;

    Orders orders = new Orders();
    public int randomID() { //Генирирую рандомный уникальный номер заказа
        int randomId = orders.setID((int) (Math.random() * 100));
        return randomId;
    }
    public void dateAndTimeOfRegistrationOfTheOrder(){
        timeOfRegistration = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateAndTime = timeOfRegistration.format(dateTimeFormatter);
        System.out.println("Ваш заказ был зарегистрирован: " + dateAndTime);
    }
    public void dateAndTimeOfOrderPayment(){
        timeOfPayment = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateAndTime = timeOfPayment.format(dateTimeFormatter);
        System.out.println("Ваш заказ был оплачен: " + dateAndTime);
    }
    public List<Product> addProductsToOrder(Product... products) {
        List<Product> allProductsInOrder = new ArrayList<>();
        for (Product product : products) {
            allProductsInOrder.add(product); // добавляем каждый продукт в список
            System.out.println(product.toString() + " добавлен в список продуктов"); // выводим сообщение о добавлении продукта
        }
        return allProductsInOrder; // возвращаем список с добавленными продуктами
    }

    public LocalDateTime getTimeOfRegistration() {
        return timeOfRegistration;
    }

    public void setTimeOfRegistration(LocalDateTime timeOfRegistration) {
        this.timeOfRegistration = timeOfRegistration;
    }

}
