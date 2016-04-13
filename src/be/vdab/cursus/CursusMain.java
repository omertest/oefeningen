/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.cursus;

import java.util.Set;
import java.util.TreeSet;
import be.vdab.cursus.Cursus;

/**
 *
 * @author omer.aldur
 */
public class CursusMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Cursus> cursussen = new TreeSet<>();
        cursussen.add(new Cursus(5, "Word", 100));
        cursussen.add(new Cursus(3, "Excel", 110));
        cursussen.add(new Cursus(1, "Windows", 90));
        cursussen.add(new Cursus(4, "Access", 120));
        cursussen.add(new Cursus(2, "Powerpoint", 80));
        cursussen.add(new Cursus(6, "Photoshop", 100) ); 

        for (Cursus cursus : cursussen) {System.out.println(cursus);
    }
    }

}
