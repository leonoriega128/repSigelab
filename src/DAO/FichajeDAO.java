package DAO;

import Conexion.Conectar;
import VO.FichajeVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FichajeDAO{

/*Metodo listar*/
    public ArrayList<FichajeVO> Listar_FichajeVO(){
        ArrayList<FichajeVO> list = new ArrayList<FichajeVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM fichaje;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                FichajeVO vo = new FichajeVO();
                vo.setCodFichaje(rs.getInt(1));
                vo.setFecha(rs.getString(2));
                vo.setHora(rs.getObject(3));
                vo.setTipo(rs.getString(4));
                vo.setAyudanteLaboratorio_DNIayu(rs.getInt(5));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_FichajeVO(FichajeVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO fichaje (codFichaje, Fecha, Hora, Tipo, AyudanteLaboratorio_DNIayu) VALUES(?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodFichaje());
            ps.setString(2, vo.getFecha());
            ps.setObject(3, vo.getHora());
            ps.setString(4, vo.getTipo());
            ps.setInt(5, vo.getAyudanteLaboratorio_DNIayu());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_FichajeVO(FichajeVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE fichaje SET Fecha = ?, Hora = ?, Tipo = ?, AyudanteLaboratorio_DNIayu = ? WHERE codFichaje = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodFichaje());
            ps.setString(2, vo.getFecha());
            ps.setObject(3, vo.getHora());
            ps.setString(4, vo.getTipo());
            ps.setInt(5, vo.getAyudanteLaboratorio_DNIayu());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_FichajeVO(FichajeVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM fichaje WHERE codFichaje = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodFichaje());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
