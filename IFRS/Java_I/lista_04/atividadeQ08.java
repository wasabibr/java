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
public class atividadeQ08 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor da base:");
		float base = leitor.nextFloat();
		System.out.println("Digite o valor da altura:");
		float altura = leitor.nextFloat();
                double area = (base * altura) / 2;
		System.out.println(area);
	}
}
