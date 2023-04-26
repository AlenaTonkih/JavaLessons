package ProductAndOrders;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String type;
    private String productName;
    private double price;

    public Product(String type, String productName, double price) {
        this.type = type;
        this.productName = productName;
        this.price = price;
    }

    public Product() {

    }

    public String getType() {
        return type;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    //вернуть товары со стоимостью более 100, относящиеся к категории “продукты”
    public List<Product> returnProductsOver100(ArrayList<Product> products) {
        List<Product> expensiveProducts = products.stream()
                .filter(product -> product.getType().equals("Food") && product.getPrice() > 100)
                .collect(Collectors.toList()); //метод оздает новый список, в который добавляются элементы, прошедшие через предыдущие операции
        return expensiveProducts;
    }

    // к товарам из раздела “игрушки” применить скидку 10%
    public List<Product> returnToysAtDiscount(ArrayList<Product> products) {
        List<Product> toys = (List<Product>) products.stream()
                .filter(product -> product.getType().equals("Toy"))
                .map(product -> new Product(product.getType(), product.getProductName(), product.getPrice() * 0.9))
                .collect(Collectors.toList());

        return toys;
    }

    //вывести список товаров с заданным типом в алфавитном порядке по названию
    public List<Product> returnListInAlphabeticalOrder(ArrayList<Product> products){
        List<Product> alphabetOrder = products.stream()
                .filter(product -> product.getType().equals("Food"))
                .sorted(Comparator.comparing(Product::getProductName)) //Сортировка по названию товаров
                .collect(Collectors.toList());
        return alphabetOrder;
    }

    @Override
        public String toString () {
            return "Product{" +
                    "Тип продукта: '" + type + '\'' +
                    ", Наименование продукта: '" + productName + '\'' +
                    ", Цена товара: " + price +
                    '}';
        }
}
