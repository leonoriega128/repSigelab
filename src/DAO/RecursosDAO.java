package DAO;

import Conexion.Conectar;
import VO.RecursosVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class RecursosDAO{

/*Metodo listar*/
    public ArrayList<RecursosVO> Listar_RecursosVO(){
        ArrayList<RecursosVO> list = new ArrayList<RecursosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM recursos;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                RecursosVO vo = new RecursosVO();
                vo.setCodComputadora(rs.getInt(1));
                vo.setCodLab(rs.getInt(2));
                vo.setEstadoRec(rs.getString(3));
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
    public void Agregar_RecursosVO(RecursosVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO recursos (CodComputadora, CodLab, EstadoRec) VALUES(?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodComputadora());
            ps.setInt(2, vo.getCodLab());
            ps.setString(3, vo.getEstadoRec());
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
    public void Modificar_RecursosVO(RecursosVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE recursos SET CodLab = ?, EstadoRec = ? WHERE CodComputadora = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodComputadora());
            ps.setInt(2, vo.getCodLab());
            ps.setString(3, vo.getEstadoRec());
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
    public void Eliminar_RecursosVO(RecursosVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM recursos WHERE CodComputadora = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodComputadora());
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
