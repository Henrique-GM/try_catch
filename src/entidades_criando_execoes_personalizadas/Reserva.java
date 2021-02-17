/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades_criando_execoes_personalizadas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Henrique
 */
public class Reserva {
    
    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reserva(Integer numeroQuarto, Date chekIn, Date chekOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = chekIn;
        this.checkOut = chekOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getChekIn() {
        return checkIn;
    }

    public Date getChekOut() {
        return checkOut;
    }
  
    public long duracao() {
        //Pegando os milisegundos
        long diff = checkOut.getTime() - checkIn.getTime();
        //Converte para dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public void atualizarDatas(Date chekIn, Date chekOut) {
        this.checkIn = chekIn;
        this.checkOut = chekOut;
    }

    @Override
    public String toString() {
        return "Quarto "
            + numeroQuarto
            + ", chek-in: "
            + sdf.format(checkIn)
            + ", check-out: "
            + sdf.format(checkOut)
            + (", ") 
            + duracao()
            + " noites";    
    }
    
    
}
