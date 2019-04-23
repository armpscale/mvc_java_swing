/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcsample;

import javax.swing.SwingUtilities;

import mvcsample.models.*;
import mvcsample.views.*;
import mvcsample.controllers.*;

/**
 *
 * @author ArmPScale
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model(0);
                View view = new View("-");
                Controller controller = new Controller(model, view);
                controller.control();
            }
        });
    }

}
