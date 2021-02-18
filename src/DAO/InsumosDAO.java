package DAO;

import Conexion.Conectar;
import VO.InsumosVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class InsumosDAO{

/*Metodo listar*/
    public ArrayList<InsumosVO> Listar_InsumosVO(){
        ArrayList<InsumosVO> list = new ArrayList<InsumosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM insumos;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                InsumosVO vo = new InsumosVO();
                vo.setCodInsumo(rs.getInt(1));
                vo.setStock(rs.getInt(2));
                vo.setEstado(rs.getString(3));
                vo.setNombre(rs.getString(4));
                vo.setDescripcion(rs.getString(5));
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
    public void Agregar_InsumosVO(InsumosVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO insumos (codInsumo, Stock, Estado, Nombre, Descripcion) VALUES(?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodInsumo());
            ps.setInt(2, vo.getStock());
            ps.setString(3, vo.getEstado());
            ps.setString(4, vo.getNombre());
            ps.setString(5, vo.getDescripcion());
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
    public void Modificar_InsumosVO(InsumosVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE insumos SET Stock = ?, Estado = ?, Nombre = ?, Descripcion = ? WHERE codInsumo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodInsumo());
            ps.setInt(2, vo.getStock());
            ps.setString(3, vo.getEstado());
            ps.setString(4, vo.getNombre());
            ps.setString(5, vo.getDescripcion());
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
    public void Eliminar_InsumosVO(InsumosVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM insumos WHERE codInsumo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodInsumo());
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
