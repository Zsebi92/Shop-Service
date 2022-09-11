package model;

import java.util.*;

public class ProductRepo {

    private Map<Integer, Product> products = new HashMap<>();


    public List<Product> listOfProducts(){
        ArrayList<Product> productList = new ArrayList<>(products.values());
        return productList;
    }

    public Product getProductById(Integer productId){
        return products.get(productId);
    }

    public Product addProduct(Product product){
        Product addingProducts = products.put(product.getProductId(), product);
        return addingProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductRepo that = (ProductRepo) o;

        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return products != null ? products.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
