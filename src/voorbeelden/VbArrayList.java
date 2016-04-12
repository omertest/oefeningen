/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeelden;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author omer.aldur
 */
public class VbArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            List<String> al = new ArrayList<>();         al.add("fiets"); 
        al.add(null);       //null-element toegestaan
        al.add("even");
        al.add("dak");
        al.add("citroen");
        al.add("citroen");  //dubbels toegestaan
        al.add("boom");
        al.add("aap");

        System.out.println("4e element is: " + al.get(3));         
        System.out.println("Voorbeeld van een ArrayList:"); 
        for (String woord : al ) {             System.out.println(woord);
        }
        al.add(3,"test");
        
                System.out.println("\nWeergave m.b.v. iterator");
        for ( Iterator<String> i = al.iterator(); i.hasNext(); ) {             String woord = i.next() ; 
            System.out.println(woord) ; 

    }
    
}
}
