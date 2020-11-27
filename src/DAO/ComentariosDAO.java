package DAO;

import Conexion.Conectar;
import VO.ComentariosVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ComentariosDAO{

/*Metodo listar*/
    public ArrayList<ComentariosVO> Listar_ComentariosVO(){
        ArrayList<ComentariosVO> list = new ArrayList<ComentariosVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM comentarios;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ComentariosVO vo = new ComentariosVO();
                vo.setIdComentarios(rs.getInt(1));
                vo.setCodTarea(rs.getInt(2));
                vo.setNombUsuario(rs.getString(3));
                vo.setFecha(rs.getString(4));
                vo.setHora(rs.getObject(5));
                vo.setComentario(rs.getString(6));
                vo.setAyudanteLaboratorio_DNIayu(rs.getInt(7));
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
    public void Agregar_ComentariosVO(ComentariosVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO comentarios (idComentarios, codTarea, nombUsuario, Fecha, Hora, Comentario, AyudanteLaboratorio_DNIayu) VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdComentarios());
            ps.setInt(2, vo.getCodTarea());
            ps.setString(3, vo.getNombUsuario());
            ps.setString(4, vo.getFecha());
            ps.setObject(5, vo.getHora());
            ps.setString(6, vo.getComentario());
            ps.setInt(7, vo.getAyudanteLaboratorio_DNIayu());
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
    public void Modificar_ComentariosVO(ComentariosVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE comentarios SET codTarea = ?, nombUsuario = ?, Fecha = ?, Hora = ?, Comentario = ?, AyudanteLaboratorio_DNIayu = ? WHERE idComentarios = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdComentarios());
            ps.setInt(2, vo.getCodTarea());
            ps.setString(3, vo.getNombUsuario());
            ps.setString(4, vo.getFecha());
            ps.setObject(5, vo.getHora());
            ps.setString(6, vo.getComentario());
            ps.setInt(7, vo.getAyudanteLaboratorio_DNIayu());
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
    public void Eliminar_ComentariosVO(ComentariosVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM comentarios WHERE idComentarios = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdComentarios());
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
