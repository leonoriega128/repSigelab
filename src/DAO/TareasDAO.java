package DAO;

import Conexion.Conectar;
import VO.TareasVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TareasDAO{

/*Metodo listar*/
    public ArrayList<TareasVO> Listar_TareasVO(){
        ArrayList<TareasVO> list = new ArrayList<TareasVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM tareas;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                TareasVO vo = new TareasVO();
                vo.setCodTarea(rs.getInt(1));
                vo.setNombreU(rs.getString(2));
                vo.setFechaFin(rs.getString(3));
                vo.setFechaInicio(rs.getString(4));
                vo.setEstado(rs.getString(5));
                vo.setPrioridad(rs.getString(6));
                vo.setDescripcion(rs.getString(7));
                vo.setLegajoCt(rs.getInt(8));
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
    public void Agregar_TareasVO(TareasVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tareas (CodTarea, NombreU, FechaFin, FechaInicio, Estado, Prioridad, Descripcion, LegajoCt) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodTarea());
            ps.setString(2, vo.getNombreU());
            ps.setString(3, vo.getFechaFin());
            ps.setString(4, vo.getFechaInicio());
            ps.setString(5, vo.getEstado());
            ps.setString(6, vo.getPrioridad());
            ps.setString(7, vo.getDescripcion());
            ps.setInt(8, vo.getLegajoCt());
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
    public void Modificar_TareasVO(TareasVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE tareas SET NombreU = ?, FechaFin = ?, FechaInicio = ?, Estado = ?, Prioridad = ?, Descripcion = ?, LegajoCt = ? WHERE CodTarea = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodTarea());
            ps.setString(2, vo.getNombreU());
            ps.setString(3, vo.getFechaFin());
            ps.setString(4, vo.getFechaInicio());
            ps.setString(5, vo.getEstado());
            ps.setString(6, vo.getPrioridad());
            ps.setString(7, vo.getDescripcion());
            ps.setInt(8, vo.getLegajoCt());
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
    public void Eliminar_TareasVO(TareasVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tareas WHERE CodTarea = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodTarea());
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
