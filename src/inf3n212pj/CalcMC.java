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
public class CalcMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float peso, altura, imc;
        System.out.println("Calculo de imc");
        System.out.println("digite sua altura ");
        altura = leia.nextFloat();
        System.out.println("digite sua peso ");
        peso = leia.nextFloat();
        imc = peso / (altura * altura);
        System.out.println("resultado mc " + imc);

    }

}
