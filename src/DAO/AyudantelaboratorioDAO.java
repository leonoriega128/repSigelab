package DAO;

import Conexion.Conectar;
import VO.AyudantelaboratorioVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AyudantelaboratorioDAO{

/*Metodo listar*/
    public ArrayList<AyudantelaboratorioVO> Listar_AyudantelaboratorioVO(){
        ArrayList<AyudantelaboratorioVO> list = new ArrayList<AyudantelaboratorioVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM ayudantelaboratorio;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                AyudantelaboratorioVO vo = new AyudantelaboratorioVO();
                vo.setDNIayu(rs.getInt(1));
                vo.setRol(rs.getString(2));
                vo.setUsuario_Legajo(rs.getInt(3));
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
    public void Agregar_AyudantelaboratorioVO(AyudantelaboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO ayudantelaboratorio (DNIayu, Rol, Usuario_Legajo) VALUES(?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getDNIayu());
            ps.setString(2, vo.getRol());
            ps.setInt(3, vo.getUsuario_Legajo());
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
    public void Modificar_AyudantelaboratorioVO(AyudantelaboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE ayudantelaboratorio SET Rol = ?, Usuario_Legajo = ? WHERE DNIayu = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getDNIayu());
            ps.setString(2, vo.getRol());
            ps.setInt(3, vo.getUsuario_Legajo());
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
    public void Eliminar_AyudantelaboratorioVO(AyudantelaboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM ayudantelaboratorio WHERE DNIayu = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getDNIayu());
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
