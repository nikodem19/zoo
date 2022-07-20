/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Nikodém
 */
public class Ryba extends Zviera implements Plavajuce{
    int vydrz;
    
    @Override
    public void plavaj(){
        System.out.println("plavam!");
        
    }

    public Ryba(int vydrz) {
        this.vydrz = vydrz;
    }
    
    @Override
    public String opis() {
           return "Ryba s vydrzou "+vydrz;
    }
    
}
