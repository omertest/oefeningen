/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeelden;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author omer.aldur
 */
public class VbLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            List<String> ll = new LinkedList<>();
        ll.add("fiets");
        ll.add(null);       //null-element toegestaan
        ll.add("even");
        ll.add("dak");
        ll.add("citroen");
        ll.add("citroen");  //dubbels toegestaan
        ll.add("boom");
        ll.add("aap");
        System.out.println("4e element is: " + ll.get(3));
        
        ll.add(3, "test");
        
         
        
        System.out.println("Voorbeeld van een LinkedList:");        for (String woord : ll ) {
            System.out.println(woord);
        }
        System.out.println("\nWeergave m.b.v. iterator"); 
        for ( Iterator<String> i = ll.iterator(); i.hasNext(); ) {            String woord = i.next() ;
            System.out.println(woord) ;

    }
                System.out.println("\nExtra methods");
        LinkedList llijst = (LinkedList) ll;         System.out.println(llijst.getFirst());         System.out.println(llijst.getLast()); 
        llijst.addFirst("eerste");         llijst.addLast("laatste"); 
        System.out.println(llijst.getFirst()); 
        System.out.println(llijst.getLast());

        System.out.println(llijst.removeFirst());         System.out.println(llijst.removeLast()); 
        System.out.println(llijst.getFirst()); 
        System.out.println(llijst.getLast());
    
}
}
