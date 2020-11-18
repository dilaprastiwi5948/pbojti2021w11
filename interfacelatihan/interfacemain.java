/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;
/**
 *
 * @author WINDOWS 10
 */
public class interfacemain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Mimi");
        PascaSarjana masterCumlaude = new PascaSarjana("Ropeah");
        
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
        pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(masterCumlaude);
    }   
}
