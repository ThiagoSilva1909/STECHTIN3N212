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
public class NotasEscolaresVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float notas[] = new float[5];
        System.out.println("quantas notas você quer ?");
        System.out.println("Notas Escolares");
        for (int i = 0; i < 4; i++) {//para do portugol
            //laço "do" para garantir que a nota esteja entre 0 e 10
            do {//faça enquanto do portugol
                System.out.println("Digite a " + (i + 1) + " nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {// "||" pipe é o or "&&" é and 
                    System.out.println("Nota inválida!");
                }
            } while (validaNota(notas[i]));//fim do "do"
            notas[4] += notas[i];

        }//fim do for
        notas[4] = notas[4] / 4;

        System.out.println("Sua média foi de " + notas[4]);
        if (notas[4] >= 7) {
            System.out.println(",parabéns seu mongolão.");
        } else {
            System.out.println(",Infelizmente você não aprovou fdp.");
        }

    }//fim da main

    public static boolean validaNota(float nota) {

        return nota < 0 || nota > 10;
    }//fim do validaNota

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println("Erro" + e.getMessage());
            System.out.print("Tente novamente");
            return leiaFloat();
        }

    }

}
