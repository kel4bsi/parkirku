/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.entity;
public class Lokasi
{ 
private int jml_tempat,jml_tersedia,jml_disewa,statistik;    
private String kode_lokasi,nama_lokasi; 

public Lokasi() { } 
 
public Lokasi( String kode_lokasi, String nama_lokasi,int jml_tempat,int jml_tersedia,int jml_disewa,int statistik) 
{ 
this.jml_tempat = jml_tempat; 
this.jml_tersedia = jml_tersedia; 
this.jml_disewa = jml_disewa; 
this.statistik = statistik;
this.kode_lokasi = kode_lokasi;
this.nama_lokasi = nama_lokasi;
} 
 
public String getKode_lokasi() 
{ return kode_lokasi; } 
public void setKode_lokasi(String kode_lokasi) 
{ this.kode_lokasi = kode_lokasi; }

 public String getNama_lokasi()
{ return nama_lokasi; } 
public void setNama_lokasi(String nama_lokasi) 
{ this.nama_lokasi = nama_lokasi; }

 public int getJml_tempat() 
{ return jml_tempat; } 
 public void setJml_tempat(int jml_tempat) 
{ this.jml_tempat = jml_tempat; }
 
 public int getJml_tersedia() 
{ return jml_tersedia; } 
 public void setJml_tersedia(int jml_tersedia) 
{ this.jml_tersedia = jml_tersedia; }
 
 public int getJml_disewa() 
{ return jml_disewa; } 
 public void setJml_disewa(int jml_disewa) 
{ this.jml_disewa = jml_disewa; }
 
 public int getStatistik() 
{ return statistik; } 
 public void setStatistik(int statistik) 
{ this.statistik = statistik; }
 
}