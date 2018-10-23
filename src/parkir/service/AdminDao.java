/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.service; 
 
import parkir.entity.Admin; 
import parkir.error.AdminException; 
 
public interface AdminDao { 
public int selectCount(Admin admin) throws AdminException; 
public Admin getAdmin(int id_admin) throws AdminException; 
} 
 