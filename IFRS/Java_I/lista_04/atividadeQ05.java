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
public class atividadeQ05 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o salário base:");
		float salBase = leitor.nextFloat();
                double salFinal = (salBase * 1.05) * 0.93;
		System.out.println(salFinal);
	}
}
