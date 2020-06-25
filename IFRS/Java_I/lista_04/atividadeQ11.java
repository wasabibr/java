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
public class atividadeQ11 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite ano de nascimento:");
		float anoNasc = leitor.nextFloat();
		System.out.println("Digite o ano atual:");
		float anoAtual = leitor.nextFloat();
		float idadeAnos = anoAtual - anoNasc;
                float idadeMeses = idadeAnos * 12;
                float idadeDias = idadeAnos * 360;
                float idadeSemanas = idadeAnos * 52;
		System.out.println("Idade em anos: " + idadeAnos);
		System.out.println("Idade em meses: " + idadeMeses);
		System.out.println("Idade em dias: " + idadeDias);
		System.out.println("Idade em semanas: " + idadeSemanas);
	}
}