/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabriel_querbes_final_05082016.it.gmu.edu.model;

/**
 *
 * @author gabrielquerbes
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Address shippingAddress;
    private Address billingAddresss;
    private Order[] orders =  new Order [3];
    
    
      public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) {
        if(firstName.length() > 0){
            this.firstName = firstName;
            return true;
        }
        else {return false;}
    }

    public String getLastName() {
        return lastName;
    }

    public boolean setLastName(String lastName) {
        if(lastName.length() > 0){
            this.lastName = lastName;
            return true;
        }
        else {return false;}
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddresss() {
        return billingAddresss;
    }

    public void setBillingAddresss(Address billingAddresss) {
        this.billingAddresss = billingAddresss;
    }

    public Order getOrders() {
        Order aOrder= orders[0];
        return aOrder;
    }

    public void setOrders(Order order) {

            orders[0] = order;

    
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", shippingAddress=" + shippingAddress + ", billingAddresss=" + billingAddresss + ", orders=" + orders[0] + '}';
    }



}

    
