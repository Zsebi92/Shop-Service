package model;


import java.util.List;

public class Service {

    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderRepo();


    public Product getProductId(Integer productId){
        return productRepo.getProductById(productId);
    }

    public List<Product> getAllProducts(){
        return productRepo.listOfProducts();
    }

    public Product add(Product product) {
        return productRepo.addProduct(product);
    }

    public Order addOrder(Order order) {
        return orderRepo.addOrder(order);
    }

    public Order getOrderId(Integer orderId) {
        return orderRepo.getOrder(orderId);
    }

    public List<Order> getAllOrders() {
        return orderRepo.listOfOrders();
    }
}
