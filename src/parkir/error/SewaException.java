/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.error; 
 
public class SewaException extends Exception{ 
    /** * Creates a new instance of * 
     * <code>SewaException</code> without detail message.
     */ public SewaException() { } 
 
/** * Constructs an instance of 
 * <code>SewaException</code> with the specified detail message. 
 * 
 * @param msg the detail message. 
 */ 
     public SewaException(String msg) 
     { 
         super(msg); 
     } 
} 