
import model.Service;
import model.Order;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Product product1 = new Product(1, "Hose");
        Product product2 = new Product(2, "Schuhe");
        Product product3 = new Product(3, "Tshirt");
        Product product4 = new Product(4, "Mütze");

        Service productsMenu = new Service();
        productsMenu.add(product1);
        productsMenu.add(product2);
        productsMenu.add(product3);
        productsMenu.add(product4);

        Order order1 = new Order(1, List.of(product1, product2, product3));
        Order order2 = new Order(2, List.of(product1,product4));
        Order order3 = new Order(3, List.of(product1, product3));
        Order order4 = new Order(4, List.of(product1, product3, product4));

        Service smallOrder = new Service();
        smallOrder.addOrder(order1);
        smallOrder.addOrder(order2);
        smallOrder.addOrder(order3);
        smallOrder.addOrder(order4);


        System.out.println("Get a single product");
        System.out.println(productsMenu.getProductId(2));
        System.out.println("");


        System.out.println("Get all products");
        System.out.println(productsMenu.getAllProducts());
        System.out.println("");

        System.out.println("Get a single Order");
        System.out.println(smallOrder.getOrderId(2));
        System.out.println("");

        System.out.println("Get all orders");
        System.out.println(smallOrder.getAllOrders());
    }
}
