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
public class atividadeQ15 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor em Celsius:");
		float celsius = leitor.nextFloat();
		float fahrenheit = (9 * celsius) / 5 + 32;
		System.out.println("Valor em Fahrenheit: " + fahrenheit);
    }

}
