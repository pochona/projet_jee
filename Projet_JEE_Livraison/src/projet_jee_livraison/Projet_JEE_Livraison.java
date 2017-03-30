/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_jee_livraison;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import metiers.livraison.GestionLivraisonDistRemote;

/**
 *
 * @author Amaury_PC
 */
public class Projet_JEE_Livraison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {

        System.setProperty("java.naming.factory.initial",
                "com.sun.enterprise.naming.SerialInitContextFactory");
        System.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
        System.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
        InitialContext context = new InitialContext();

        GestionLivraisonDistRemote g = (GestionLivraisonDistRemote) context.lookup("metiers.livraison.GestionLivraisonDistRemote");

    }
}