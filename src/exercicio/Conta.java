/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author Henrique
 */
public class Conta {
    
    private Integer numero;
    private String cliente;
    private Double saldo;
    private Double limiteDeSaque;
    
    public Conta() {
    }

    public Conta(Integer numero, String cliente, Double saldo, Double limiteDeSaque) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque; 
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

   public void deposito(Double moutante) {
       
       saldo += moutante;
   }
   
   public void saque(Double moutante) {
       
       if (moutante > limiteDeSaque) {
           throw new DominioExecao("Ultrapassou a limite de saque");
       }
       
       if (saldo == 0.0) {
           throw new DominioExecao("Não pussue saldo");
       }
       
       else {
           saldo -= moutante;
       }
   }

   
}
