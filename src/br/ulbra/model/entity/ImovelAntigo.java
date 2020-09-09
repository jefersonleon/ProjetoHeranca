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
public class ImovelAntigo extends Imovel {

    public ImovelAntigo(String endereco, double preco) {
        super(endereco, preco);
    }
    
       public double calculaPreco(){
        return this.getPreco()*0.9;
    }
    
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Os dados do imóvel são: \n"
                + "Endereço:"+this.getEndereco()+"\n"
                        + "Preço: "+this.calculaPreco()+"\n"
                                + " ** Imóvel Antigo! **");
    }
    
}
