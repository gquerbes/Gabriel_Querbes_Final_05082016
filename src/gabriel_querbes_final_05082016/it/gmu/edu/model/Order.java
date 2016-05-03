/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabriel_querbes_final_05082016.it.gmu.edu.model;

/**
 * @author gabrielquerbes
 */
public class Order {
    private String product;
    private int quantity;
    private double totalCost;
    private String paymentType;
    private String accountNumber;
    private Address shippingAddress;
    private Address billingAddresss;
    
    
    public static final String[] BOOKS_ARRAY = {"Computer Science 101","History 101","Geography 101","English 101","Biology 101","Algebra 101","Calculus 101"};
    public static final int BOOK_COST = 50;
    public static final int MAX_QUANTITY = 5;
    
    
}
