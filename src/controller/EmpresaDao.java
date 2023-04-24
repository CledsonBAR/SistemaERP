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
import model.EmpresaModel;

/**
 *
 * @author Efari
 */
public class EmpresaDao {
    
    private final ConexaoBanco conexao;
    private final Connection conn;
    
    public EmpresaDao()
    {
        this.conexao = new ConexaoBanco();
        this.conn = this.conexao.getConexao();
    }   
    
    public void inserir(EmpresaModel empresa){
        String sql = "INSERT INTO EMPRESA( nm_empresa, nr_cnpj) VALUES (?,?)";
       
        try 
        {
           PreparedStatement stmt = this.conn.prepareStatement(sql);
                
           stmt.setString(1, empresa.getNomeempresa());
           stmt.setString(2, empresa.getCnpj());

           stmt.execute();
                
        }
        catch (SQLException e) 
        {
            System.out.println("controller.OperadorDao.inserir()"+e.getMessage());
        }
    }
     
    public void excluir(int id){
        
        String sql = "DELETE FROM EMPRESA WHERE id_empresa = ?"; 
        
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
    public void editar(EmpresaModel empresa)
    {
       String sql = "UPDATE EMPRESA set nm_empresa = ? , nr_cnpj = ? WHERE id_empresa = ?";
        try 
        {   
          PreparedStatement stmt = this.conn.prepareStatement(sql);

          stmt.setString(1, empresa.getNomeempresa());
          stmt.setString(2, empresa.getCnpj());
          stmt.setInt(3, empresa.getIdempresa());

          stmt.execute();
          
        }
        catch (SQLException e)
        {
            System.out.println("controller.OperadorDao.editar()"+e.getMessage());
        }
    }
    
    public EmpresaModel getEmpresa(int id){
        
        String sql = "SELECT * FROM EMPRESA WHERE id_empresa = ?";
        
        try 
        {
            try(PreparedStatement stmt = this.conn.prepareStatement(sql))
            {    
                
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            EmpresaModel empresa = new EmpresaModel();
            
            rs.next();
            
            empresa.setIdempresa(id);
            empresa.setNomeempresa(rs.getString("nm_empresa"));
            empresa.setCnpj(rs.getString("nr_cnpj"));
            empresa.setDatacadastro(rs.getString("dt_cadastro"));
            
            return empresa;           
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro na Consulta"+e.getMessage());
            return null;
        }
    }
    
    
    public List<EmpresaModel> getOperadores(){
        
        return null;
        
    }
}
