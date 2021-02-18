package DAO;

import Conexion.Conectar;
import VO.MateriaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MateriaDAO{

/*Metodo listar*/
    public ArrayList<MateriaVO> Listar_MateriaVO(){
        ArrayList<MateriaVO> list = new ArrayList<MateriaVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM materia;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                MateriaVO vo = new MateriaVO();
                vo.setCodMat(rs.getObject(1));
                vo.setTipo(rs.getString(2));
                vo.setLegajo(rs.getString(3));
                vo.setNombre(rs.getString(4));
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
    public void Agregar_MateriaVO(MateriaVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO materia (codMat, tipo, legajo, nombre) VALUES(?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setObject(1, vo.getCodMat());
            ps.setString(2, vo.getTipo());
            ps.setString(3, vo.getLegajo());
            ps.setString(4, vo.getNombre());
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
    public void Modificar_MateriaVO(MateriaVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE materia SET tipo = ?, legajo = ?, nombre = ? WHERE codMat = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setObject(1, vo.getCodMat());
            ps.setString(2, vo.getTipo());
            ps.setString(3, vo.getLegajo());
            ps.setString(4, vo.getNombre());
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
    public void Eliminar_MateriaVO(MateriaVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM materia WHERE codMat = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setObject(1, vo.getCodMat());
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
