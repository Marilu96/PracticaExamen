/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FRM_VentanaPersona;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener {
    
     FRM_VentanaPersona frm_VentanaPersona;
    
     public Controlador_FRM_VentanaPrincipal()
    {
        frm_VentanaPersona = new FRM_VentanaPersona();
    
    }
    
   
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Salir"))
        {
            System.exit(0);
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Personas"))
        {
            frm_VentanaPersona.setVisible(true);
        }
    
    }
    
}
