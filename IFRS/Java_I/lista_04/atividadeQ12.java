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
public class atividadeQ12 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço de fábrica do veículo:");
        float preFab = leitor.nextFloat();
        System.out.println("Digite o percentual de lucro do distribuidor:");
        float perLucDist = leitor.nextFloat();
        System.out.println("Digite o percentual de impostos:");
        float perImpost = leitor.nextFloat();

        double valImposto = preFab * (perImpost / 100);
        double valLucroDist = preFab * (perLucDist / 100);
        double preFinal = preFab + valImposto + valLucroDist;

        System.out.println("Lucro do distribuidor: " + valLucroDist);
        System.out.println("Valor dos impostos: " + valImposto);
        System.out.println("Preço final do produto: " + preFinal);
    }
}
