package step1;


import step1.app.Consumer;
import step1.app.OrderApplication;
import step1.enums.Menu;
import step1.order.Order;
import step1.order.OrderList;

public class Main {
    public static void main(String[] args) {

        Consumer consumer;

        // 치킨 주문
        consumer = new OrderApplication();
        consumer.chikenOrder(Menu.Chicken, 2);
        consumer.chikenOrder(Menu.Chicken, 1);

        // 주문 확인
        OrderList orderList = new OrderList("치킨");
        for (Order order : orderList.getOrderList()) {
            System.out.println(order.getFoodName());
            System.out.println(order.getPrice());
            System.out.println(order.getAmount());
            System.out.println();
        }

        // 피자 주문
        consumer.pizzaOrder(Menu.Pizza, 2);
        consumer.pizzaOrder(Menu.Pizza, 4);
        // 주문 확인
        orderList = new OrderList("피자");
        for (Order order : orderList.getOrderList()) {
            System.out.println(order.getFoodName());
            System.out.println(order.getPrice());
            System.out.println(order.getAmount());
            System.out.println();
        }


    }
}
