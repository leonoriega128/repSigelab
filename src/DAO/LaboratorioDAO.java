package DAO;

import Conexion.Conectar;
import VO.LaboratorioVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LaboratorioDAO{

/*Metodo listar*/
    public ArrayList<LaboratorioVO> Listar_LaboratorioVO(){
        ArrayList<LaboratorioVO> list = new ArrayList<LaboratorioVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM laboratorio;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                LaboratorioVO vo = new LaboratorioVO();
                vo.setCodLab(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setCapacidad(rs.getString(3));
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
    public void Agregar_LaboratorioVO(LaboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO laboratorio (CodLab, Nombre, Capacidad) VALUES(?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodLab());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getCapacidad());
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
    public void Modificar_LaboratorioVO(LaboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE laboratorio SET Nombre = ?, Capacidad = ? WHERE CodLab = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodLab());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getCapacidad());
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
    public void Eliminar_LaboratorioVO(LaboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM laboratorio WHERE CodLab = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodLab());
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
