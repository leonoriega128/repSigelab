package DAO;

import Conexion.Conectar;
import VO.SolicitudinsumosVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SolicitudinsumosDAO{

/*Metodo listar*/
    public ArrayList<SolicitudinsumosVO> Listar_SolicitudinsumosVO(){
        ArrayList<SolicitudinsumosVO> list = new ArrayList<SolicitudinsumosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM solicitudinsumos;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SolicitudinsumosVO vo = new SolicitudinsumosVO();
                vo.setCodSolInsumo(rs.getInt(1));
                vo.setFecha(rs.getString(2));
                vo.setHora(rs.getObject(3));
                vo.setEstadoS(rs.getString(4));
                vo.setInsumos_codInsumo(rs.getInt(5));
                vo.setAyudanteLaboratorio_DNIayu(rs.getInt(6));
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
    public void Agregar_SolicitudinsumosVO(SolicitudinsumosVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO solicitudinsumos (CodSolInsumo, Fecha, Hora, EstadoS, Insumos_codInsumo, AyudanteLaboratorio_DNIayu) VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodSolInsumo());
            ps.setString(2, vo.getFecha());
            ps.setObject(3, vo.getHora());
            ps.setString(4, vo.getEstadoS());
            ps.setInt(5, vo.getInsumos_codInsumo());
            ps.setInt(6, vo.getAyudanteLaboratorio_DNIayu());
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
    public void Modificar_SolicitudinsumosVO(SolicitudinsumosVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE solicitudinsumos SET Fecha = ?, Hora = ?, EstadoS = ?, Insumos_codInsumo = ?, AyudanteLaboratorio_DNIayu = ? WHERE CodSolInsumo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodSolInsumo());
            ps.setString(2, vo.getFecha());
            ps.setObject(3, vo.getHora());
            ps.setString(4, vo.getEstadoS());
            ps.setInt(5, vo.getInsumos_codInsumo());
            ps.setInt(6, vo.getAyudanteLaboratorio_DNIayu());
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
    public void Eliminar_SolicitudinsumosVO(SolicitudinsumosVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM solicitudinsumos WHERE CodSolInsumo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodSolInsumo());
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
