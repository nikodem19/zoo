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
public class Pes extends Zviera implements Behajuce, Plavajuce{
    float poslusnost;

    public Pes(float poslusnost) {
        this.poslusnost=poslusnost;
    }
    

    @Override
    public void plavaj(){
        System.out.println("plavam!");  
    }
    
    @Override
    public void bez(){
        System.out.println("bez!");
    }
        

    @Override
    String opis() {
        return "Pes s poslusnostou "+poslusnost;
    }
}
