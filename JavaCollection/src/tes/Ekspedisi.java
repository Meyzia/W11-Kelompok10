/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tes;

/**
 *
 * @author Venom
 */
public class Ekspedisi {
    private Status status;
    private City city;
    private ServicePackage servicePackage;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ServicePackage getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(ServicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(int priceItem) {
        this.priceItem = priceItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return getProductName() + " | " + getQuantity() + " | " + getWeight() + " | "
    	          + getCity().getDestination() + " | " + getServicePackage().getService() + "| "
    	          + getServicePackage().getValue() + " | " + (getPriceItem() + getServicePackage().getValue());
    	}
}
