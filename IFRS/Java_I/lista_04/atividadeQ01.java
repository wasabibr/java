/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista_04;

/**
 * Faça um programa que receba dois números, calcule e mostre
 *  a subtração do primeiro número pelo segundo.
 * @author Jefferson
 */

import java.util.Scanner;
public class atividadeQ01 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		float a = leitor.nextFloat();
		System.out.println("Digite o segundo valor:");
		float b = leitor.nextFloat();
		float subtrai = a - b;
		System.out.println(subtrai);
	}
}
