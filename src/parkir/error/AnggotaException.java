/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.error;

public class AnggotaException extends Exception{ 
    /** * Creates a new instance of 
     * <code>AnggotaException</code> without detail message. 
     */
    public AnggotaException() { } 
 
/** 
 * Constructs an instance of
 * <code>AdminException</code> with the specified detail message.
 * 
 * @param msg the detail message. 
 */ 
    public AnggotaException(String msg) 
    { super(msg); } 
}