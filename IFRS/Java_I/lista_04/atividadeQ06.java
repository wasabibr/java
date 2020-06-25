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
public class atividadeQ06 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o salário base:");
		float salBase = leitor.nextFloat();
		System.out.println("Digite o valor das vendas:");
		float valorVendas = leitor.nextFloat();
                double valorComissao = valorVendas * 0.04;
                double salFinal = salBase + valorComissao;
		System.out.println("Valor da comissão: " + valorComissao);
		System.out.println("Salário final: " + salFinal);
	}
}
