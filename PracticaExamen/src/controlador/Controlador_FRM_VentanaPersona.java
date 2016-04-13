/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosPersonas;
import vista.FRM_VentanaPersona;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_VentanaPersona implements ActionListener{
    
    FRM_VentanaPersona frm_VentanaPersona;
    MetodosPersonas metodosPersonas;
    public Controlador_FRM_VentanaPersona(FRM_VentanaPersona frm_VentanaPersona)
    {
        this.frm_VentanaPersona = frm_VentanaPersona;
        metodosPersonas= new MetodosPersonas();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Consultar"))
        {
            buscar();
        }
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            metodosPersonas.agregarPersona(frm_VentanaPersona.obtenerInformacionParaGuardar());
            System.out.println("Persona agregada con éxito");
        }
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodosPersonas.modificarPersona(frm_VentanaPersona.obtenerInformacionParaGuardar());
            System.out.println("Modificado");
        }
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodosPersonas.eliminarPersona(frm_VentanaPersona.devolverCedula());
            System.out.println("Eliminado");
        }
    }
    
    public void buscar()
    {
        if(metodosPersonas.verificarExistencia(frm_VentanaPersona.devolverCedula()))
        {
            frm_VentanaPersona.mostrarInformacion(metodosPersonas.getInformacionConsultada());
        }
        
        else
        {
            System.out.print("No encontrado");
        }
    }
    
}
