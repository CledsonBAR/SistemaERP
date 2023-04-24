/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author emerson.farias
 */
public class OperadorModel {
    private int id;	
    private String nomeOperador;
    private String cpfOperador;
    private int matricularOperador;
    private String senhaOperador;
    private String dataCadadastro;

    public OperadorModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeOperador() {
        return nomeOperador;
    }

    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }

    public String getCpfOperador() {
        return cpfOperador;
    }

    public void setCpfOperador(String cpfOperador) {
        this.cpfOperador = cpfOperador;
    }

    public int getMatricularOperador() {
        return matricularOperador;
    }

    public void setMatricularOperador(int matricularOperador) {
        this.matricularOperador = matricularOperador;
    }

    public String getSenhaOperador() {
        return senhaOperador;
    }

    public void setSenhaOperador(String senhaOperador) {
        this.senhaOperador = senhaOperador;
    }

    public String getDataCadadastro() {
        return dataCadadastro;
    }

    public void setDataCadadastro(String dataCadadastro) {
        this.dataCadadastro = dataCadadastro;
    }
    
}
