/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tes;

/**
 *
 * @author Venom
 */
public class Produk{
    private long id;
    private String productName;
    private String bpom;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBpom() {
        return bpom;
    }

    public void setBpom(String bpom) {
        this.bpom = bpom;
    }

      
    @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return getId() + " | " + getProductName() + " | " + getBpom();
    	}
}
