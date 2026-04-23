/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_proyecto_uvg;

import org.jvnet.substance.SubstanceLookAndFeel;
import view.Menu;

/**
 *
 * @author Windows 10
 */
public class Ejemplo_Proyecto_UVG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistSilverSkin");
        Menu principal = new Menu();
        principal.setVisible(true);
    }
    
}
