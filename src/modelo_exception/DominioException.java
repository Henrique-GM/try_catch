/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_exception;

/**
 *
 * @author Henrique
 */
public class DominioException extends RuntimeException{
    public static final long serialVercionUID = 1L;
    
    public DominioException(String mensagen) {
        
        super(mensagen);
    }
}
