/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import controllers.ArticleFacadeLocal;
import entities.Article;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ameli
 */
@Stateless
public class GestionArticle implements GestionArticleLocal {

    
    @EJB
    private ArticleFacadeLocal articleFacade;
    
    @Override
    public String afficheArticle(Integer i) {
        return articleFacade.afficheArticle(i);
    }
     
}
