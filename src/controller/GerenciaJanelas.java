/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author emerson.farias
 */
public class GerenciaJanelas {
    
    private static JDesktopPane jDesktopPane;
    
    public GerenciaJanelas(JDesktopPane jDesktopPane){
        GerenciaJanelas.jDesktopPane = jDesktopPane;
    }
    
    public void abrirJanelas(JInternalFrame jInternalFrame){
        if(jInternalFrame.isVisible()){
            jInternalFrame.toFront();
            jInternalFrame.requestFocus();
        }
        else
        {
            jDesktopPane.add(jInternalFrame);
            jInternalFrame.setVisible(true);
        } 
    }
}
