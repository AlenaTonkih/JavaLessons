package ProductAndOrders;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String productName;
    private double price;
    private TypeOfProduct typeOfProduct;

    public Product(String productName, TypeOfProduct typeOfProduct, double price) {
        this.productName = productName;
        this.typeOfProduct = typeOfProduct;
        this.price = price;
    }

    public Product() { //я помню, что мы обсуждали, что не нужно создавать пустой конструктор и можно как-то по-другому, но я забыла как...

    }
    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }


    @Override
        public String toString () {
            return "Product{" +
                    "Тип продукта: '" + typeOfProduct + '\'' +
                    ", Наименование продукта: '" + productName + '\'' +
                    ", Цена товара: " + price +
                    '}';
        }
}
