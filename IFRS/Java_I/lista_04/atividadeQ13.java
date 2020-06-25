/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista_04;

/**
 *
 * @author Jefferson
 */
import java.util.Scanner;
public class atividadeQ13 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas:");
        float horasTrab = leitor.nextFloat();
        System.out.println("Digite o valor de salário mínimo:");
        float salMin = leitor.nextFloat();
        double salBruto = horasTrab * (salMin * 0.1);
        double imposto = salBruto * 0.03;
        double salFinal = salBruto - imposto;
        System.out.println("Salário final: " + salFinal);
    }
}