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
public class NotasEscolaresVetorMatrizMenu {

    //declaração global 
    static Scanner leia = new Scanner(System.in);
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(".:Sistema de Notas:.");
        System.out.println("Informe o núm. de alunos: ");
        nAlunos = (int) leiaFloat();
        System.out.println("Quantas notas por aluno: ");
        nNotas = (int) leiaFloat();

        //inicializar vetor e matriz de alunos e notas 
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];

        int opM;
        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {//escolha do portugol
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!");
                    break;
                default:
                    System.out.println("Opção inválida,tende novamente!");
                    break;

            }
        } while (opM != 0);

    }//fim main

    public static void menu() {
        System.out.println("1 - Inserir alunos e notas ");
        System.out.println("2 - imprimir alunos e notas");
        System.out.println("0 - Sair");
        System.out.println("Digite aqui:");

    }

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println("Tente novamente: ");
            return leiaFloat();
        }
    }//fim do leia float

    private static void inserirAlunoNotas() {
        if (contAlunos < nAlunos) {
            System.out.print("informa o nome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int i = 0; i < nNotas; i++) {
                System.out.println("Informe a " + (i + 1) + "ª nota:");
                notas[contAlunos][i] = leiaFloat();
                notas[contAlunos][nNotas] += notas[contAlunos][i];

            }//fim for
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("Não é possivel mais digitar alunos."
                    + "\nNúm.máximo de posições obtidos.");

        }

    }

    private static void imprimirAlunosNotas() {
        for (int i = 0; i < contAlunos; i++){
            System.out.printf(alunos[i] + "sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7){
                System.out.println("\nVocê aprovou!");
            } else {
                System.out.println("\nVocê não aprovou!");
            }
        }
    }
}
