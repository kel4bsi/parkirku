/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir.service.impl; 
import parkir.entity.Anggota; 
import parkir.error.AnggotaException;
import java.sql.*; 
import java.util.ArrayList; 
import java.util.List; 
import parkir.service.AnggotaDao; 
public class AnggotaDaoImpl implements AnggotaDao {
    private final Connection connection; 
 
private final String insertAnggota = "INSERT INTO anggota" + "(id_anggota, nama_anggota, alamat, no_telp, email, tgl_daftar)" + "VALUES (?,?,?,?,?,?)"; 
 
private final String updateAnggota = "UPDATE anggota SET nama_anggota=?, alamat=?, no_telp=?, email=? WHERE id_anggota=?"; 
 
private final String deleteAnggota = "DELETE FROM anggota WHERE id_anggota=?"; 
 
private final String getById = "SELECT * FROM anggota WHERE id_anggota=?"; 
private final String selectAll = "SELECT * FROM anggota"; 
private final String selectCount = "SELECT COUNT(*) FROM anggota WHERE id_anggota = ?"; 
 
public AnggotaDaoImpl(Connection connection) { this.connection = connection; } 
 
    /**
     *
     * @param anggota
     * @throws AnggotaException
     */
    @Override
    public void insertAnggota(Anggota anggota) 
throws AnggotaException { 
PreparedStatement statement = null;
try { connection.setAutoCommit(false); 
statement = connection.prepareStatement(insertAnggota); 
statement.setString(1, anggota.getId_anggota()); 
statement.setString(2, anggota.getNama_anggota()); 
statement.setString(3, anggota.getAlamat()); 
statement.setString(4, anggota.getNo_telp()); 
statement.setString(5, anggota.getEmail()); 

 
 
statement.setDate(6, new Date(anggota.getTgl_daftar().getTime())); statement.executeUpdate(); 
 
connection.commit(); } catch(SQLException exception) { try { connection.rollback(); } catch (SQLException ex) { } throw new AnggotaException(exception.getMessage()); } finally { try { connection.setAutoCommit(true); } catch (SQLException ex) { } if (statement != null) { try { statement.close(); } catch (SQLException exception) { } } } 
} 
 
    @Override 
    public void updateAnggota(Anggota anggota) throws AnggotaException { 
PreparedStatement statement = null; 
try { connection.setAutoCommit(false); 
statement = connection.prepareStatement(updateAnggota); 
statement.setString(1, anggota.getNama_anggota()); 
statement.setString(2, anggota.getAlamat()); 
statement.setString(3, anggota.getNo_telp()); 
statement.setString(4, anggota.getEmail()); 
statement.setString(5, anggota.getId_anggota()); 
statement.executeUpdate(); 
 
connection.commit(); } catch(SQLException exception) { try { connection.rollback(); } catch (SQLException ex) { } throw new AnggotaException(exception.getMessage()); } finally { try { connection.setAutoCommit(true); } catch (SQLException ex) { } if (statement != null) { try { 
 
 
statement.close(); } catch (SQLException exception) { } 
} 
} 
} 
 
    @Override 
    public void deleteAnggota(String id_anggota) 
        throws AnggotaException { 
    PreparedStatement statement = null; 
try { connection.setAutoCommit(false); 
statement = connection.prepareStatement(deleteAnggota); 
statement.setString(1, id_anggota); 
statement.executeUpdate(); 
 
connection.commit(); } catch(SQLException exception) { try { connection.rollback(); } catch (SQLException ex) { } throw new AnggotaException(exception.getMessage()); } finally { if (statement != null) { try { connection.setAutoCommit(true); } catch (SQLException ex) { } try { statement.close(); } catch (SQLException exception) { } } } 
} 
 
    @Override 
    public Anggota getAnggota(String id_anggota) 
        throws AnggotaException { 
    PreparedStatement statement = null; 
    try { connection.setAutoCommit(false); 
    statement = connection.prepareStatement(getById); 
    statement.setString(1, id_anggota); 
 
ResultSet result = statement.executeQuery(); 
Anggota anggota = null; 
if (result.next()) { anggota = new Anggota();
anggota.setNama_anggota(result.getString("nama_anggota"));
anggota.setAlamat(result.getString("alamat")); 
anggota.setNo_telp(result.getString("no_telp")); 
 
 
 
anggota.setEmail(result.getString("email")); 
} else { 
    throw new AnggotaException("Data Anggota Tidak Ada!!!"); 
} connection.commit(); 
return anggota; 
    } catch(SQLException exception) { 
        try { connection.setAutoCommit(true); 
        } catch (SQLException ex) { }
        throw new AnggotaException(exception.getMessage());
    } finally { 
        try { connection.setAutoCommit(true); 
        } catch (SQLException ex) { } 
        if (statement != null) { try { statement.close(); 
        } catch (SQLException exception) { } } } 
} 
 
    /**
     *
     * @return
     * @throws AnggotaException
     */
    @Override 
    public List<Anggota> selectAllAnggota() 
        throws AnggotaException { Statement statement = null;
List<Anggota> list = new ArrayList<>(); 
try { connection.setAutoCommit(false); 
statement = connection.createStatement(); 
ResultSet result = statement.executeQuery(selectAll); 
while(result.next()){ Anggota anggota = new Anggota(); 
anggota.setId_anggota(result.getString("id_anggota")); 
anggota.setNama_anggota(result.getString("nama_anggota")); 
anggota.setAlamat(result.getString("alamat")); 
anggota.setNo_telp(result.getString("no_telp")); 
anggota.setEmail(result.getString("email")); 
anggota.setTgl_daftar(result.getDate("tgl_daftar")); 
 
list.add(anggota); 
} connection.commit(); return list; } catch (SQLException exception) { try { 

 
 
connection.setAutoCommit(true); 
} catch (SQLException ex) { } throw new AnggotaException(exception.getMessage());
} finally { try { connection.setAutoCommit(true); 
} catch (SQLException ex) { } if (statement != null) { try { statement.close();
} catch (SQLException exception) { } } } 
} 
 
    /**
     *
     * @param anggota
     * @return
     * @throws AnggotaException
     */
    @Override 
    public int selectCount(Anggota anggota) throws AnggotaException { PreparedStatement statement = null; 
ResultSet resultSet = null; 
int rowCount = 0; 
try { connection.setAutoCommit(false); 
statement = connection.prepareStatement(selectCount); 
statement.setString(1, anggota.getId_anggota()); 
resultSet = statement.executeQuery(); 
connection.commit(); 
while (resultSet.next()) { rowCount = resultSet.getInt(1);
} } catch (SQLException exception) { try { connection.rollback();
} catch (SQLException ex) { } throw new AnggotaException(exception.getMessage()); 
} finally { try { connection.setAutoCommit(true); 
if (resultSet != null) { resultSet.close();
} } catch (SQLException ex) { } if (statement != null) { try { statement.close(); 
} catch (SQLException exception) { } 

 
 
} 
} return rowCount; 
} 
} 