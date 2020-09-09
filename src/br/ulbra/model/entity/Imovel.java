/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model.entity;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Imovel {

    private String endereco;
    private double preco;
      //construtor padrão
    public Imovel() {
    }
     //construtor passando dois atributos por parametro
    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }
   //metodos acessores (get) e modificadores (set)
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double calculaPreco(){
        return this.getPreco();
    }
    
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Os dados do imóvel são: \n"
                + "Endereço:"+this.getEndereco()+"\n"
                        + "Preço: "+this.calculaPreco());
    }
    

}
