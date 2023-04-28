package ProductAndOrders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderService orderService = new OrderService();
        OrderCostCalculation orderCostCalculation = new OrderCostCalculation();

        Product product = new Product("Meat", TypeOfProduct.FOOD, 1300);
        Product product1 = new Product("Fish", TypeOfProduct.FOOD, 120);
        Product product2 = new Product("Tea", TypeOfProduct.DRINKS, 60);

        System.out.println("Номер вашего заказа: " + orderService.randomID());
        System.out.println();
        orderCostCalculation.getTotalPrice(orderService.addProductsToOrder(product, product1, product2));
        System.out.println();
        orderService.dateAndTimeOfRegistrationOfTheOrder();
        System.out.println();
        System.out.println("Вы готовы оплатить товар, введите 'Да' или 'Нет'");
        String answer = scanner.nextLine();
        orderCostCalculation.payOrder(answer);
    }
}
/*
1. Реализовать класс Product с полями:
    Тип товара
    Стоимость товара
    Название товара
2. Создать список товаров с различными данными
3. Для созданного списка найти:
    товары со стоимостью более 100, относящиеся к категории “продукты”
    к товарам из раздела “игрушки” применить скидку 10%
    вывести список товаров с заданным типом в алфавитном порядке по названию
4. Реализовать класс Order, в котором будет располагаться информация о заказе:
    дата регистрации заказа
    уникальный номер заказа
    дата оплаты заказа
    список товаров
    реализовать вспомогательные методы
    возможность применять скидку ко всему заказу
5. Создать список заказов
6. Для заказов:
    найти все неоплаченные заказы
    найти заказы, которые были сделаны в период между двумя датами
    для заказов, стоимость которых более 1000 применить скидку 5%
    найти топ 3 наиболее популярных товаров в заказах
 */