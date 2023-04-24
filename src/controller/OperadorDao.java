/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.sun.tools.javac.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.OperadorModel;

/**
 *
 * @author Emerson.Farias
 */
public class OperadorDao {
    
    private final ConexaoBanco conexao;
    private final Connection conn;
    
    public OperadorDao()
    {
        this.conexao = new ConexaoBanco();
        this.conn = this.conexao.getConexao();
    }   
    
    public void inserir(OperadorModel operador){
        String sql = "INSERT INTO USU_OPERADOR( nm_operador, nr_matricular, nr_cpf, usu_senha ) VALUES (?,?,?,?)";
        try 
        {
            try (PreparedStatement stmt = this.conn.prepareStatement(sql)) 
            {
                stmt.setString(1, operador.getNomeOperador());
                stmt.setInt(2, operador.getMatricularOperador());
                stmt.setString(3, operador.getCpfOperador());
                stmt.setString(4, operador.getSenhaOperador());
                
                stmt.execute();
            }               
        }
        catch (SQLException e) 
        {
            System.out.println("controller.OperadorDao.inserir()"+e.getMessage());
        }
    }
     
    public void excluir(int id){
        String sql = "DELETE FROM USU_OPERADOR WHERE id_operador = ?"; 
        
        try 
        {
          try(PreparedStatement stmt = this.conn.prepareStatement(sql))
          {
            stmt.setInt(1, id);
          
            stmt.execute();
          } 
        } catch (SQLException e) {
            System.out.println("controller.OperadorDao.excluir()"+e.getMessage());
        }
    }
    public void editar(OperadorModel operador)
    {
       String sql = "UPDATE USU_OPERADOR set nm_operador = ?, nr_matricular = ?, nr_cpf = ?, usu_senha = ? WHERE id_operador = ?";
        try 
        {   
          PreparedStatement stmt = this.conn.prepareStatement(sql);

          stmt.setString(1, operador.getNomeOperador());
          stmt.setInt(2, operador.getMatricularOperador());
          stmt.setString(3, operador.getCpfOperador());
          stmt.setString(4, operador.getSenhaOperador());
          stmt.setInt(5, operador.getId());

          stmt.execute();
          
        }
        catch (SQLException e)
        {
            System.out.println("controller.OperadorDao.editar()"+e.getMessage());
        }
    }
    
    public OperadorModel getOperador(int id){
        
        String sql = "SELECT * FROM USU_OPERADOR WHERE id_operador = ?";
        
        try 
        {
            try(PreparedStatement stmt = this.conn.prepareStatement(sql))
            {    
                
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            OperadorModel operador = new OperadorModel();
            
            rs.next();
            
            operador.setId(id);
            operador.setNomeOperador(rs.getString("nm_operador"));
            operador.setMatricularOperador(rs.getInt("nr_matricular"));
            operador.setCpfOperador(rs.getString("nr_cpf"));
            operador.setDataCadadastro(rs.getString("dt_cadastro"));
            operador.setSenhaOperador(rs.getString("usu_senha"));
            
            return operador;           
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro na Consulta"+e.getMessage());
            return null;
        }
    }
    
    
    public List<OperadorModel> getOperadores(){
        
        return null;
        
    }
}
