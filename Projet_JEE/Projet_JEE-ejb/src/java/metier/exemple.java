/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import controllers.ArticleFacadeLocal;
import controllers.CommandeFacadeLocal;
import entities.Article;
import entities.Commande;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ameli
 */
@Stateless
public class exemple implements exempleLocal {

    @EJB
    private ArticleFacadeLocal articleFacade;

    @EJB
    private CommandeFacadeLocal commandeFacade;

    
    @Override
    public Commande processCommande(ArrayList<Article> art) {
       // creer cmd
       Commande cmd = new Commande();
       
       // ajout arti
       this.commandeFacade.create(cmd);
       return cmd;
    }

}
