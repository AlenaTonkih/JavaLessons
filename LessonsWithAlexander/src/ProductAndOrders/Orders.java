package ProductAndOrders;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Orders  { //DTO
    private int ID;
    private List<Product> allProducts; //список заказанных товаров
    private List<Product> allProductsInOrder = new ArrayList<>();
    private double totalPrice;

    Orders(){}

    public List<Product> getAllProductsInOrder() {
        return allProductsInOrder;
    }

    public void setAllProductsInOrder(List<Product> allProductsInOrder) {
        this.allProductsInOrder = allProductsInOrder;
    }

    public int setID(int ID) {
        this.ID = ID;
        return ID;
    }

    public int getID() {
        return ID;
    }

    public List<Product> getProducts() {
        return allProducts;
    }

    public double setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return totalPrice;
    }

    public List<Product> getAllProducts() {
        return allProducts;
    }

}
