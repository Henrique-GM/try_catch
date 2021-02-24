/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Criando_execoes_personalizadas;

import entidades_criando_execoes_personalizadas.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo_exception.DominioException;

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
              
            System.out.print("Número do quarto: ");
            Integer numero = sc.nextInt();

            System.out.print("Data de Check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.print("Data de Check-out (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            
            Reserva reserva = new Reserva(numero, checkIn, checkOut);

            
            System.out.println("Reserva: " + reserva.toString());

            System.out.println();
            System.out.println("Entre com a data para atualizar a reserva");

            System.out.print("Data de Check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Data de Check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reserva.atualizarDatas(checkIn, checkOut);
            System.out.println("Reserva: " + reserva.toString());
        }
        
        catch (ParseException e) {   
            System.out.println("Formato da dataa invalido");
        }
        
        catch (DominioException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }
        
        
        
        sc.close();
    }


}
        
        



