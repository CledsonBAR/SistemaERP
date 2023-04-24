/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Categoria;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author emerson.farias
 */
public class CategoriaDao {
    
    private final ConexaoBanco conexao;
    private final Connection conn;
    
    public CategoriaDao()
    {
        this.conexao = new ConexaoBanco();
        this.conn = this.conexao.getConexao();
    }    
    
    public void inserir(Categoria categoria) 
    {
      
        String sql = "INSERT INTO categorias (nomecategoria) VALUES (?)";
        
        try 
        {           
            PreparedStatement stmt = this.conn.prepareStatement(sql);   
            stmt.setString(1, categoria.getNomecategoria());

            stmt.execute();
            stmt.close();

        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao inserir Curso:"+e.getMessage());
        } 
    }
    
        public Categoria getCategoria(int id){
        
        String sql = "SELECT * FROM categorias WHERE idcategoria = ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);    
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            Categoria categoria = new Categoria();
            
            rs.next();
            
            categoria.setIdcategorias(id);
            categoria.setNomecategoria(rs.getString("nomecategoria"));
            categoria.setDatacadastro(rs.getDate("datacadastro"));
            
            return categoria;           
            
        } catch (SQLException e) {
            System.out.println("Erro na Consulta"+e.getMessage());
            return null;
        }
    }
       
}
