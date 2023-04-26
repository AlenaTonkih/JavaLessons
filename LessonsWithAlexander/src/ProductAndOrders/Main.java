package ProductAndOrders;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Food", "Bread", 1 );
        Product product1 = new Product("Food", "Meat", 101);
        Product product2 = new Product("Food", "Fish", 120);
        Product product3 = new Product("Toy", "Bear", 110);

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        Product product4 = new Product();
        System.out.println(product4.returnProductsOver100((ArrayList<Product>) products));
        System.out.println();
        System.out.println(product4.returnToysAtDiscount((ArrayList<Product>) products));
        System.out.println();
        System.out.println(product4.returnListInAlphabeticalOrder((ArrayList<Product>) products));
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