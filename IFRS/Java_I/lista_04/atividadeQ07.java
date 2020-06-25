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
public class atividadeQ07 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		float a = leitor.nextFloat();
		System.out.println("Digite a segunda nota:");
		float b = leitor.nextFloat();
                System.out.println("Digite a terceira nota:");
		float c = leitor.nextFloat();
		float mediaPond = (a + b * 2 + c * 3) / 6;
		System.out.println(mediaPond);
	}
}
