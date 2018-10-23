/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.service; 
//import parkir.entity.Lokasi;
//kalo ada kesalahan ,import di atas saya rubah karena tidak digunakan
import parkir.entity.Sewa; 
import parkir.error.SewaException; 
import java.util.List; 
 
public interface SewaDao { 
public void insertSewa(Sewa sewa) throws SewaException; 
public void updateSewa(Sewa sewa) throws SewaException; 
public void updateKeluar(Sewa sewa) throws SewaException;  
public void deleteSewa(int id_sewa) throws SewaException;  
public List<Sewa> getSewa(String id_anggota) throws SewaException;  
} 
