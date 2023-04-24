/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Emerson Farias
 */
public class Ultilitarios {
  
    public void InserirIcone(JFrame frm){
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagem/background/favicon.png"));
        } catch (Exception e) {
            System.out.println("model.Ultilitarios.InserirIcone()"+e);
        }
    }
}
