package ProductAndOrders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orders {
    private int ID;
    private LocalDate orderDate; //дата регистрации заказа
    private LocalDate paymentDate; //дата оплаты заказа
    private List<Product> allProducts; //список заказанных товаров
    private double totalPrice;

    public int random (){ //Генирирую рандомный уникальный номер заказа
        ID = (int) (Math.random() * 100);
        return ID;
    }
    public double getTotalPrice() {
        totalPrice = allProducts.stream()
                .mapToDouble(Product::getPrice)
                .sum(); //метод, находящий всю сумму заказа
        return totalPrice;
    }


    public double applyDiscountToOrder(double discount){
        double discountPrice = discount * totalPrice % 100;
        return discountPrice;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public List<Product> getProducts() {
        return allProducts;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
