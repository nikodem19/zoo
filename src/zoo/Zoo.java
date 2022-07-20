/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikodém
 */
public class Zoo {

    private String nazov;
    private List<Miesto> miesta = new ArrayList<>();
    

    public Zoo(String nazov) {
        this.nazov = nazov;
    }
    
    public void pridajMiesto(Miesto m) {
        miesta.add(m);
        
    }
    
    public String opis() {
        return "Zoo"+nazov;
        
    }
    
}
