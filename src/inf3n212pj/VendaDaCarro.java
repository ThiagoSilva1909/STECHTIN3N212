/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 182120021
 */
public class VendaDaCarro {

    /* 
O custo de um carro novo ao consumidor é a soma do custo de 
fábrica com a porcentagem do distribuidor e dos impostos 
(aplicados ao custo de fábrica). Supondo que o percentual 
do distribuidor seja de 28% e os impostos de 45%, escrever 
um algoritmo para ler o custo de fábrica de um carro, calcular
e escrever o custo final ao consumidor;
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        double custo, custoTotal, imposto = 0.45, porcentagem = 0.28;
        System.out.println("Digite o valor do carro ");
        custo = leia.nextDouble();
        custoTotal = (custo + (custo * imposto) + custo * porcentagem);
        System.out.println("CUSTO DO CONSUMIDOR É: " + custoTotal);
        
    }

}
