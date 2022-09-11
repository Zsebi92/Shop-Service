package model;

import java.util.*;

public class OrderRepo {

    private Map<Integer, Order> orders = new HashMap<>();


    public List<Order> listOfOrders(){
        ArrayList<Order> orderList = new ArrayList<>(orders.values());
        return orderList;
    }

    public Order getOrder(Integer orderId){
        return orders.get(orderId);
    }

    public Order addOrder(Order order){
        return orders.put(order.getOrderId(), order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderRepo orderRepo = (OrderRepo) o;

        return Objects.equals(orders, orderRepo.orders);
    }

    @Override
    public int hashCode() {
        return orders != null ? orders.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }
}
