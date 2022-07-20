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
public class Zirafa extends Zviera implements Behajuce{
    public int dlzkaKrku;

    public Zirafa(int dlzkaKrku) {
        this.dlzkaKrku = dlzkaKrku;
    }
    
    
    @Override
    public void bez() {
        System.out.println("bez!");
    }
    
    @Override
    public String opis(){
        return "Zirafa s krkom "+dlzkaKrku;
        
    }
    
}
