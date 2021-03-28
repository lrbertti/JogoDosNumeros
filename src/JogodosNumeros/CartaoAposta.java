/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * linda_grassi@yahoo.com.br
 */
package JogodosNumeros;

/**
 *
 * @author lrber
 * Classe que define os numeros que foram escolhidos pelo usuario!
 * Ele instancia a classe Cartao, cria um vetor com o tam (6, 7, 8, 9 ou 10)
 * Metodos implementados:
 * Gets and Setter da variavel global
 * Sobrecarga da classe Cartao
 * Calcula aposta, definida pela quantidade de numeros escolhido pelo usuario
 * Verificação da quantidade de numeros acertados pelo usuario
 * Verificação de quais numeros foram acerteados pelo usuario
 * 
 */
public final class CartaoAposta extends Cartao{
    public int numeroAposta;
    
    /**
     *
     * @param qntade
     */
    public CartaoAposta(int qntade){
         /*
        * Criar a classe Cartao com sobrecarga de operador
        */
        super(qntade);
        if(numeroAposta == 0 ){
            numeroAposta = 1;
        }
    }
    
    public float calculaAposta(){
        /*
        * Definição do valor a ser pago pelo usuario
        * dependendo da quantidade de numeros escolhidos
        */
        switch(getContNumeros()){
            case 6:
                return (float)(3.5);
            case 7: 
                return (float)(24.5);
            case 8:
                return (98);
            case 9:
                return (294);
            case 10: 
                return(735);
            default:
                return 0;
        }
    }
    
    public int totAcertos(CartaoSorteio sorteio){
        int i =0;
        int totaAcertos = 0;
        
        /* Enquanto não acabar o numeros escolhidos
        * verificar se o numero existe nos valores sorteados 
        * de forma randomica e adicionar na variavel para mostar
        * quantos numeros ele acertou
        */
        
        do{
            if(sorteio.existe(getNumeros()[i])== false){
                totaAcertos++;
            }
            i++;
        }while(i!= getNumeros().length);
        
        return totaAcertos;             
    }
    
    public int[] valoresIguaisSorteio(CartaoSorteio sorteio){
        int i = 0;
        int[] totaAcertos = new int[6];
        int l = 0;
        
         /* Enquanto não acabar o numeros escolhidos
        * verificar se o numero existe nos valores sorteados 
        * de forma randomica e adicionar na variavel para mostrar ao 
        * usuario quais numeros foram acertados
        */
        do{
            if(sorteio.existe(getNumeros()[i])== false){
                totaAcertos[l++] = getNumeros()[i];
            }
            i++;
        }while(i != getNumeros().length);
        
        return totaAcertos;
    }
}
