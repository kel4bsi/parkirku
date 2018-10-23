/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.service; 
 
import parkir.entity.Anggota; 
import parkir.error.AnggotaException; 
import java.util.List; 
 
public interface AnggotaDao { 
public void insertAnggota(Anggota anggota) throws AnggotaException;
 public void updateAnggota(Anggota anggota) throws AnggotaException; 
public void deleteAnggota(String id_anggota) throws AnggotaException; 
public Anggota getAnggota(String id_anggota) throws AnggotaException; 
public int selectCount(Anggota anggota) throws AnggotaException; 
public List<Anggota> selectAllAnggota() throws AnggotaException; 
}