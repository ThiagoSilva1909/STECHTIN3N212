/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;
        
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 182120021
 */
public class diasvidaexato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dtNascimento, hoje = LocalDate.now();
        long diasVida;

        System.out.println("Calculo de dias de vida exato");
        System.out.print("informe sua data de nascimento: ");
        dtNascimento = LocalDate.parse(leia.next(), dtf);
        System.out.println("Data Nasc: " + dtf.format(dtNascimento));
        System.out.println("Data Nask.: " +dtf.format(hoje));
        diasVida = ChronoUnit.DAYS.between(dtNascimento, hoje);
        System.out.println("Dias de Vida exato: " + diasVida);
    }

}
