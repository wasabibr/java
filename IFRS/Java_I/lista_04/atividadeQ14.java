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
public class atividadeQ14 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de salário mínimo:");
        float salMin = leitor.nextFloat();
        System.out.println("Digite a quantidade de quilowatts:");
        float quanQui = leitor.nextFloat();
        double valQui = salMin / 5;
        double valRes = quanQui * valQui;
        double valResDesc = valRes * 0.85;
        System.out.println("Valor do quilowatt: " + valQui);
        System.out.println("Valor pago pela residência: " + valRes);
        System.out.println("Valor com desconto de 15%: " + valResDesc);
    }
}
