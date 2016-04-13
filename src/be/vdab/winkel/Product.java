/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.vdab.winkel;

/**
 *
 * @author omer.aldur
 */
public class Product {
private String omschrijving="";
    private double prijs;
             
    public Product() {
    }
     
    public Product(String oms, double prijs ) {
       setOmschrijving(oms);
       setPrijs(prijs);
    }
 
    public String getOmschrijving() {
        return omschrijving;
    }
 
    public final void setOmschrijving(String omschrijving) {
        if (omschrijving != null && !omschrijving.isEmpty()) { 
            this.omschrijving = omschrijving;
        }
    }    
    
    public double getPrijs() {
        return prijs;
    }
 
    public final void setPrijs(double prijs) {
        if (prijs >=0 ){ 
            this.prijs = prijs;
        }
    }
    
    @Override 
    public boolean equals(Object o) {
        if (o == null) { 
            return false;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product) o;
        return (omschrijving.equals(p.omschrijving) && prijs == p.prijs);
    }
    
    @Override
    public int hashCode() {
        return toString().hashCode(); 
    }
    
    @Override 
    public String toString() {
        return String.format ("%s ; %.2f ",  omschrijving, prijs); 
    }
} 
