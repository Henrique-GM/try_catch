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

/**
 *
 * @author Henrique
 */
public class Programa {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Número do quarto: ");
        Integer numero = sc.nextInt();
        
        System.out.print("Data de Check-in (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        
        System.out.print("Data de Check-out (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        
        if (! checkOut.after(checkIn)) {         
            System.out.println("Erro na reserva: A data do check-out deve ser depois da data de check-in");
        }
        
        else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
           
            System.out.println("Reserva: " + reserva.toString());
            
            System.out.println();
            System.out.println("Entre com a data para atualizar a reserva");
        
            System.out.print("Data de Check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Data de Check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());
            
            Date dataAgora = new Date();
            
            if (checkIn.before(dataAgora) || checkOut.before(dataAgora)) {          
                System.out.println("Erro na reserva: datas para atualização reserva tem que ser datas futuras");
            }
            
            else if (!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: A data do check-out deve ser depois da data de check-in");
            }
            
            else {
                reserva.atualizarDatas(checkIn, checkOut);
                System.out.println("Reserva: " + reserva.toString());
            }
            
            
        }
        
        sc.close();
    }
}
