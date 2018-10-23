/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.error;

public class LokasiException extends Exception{ 
    /** * Creates a new instance of 
     * <code>AdminException</code> without detail message. 
     */
    public LokasiException() { } 
 
/** 
 * Constructs an instance of
 * <code>AdminException</code> with the specified detail message.
 * 
 * @param msg the detail message. 
 */ 
    public LokasiException(String msg) 
    { super(msg); } 
}