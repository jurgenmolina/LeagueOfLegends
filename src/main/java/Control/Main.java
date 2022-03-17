/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Principal;
import Vista.MenuPrincipal;


public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Principal p = new Principal();
       MenuPrincipal menu = new MenuPrincipal(p);
       menu.setVisible(true);
    }
    
}
