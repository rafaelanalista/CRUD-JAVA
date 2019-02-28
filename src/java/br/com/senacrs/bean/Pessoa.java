/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.bean;
import java.io.Serializable;
/**
 *
 * @author rafael
 */
public class Pessoa implements Serializable{
    private String nome;
    private String sobrenome;
    private Endereco endereco;
    
    public Pessoa(){
        nome = "";
        sobrenome = "";
        endereco = new Endereco();
     }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome=sobrenome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
}
