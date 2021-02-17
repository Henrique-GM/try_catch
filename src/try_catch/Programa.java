/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        metodo_2();      
        System.out.println("Fim do programa");
    }
    
    public static void metodo_2() {
        
        System.out.println("METODO_2 INICIADO");
        metodo();
        System.out.println("METODO FINALIZADO");
    }
    
    public static void metodo() {
        
        System.out.println("METODO INICIADO");
        Scanner sc = new Scanner(System.in);
        
        try {        
            String[] vetor = sc.nextLine().split(" ");
            Integer posicao = sc.nextInt();            
            System.out.println(vetor[posicao]);
        }
        
        catch (ArrayIndexOutOfBoundsException estouroDeArray) {          
            System.out.println("Posição invalida");
            //Imprime na tela o rastreamento do stack
            estouroDeArray.printStackTrace();
        }
        
        catch (InputMismatchException palavrasEmVezDeNumeros) {      
            System.out.println("Entrada incorreta");
        }
        
        sc.close();
        System.out.println("METODO FINALIZADO");
    }
}
