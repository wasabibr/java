/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista_04;

/**
 * Faça um programa que receba dois números, calcule e mostre a divisão
 * do primeiro pelo segundo. Sabe-se que o segundo número não pode ser zero,
 * portanto, não é necessário se preocupar com isso neste exercício.
 * @author Jefferson
 */
import java.util.Scanner;
public class atividadeQ02 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		float a = leitor.nextFloat();
		System.out.println("Digite o segundo valor:");
		float b = leitor.nextFloat();
		float divide = a / b;
		System.out.println(divide);
	}
}
