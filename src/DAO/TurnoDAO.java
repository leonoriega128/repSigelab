package DAO;

import Conexion.Conectar;
import VO.TurnoVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TurnoDAO{

/*Metodo listar*/
    public ArrayList<TurnoVO> Listar_TurnoVO(){
        ArrayList<TurnoVO> list = new ArrayList<TurnoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM turno;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                TurnoVO vo = new TurnoVO();
                vo.setIdTurno(rs.getInt(1));
                vo.setFecha(rs.getString(2));
                vo.setHora_Inicio(rs.getObject(3));
                vo.setHora_Finalizado(rs.getObject(4));
                vo.setAyudanteLaboratorio_DNIayu(rs.getInt(5));
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
    public void Agregar_TurnoVO(TurnoVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO turno (idTurno, Fecha, Hora_Inicio, Hora_Finalizado, AyudanteLaboratorio_DNIayu) VALUES(?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdTurno());
            ps.setString(2, vo.getFecha());
            ps.setObject(3, vo.getHora_Inicio());
            ps.setObject(4, vo.getHora_Finalizado());
            ps.setInt(5, vo.getAyudanteLaboratorio_DNIayu());
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
    public void Modificar_TurnoVO(TurnoVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE turno SET Fecha = ?, Hora_Inicio = ?, Hora_Finalizado = ?, AyudanteLaboratorio_DNIayu = ? WHERE idTurno = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdTurno());
            ps.setString(2, vo.getFecha());
            ps.setObject(3, vo.getHora_Inicio());
            ps.setObject(4, vo.getHora_Finalizado());
            ps.setInt(5, vo.getAyudanteLaboratorio_DNIayu());
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
    public void Eliminar_TurnoVO(TurnoVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM turno WHERE idTurno = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdTurno());
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
