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
public class Bazen extends Miesto{
    
    public void umiestniZviera(Plavajuce p) {
        this.zviera = (Zviera)p;
        
    }

    @Override
    public String opis() {
        if(zviera!=null) {
            return zviera.opis() + " v bazene;";  
        } else {
            return "prazdny bazen";
        }
        
    }
    
}
