/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacetugas;

/**
 *
 * @author WINDOWS 10
 */
public class MultipleInterfaceMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "Hehehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haum Haum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaar Roaaar", "Coklat");
        
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        
        gorilla.displayBinatang();
        gorilla.displayMakan();
        gorilla.displayData();
        
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
    }
}
