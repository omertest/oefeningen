/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voorbeelden;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author omer.aldur
 */
public class VbHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
        Map<String, String> landen = new HashMap<>();
        //2
        landen.put("B", "Belgie");
        landen.put("NL", "Nederland");
        landen.put("F", "Frankrijk");
        landen.put("D", "Duitsland");
        landen.put("L", "Luxemburg");
        //3
        String eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);
        //4
        String vorigLand = landen.put("F", "Finland");
        System.out.println("Vorig land met code F: " + vorigLand);
        eenLand = landen.get("F");
        System.out.println("Land met code F: " + eenLand);
        //5
        System.out.println("\n***View van Keys ***");
        for (String eenLandcode : landen.keySet()) {
            System.out.println(eenLandcode);
        }
        //6
        System.out.println("\n*** Vieuw van de Keys met bijhorende value-waarde***");
        for (String eenLandcode : landen.keySet()) {
            System.out.println(eenLandcode + " heeft als landnaam: " + landen.get(eenLandcode));
        }
        //7
        System.out.println("\n*** View van de Values ***");
        for (String eenLandnaam : landen.values()) {
            System.out.println(eenLandnaam);
        }
        System.out.println("\n *** View van de Key-Value-Paren ***");
        for (Entry eenLandEntry : landen.entrySet()) {
            System.out.println(eenLandEntry);

        }
    }
}
