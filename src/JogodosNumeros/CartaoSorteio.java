/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogodosNumeros;

import java.util.Random;

/**
 *
 * @author lrber
 * Classe que define os numeros que serão sorteados!
 * Ele instancia a classe Cartao, cria um vetor com o tam (6)
 * e chama a função de addNumeros para adicionar o numero sorteado randomicamente
 * 
 */
public class CartaoSorteio extends Cartao{

    
    public CartaoSorteio(int tam) {
        /*
        * Criar a classe Cartao com sobrecarga de operador
        */
        super(tam);
        sorteiaNumeros();
    }
    
    public void sorteiaNumeros(){
        Random valor = new Random();
        /* Enquanto o retorno for igual a 1 (pode adiconar o numero no vetor) ou igual a 4 (valor passado randomicamente = 0)
        *  Sortear numeros no intervalo de 0 a 50!
        */
        while(getContNumeros()<6){
            addNumeros(valor.nextInt(50)+1);
        }
    }
}
