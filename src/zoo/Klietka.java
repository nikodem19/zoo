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
public class Klietka extends Miesto{
    
    public void umiestniZviera(Behajuce b) {
    this.zviera = (Zviera)b;
    }
    
    public void umiestniZviera(Lietajuce l) {
    this.zviera = (Zviera)l;
    }

    @Override
    public String opis() {
        if(zviera!=null) {
            return zviera.opis() + " v klietke;";  
        } else {
            return "prazdna klietka.";
        }    
        
    }
    
}
