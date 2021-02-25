/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Exercicio {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Entre com o número da conta: ");
            Integer numero = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome do cliente: ");
            String Nome = sc.nextLine();

            System.out.print("Incira o saldo inicial: ");
            Double saldo = sc.nextDouble();

            System.out.print("Incira o limite de saque: ");
            Double limiteDeSaque = sc.nextDouble();


            Conta conta = new Conta(numero, Nome, saldo, limiteDeSaque);


            System.out.println();
            System.out.print("Insira à quantidade de saque: ");
            Double moutante = sc.nextDouble();
            conta.saque(moutante);

            System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
        }
        
        catch(DominioExecao e) {
            System.out.println();
            System.out.println("Erro no saque: " + e.getMessage());
            e.printStackTrace();
        }   
         
        sc.close();
    }
}
