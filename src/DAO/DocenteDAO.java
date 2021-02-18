package DAO;

import Conexion.Conectar;
import VO.DocenteVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DocenteDAO{

/*Metodo listar*/
    public ArrayList<DocenteVO> Listar_DocenteVO(){
        ArrayList<DocenteVO> list = new ArrayList<DocenteVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM docente;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                DocenteVO vo = new DocenteVO();
                vo.setIdDoc(rs.getInt(1));
                vo.setRol(rs.getString(2));
                vo.setUsuario_Legajo(rs.getInt(3));
                vo.setDni(rs.getString(4));
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
    public void Agregar_DocenteVO(DocenteVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO docente (IdDoc, Rol, Usuario_Legajo, dni) VALUES(?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdDoc());
            ps.setString(2, vo.getRol());
            ps.setInt(3, vo.getUsuario_Legajo());
            ps.setString(4, vo.getDni());
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
    public void Modificar_DocenteVO(DocenteVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE docente SET Rol = ?, Usuario_Legajo = ?, dni = ? WHERE IdDoc = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdDoc());
            ps.setString(2, vo.getRol());
            ps.setInt(3, vo.getUsuario_Legajo());
            ps.setString(4, vo.getDni());
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
    public void Eliminar_DocenteVO(DocenteVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM docente WHERE IdDoc = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdDoc());
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
