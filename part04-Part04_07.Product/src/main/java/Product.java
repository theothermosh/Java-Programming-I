/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String name, double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
    
    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
