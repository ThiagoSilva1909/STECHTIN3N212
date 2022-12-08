/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 182120021
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Array está vazio ?" + nomes.isEmpty());
        System.out.println("Quantos registros:" + nomes.size());

        nomes.add("Thiago");
        System.out.println("Depois de add valor");
        System.out.println("Array está vazio ?" + nomes.isEmpty());
        System.out.println("Quantos registros:" + nomes.size());

        System.out.println("Digite um nome");
        nomes.add(leia.next());
        System.out.println("Despois de add valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add(0, "mixaria");
        System.out.println("depois de add o valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add(3, "trulin");
        System.out.println("depois de add o valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        System.out.println("Index de Thiago" + nomes.indexOf("Thiago"));
        nomes.remove("Thiago");
        System.out.println("Resultado depois de remover Thiago");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add("André");
        nomes.add("Silvano");
        nomes.add("Bagre");
        nomes.add("Fofo");
        System.out.println("depois de add o valor");
        System.out.println("Quantos registros:" + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        Collections.sort(nomes);
        System.out.println("Array ordenado");
        System.out.println("Nomes" + nomes.toString());
    }

}
