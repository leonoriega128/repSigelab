package DAO;

import Conexion.Conectar;
import VO.UsuarioVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UsuarioDAO{

/*Metodo listar*/
    public ArrayList<UsuarioVO> Listar_UsuarioVO(){
        ArrayList<UsuarioVO> list = new ArrayList<UsuarioVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM usuario;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                UsuarioVO vo = new UsuarioVO();
                vo.setLegajo(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setPassword(rs.getString(3));
                vo.setRol(rs.getString(4));
                vo.setApellido(rs.getString(5));
                vo.setDireccion(rs.getString(6));
                vo.setEstadoU(rs.getString(7));
                vo.setTelefono(rs.getString(8));
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
    public void Agregar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO usuario (Legajo, Nombre, Password, Rol, Apellido, Direccion, EstadoU, Telefono) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getLegajo());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getPassword());
            ps.setString(4, vo.getRol());
            ps.setString(5, vo.getApellido());
            ps.setString(6, vo.getDireccion());
            ps.setString(7, vo.getEstadoU());
            ps.setString(8, vo.getTelefono());
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
    public void Modificar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE usuario SET Nombre = ?, Password = ?, Rol = ?, Apellido = ?, Direccion = ?, EstadoU = ?, Telefono = ? WHERE Legajo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getLegajo());
            ps.setString(2, vo.getNombre());
            ps.setString(3, vo.getPassword());
            ps.setString(4, vo.getRol());
            ps.setString(5, vo.getApellido());
            ps.setString(6, vo.getDireccion());
            ps.setString(7, vo.getEstadoU());
            ps.setString(8, vo.getTelefono());
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
    public void Eliminar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM usuario WHERE Legajo = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getLegajo());
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
