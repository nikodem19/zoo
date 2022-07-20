/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Nikodém Babirád
 */
public class Hlavna {
    
    public static void main(String[] args) {
        Zoo zoo = new Zoo("BB");
        
        Bazen b1 = new Bazen();
        b1.umiestniZviera(new Ryba(3));
        zoo.pridajMiesto(b1);
        
        Bazen b2 = new Bazen();
        b2.umiestniZviera(new Ryba(2));
        zoo.pridajMiesto(b2);
        
        Klietka k1 = new Klietka();
        k1.umiestniZviera(new Pes(1));
        zoo.pridajMiesto(k1);
        
        Klietka k2 = new Klietka();
        k2.umiestniZviera(new Zirafa(10));
        zoo.pridajMiesto(k2);
        
        System.out.println(zoo.opis());
        
        System.out.println(k2.zviera.opis());
        System.out.println(k1.zviera.opis());
        System.out.println(b1.zviera.opis());
        System.out.println(b2.zviera.opis());        
    }
    
}
