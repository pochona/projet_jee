/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier_Teyssie;

import controllers.ArticleFacadeLocal;
import entities.Article;
import entities.Commande;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ameli
 */
@Stateless
public class exempleexpo implements exempleexpoLocal {

    @EJB
    private exempleLocal exemple;

    @EJB
    private ArticleFacadeLocal articleFacade;

    public Long processCommande(ArrayList<Long> art) {
            Article a = this.articleFacade.find(art.get(0));
            Commande c = this.exemple.processCommande(new ArrayList<Article>((Collection<? extends Article>) a));
        return new Long(c.getId());
            }
}
