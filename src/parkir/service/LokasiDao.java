/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.service; 
 
import parkir.entity.Lokasi; 
import parkir.error.LokasiException; 
import java.util.List; 
 
public interface LokasiDao { 
public void insertLokasi(Lokasi lokasi) throws LokasiException; 
public void updateLokasi(Lokasi lokasi) throws LokasiException; 
public void updateSewaLokasi(String kode_lokasi) throws LokasiException; 
public void updateKeluar(String kode_lokasi) throws LokasiException; 
public void deleteLokasi(String kode_lokasi) throws LokasiException; 
public Lokasi getLokasi(String kode_lokasi) throws LokasiException;
public List<Lokasi> top10BukuFavorit() throws LokasiException;
public List<Lokasi> top10BukuBaru() throws LokasiException;
public List<Lokasi> selectAllBuku() throws LokasiException;
} 
