/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.entity;
import java.util.Date;
public class Sewa
{ 
private int id_sewa;    
private String id_anggota,kode_lokasi; 
private Date in,out;

public Sewa() { } 
 
public Sewa( String id_anggota, String kode_lokasi,int id_sewa,Date in,Date out) 
{ 
this.id_sewa = id_sewa; 
this.id_anggota = id_anggota; 
this.kode_lokasi = kode_lokasi; 
this.in = in;
this.out = out;
} 
 
public String getKode_lokasi() 
{ return kode_lokasi; } 
public void setKode_lokasi(String kode_lokasi) 
{ this.kode_lokasi = kode_lokasi; }

 public String getId_anggota()
{ return id_anggota; } 
public void setId_anggota(String id_anggota) 
{ this.id_anggota = id_anggota; }

 public int getId_sewa() 
{ return id_sewa; } 
 public void setId_sewa(int id_sewa) 
{ this.id_sewa = id_sewa; }
 
 public Date getIn() 
{ return in; } 
 public void setIn(Date in) 
{ this.in = in; }
 
 public Date getOut() 
{ return out; } 
 public void setOut(Date out) 
{ this.out = out; }
 
}