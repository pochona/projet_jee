/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author ameli
 */
@Local
public interface exempleexpoLocal {

    public Long processCommande(ArrayList<Long> art);
    
}
