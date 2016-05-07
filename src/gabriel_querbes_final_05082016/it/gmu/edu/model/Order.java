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
   
    
    
    public static final String[] BOOKS_ARRAY = {"","Computer Science 101","History 101","Geography 101","English 101","Biology 101","Algebra 101","Calculus 101"};
    public static final int BOOK_COST = 50;
    public static final int MAX_QUANTITY = 5;

    public Order() {
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        totalCost = quantity * 50.00;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean setAccountNumber(String accountNumber) {
        if(accountNumber.matches("\\d{7}")){
            this.accountNumber = accountNumber;
            return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public String toString() {
        return "Order{" + "product=" + product + ", quantity=" + quantity + ", totalCost=" + totalCost + ", paymentType=" + paymentType + ", accountNumber=" + accountNumber + '}';
    }
    
    
    
    
}
