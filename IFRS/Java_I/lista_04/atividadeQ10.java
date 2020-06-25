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
public class atividadeQ10 {
    public static void main(String[] args){
                Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor em pés:");
		float pes = leitor.nextFloat();
		float polegadas = pes / 12;
                float jardas = pes * 3;
                float milhas = jardas * 1760;
		System.out.println("Valor em pés: " + pes);
		System.out.println("Valor em polegadas: " + polegadas);
		System.out.println("Valor em jardas: " + jardas);
		System.out.println("Valor em milhas: " + milhas);
	}
}
