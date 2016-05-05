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
public class Address {
    
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    public Address() {

    };


    public String getStreetAddress() {
        return streetAddress;
    }

    public boolean setStreetAddress(String streetAddress) {
        if(streetAddress.length() > 2){
            this.streetAddress = streetAddress;
            return true;
        }
        else {return false;}
        
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) {
        if(city.length() > 1){
            this.city = city;
            return true;
        }
        else{return false;}
    }

    public String getState() {
        return state;
    }

    public boolean setState(String state) {
        if(state.length() ==2){
            this.state = state;
            return true;
        }
        return false;
    }

    public String getZipCode() {
        return zipCode;
    }

    public boolean setZipCode(String zipCode) {
        if(zipCode.matches("\\d{5}")){
            this.zipCode = zipCode;
            return true;
        }
        else{ return false;}
    }

    @Override
    public String toString() {
        return "Address{" + "streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + '}';
    }
    
    
    
}
