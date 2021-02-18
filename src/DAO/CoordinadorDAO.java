package DAO;

import Conexion.Conectar;
import VO.CoordinadorVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CoordinadorDAO{

/*Metodo listar*/
    public ArrayList<CoordinadorVO> Listar_CoordinadorVO(){
        ArrayList<CoordinadorVO> list = new ArrayList<CoordinadorVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM coordinador;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                CoordinadorVO vo = new CoordinadorVO();
                vo.setDNIc(rs.getInt(1));
                vo.setRol(rs.getString(2));
                vo.setUsuario_Legajo(rs.getInt(3));
                vo.setTurno_idTurno(rs.getInt(4));
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
    public void Agregar_CoordinadorVO(CoordinadorVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO coordinador (DNIc, Rol, Usuario_Legajo, Turno_idTurno) VALUES(?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getDNIc());
            ps.setString(2, vo.getRol());
            ps.setInt(3, vo.getUsuario_Legajo());
            ps.setInt(4, vo.getTurno_idTurno());
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
    public void Modificar_CoordinadorVO(CoordinadorVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE coordinador SET Rol = ?, Usuario_Legajo = ?, Turno_idTurno = ? WHERE DNIc = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getDNIc());
            ps.setString(2, vo.getRol());
            ps.setInt(3, vo.getUsuario_Legajo());
            ps.setInt(4, vo.getTurno_idTurno());
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
    public void Eliminar_CoordinadorVO(CoordinadorVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM coordinador WHERE DNIc = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getDNIc());
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
