/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.aulaHeranca;

import br.ulbra.model.entity.Imovel;
import br.ulbra.model.entity.ImovelAntigo;
import br.ulbra.model.entity.ImovelNovo;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Principal {
    public static void main(String[] args) {
        Imovel im;
        String endereco;
        double preco;
        int op, cod;
        for(;;){
            op = Integer.parseInt(
                    JOptionPane.showInputDialog("Qual imovel vc deseja cadastrar\n"
                   + "1 - Novo\n"
                   + "2 - Antigo\n"
                   + "3 - Sair"));
            if(op == 3){
                JOptionPane.showMessageDialog(null, "Bye!!");
                break;
            }
            endereco = JOptionPane.showInputDialog("Qual endereço do imóvel?");
            preco = Double.parseDouble(
                    JOptionPane.showInputDialog("Qual o preço do imovel?"));
            if(op == 1){
                cod = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite 1 - Sem juros\n "
                                                + "2 - Com juros"));
                if(cod==1){
                   im = new Imovel(endereco, preco);
                   im.imprime();
                }else{
                    im = new ImovelNovo(endereco, preco);
                    im.imprime();
                }
            }else if(op == 2){
                 cod = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite 1 - Sem desconto\n "
                                                + "2 - Com Desconto"));  
                if(cod==1){ 
                 
                   im = new Imovel(endereco, preco);
                   im.imprime();
                }else{ 
                    im = new ImovelAntigo(endereco, preco);
                    im.imprime();
                }
     
            }else{
                JOptionPane.showMessageDialog(null, "Opção inválida!!");
            }
            
        }
    }
    
}
