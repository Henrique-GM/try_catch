/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloco_finally;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Henrique
 */
public class Bloco_Finally {

    public static void main(String[] args) {

        {
            File file = new File("C:\\Users\\Henrique\\Documents\\NetBeansProjects\\in.txt");
            Scanner sc = null;
            try {
                sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                
            } catch (IOException e) {
                System.out.println("Erro ao abrir arquivo: " + e.getMessage());
            
            } finally {
                if (sc != null) {
                    sc.close();
                }
                System.out.println("Bloco final finally executado");
            }
        }
    }

}
