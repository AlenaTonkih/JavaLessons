package ProductAndOrders;

import java.util.List;

public class OrderCostCalculation {
    OrderCostCalculation(){}
    OrderService orderService = new OrderService();
    Orders orders = new Orders();
    public void getTotalPrice(List<Product> inputProducts) { //высчитываем скидку тут же
         double totalPrice = orders.setTotalPrice(inputProducts.stream()
                .mapToDouble(Product::getPrice)
                .sum()); //метод, находящий всю сумму заказа
        if(totalPrice >= 1500){
            System.out.println("Цена со скидкой 15%: " + applyDiscountToOrder(totalPrice, 15));
        }
        else if (totalPrice >= 2500 && totalPrice <= 2999) {
            System.out.println("Цена со скидкой 20%: " + applyDiscountToOrder(totalPrice, 20));
        } else if (totalPrice >= 3000) {
            System.out.println("Цена со скидкой 25%: " + applyDiscountToOrder(totalPrice, 25));
        }
        else {
            System.out.println("Цена без скидки: " + totalPrice);
        }
    }
    private double applyDiscountToOrder(double totalPrice, int discount) {
        return totalPrice * (100 - discount) / 100;
    }
    public void payOrder(String yesOrNow){
        if(yesOrNow.equals("Да")){
            orderService.dateAndTimeOfOrderPayment();
        } else if (yesOrNow.equals("Нет")) {
            System.out.println("Мы будем ждать оплаты заказа");
        }
        else {
            System.out.println("Ввод некорректен");
        }
    }
}
