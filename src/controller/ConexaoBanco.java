/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author emerson.farias
 */
public class ConexaoBanco{
    
    private final String servidor;
    private final String banco;
    private final String usuario;
    private final String senha;

        public ConexaoBanco()
        {
        this.servidor = "localhost";
        this.banco = "sytemerp";
        this.usuario = "root";
        this.senha = "";
        }

        //metodo de conexão
        public Connection getConexao(){

            try {
                //tentar estabelecer a conexão.
                Connection conn = DriverManager.getConnection("jdbc:mysql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);

                Statement stmt = conn.createStatement();

                return conn;
                
            } catch (SQLException e) {
                //se deu erro na hora de conectar
                System.out.println("Erro ao Conectar"+e.getMessage());
                return null;
            }
        }

}
