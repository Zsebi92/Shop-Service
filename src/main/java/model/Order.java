package model;

import java.util.List;

public class Order {

    private int orderId;
    private List<Product>products;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products=" + products +
                '}';
    }
}
