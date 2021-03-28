/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogodosNumeros;

import java.util.Arrays;

/**
 *
 * @author lrber
 * Classe Pai Cartao
 * Definição de quantidades de numero no Cartao
 * E os numeros escolhidos(sorteados) no vetor
 */
public class Cartao {
    private int numeros[];
    private int contNumeros;
    
    /*
    * Get's das variaveis
    */

    public int[] getNumeros() {
        return numeros;
    }

    public int getContNumeros() {
        return contNumeros;
    }
    
    /*
    *   Construtor da classe
    */
    public Cartao(int tam) {
        numeros = new int[tam];
        contNumeros = 0;
    }
    
    /*
    * Adicionar os numeros no vetor
    * Só pode adicionar no vetor se o numero ainda não existe
    * e o numero for diferente de 0 (Random pode gerar numero 0)
    * e ainda tiver espaço disponivel no vetor para adicionar o
    * numero
    */
    public int addNumeros(int numero){
      if (existe(numero) == true && contNumeros < numeros.length)
      {
          numeros[contNumeros++] = numero;
          return 1;
      }
      else if(contNumeros == numeros.length){
          return 3;
      }
       return 0;
    }
   
    /*
    * Verificar se o numero adicionado já está no vetor
    */
    public boolean existe(int NumeroProcurado){
       if (contNumeros == 0){
           return true;
       }
       int i = 0;
       do{
           if(numeros[i] == NumeroProcurado){
               return false;
           }
           i++;
       }while(i!= contNumeros);
       
       return true;
    }
   
    /*
    * retornar os numeros do cartao em forma de String
    * Mais facil mostrar no FORM
    */
    public String numerosCartao(){
       Arrays.sort(numeros);
       return Arrays.toString(numeros);
    }

}
