package DAO;

import Conexion.Conectar;
import VO.Recursos_has_laboratorioVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Recursos_has_laboratorioDAO{

/*Metodo listar*/
    public ArrayList<Recursos_has_laboratorioVO> Listar_Recursos_has_laboratorioVO(){
        ArrayList<Recursos_has_laboratorioVO> list = new ArrayList<Recursos_has_laboratorioVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM recursos_has_laboratorio;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Recursos_has_laboratorioVO vo = new Recursos_has_laboratorioVO();
                vo.setRecursos_CodComputadora(rs.getInt(1));
                vo.setLaboratorio_CodLab(rs.getInt(2));
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
    public void Agregar_Recursos_has_laboratorioVO(Recursos_has_laboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO recursos_has_laboratorio (Recursos_CodComputadora, Laboratorio_CodLab) VALUES(?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getRecursos_CodComputadora());
            ps.setInt(2, vo.getLaboratorio_CodLab());
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
    public void Modificar_Recursos_has_laboratorioVO(Recursos_has_laboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE recursos_has_laboratorio SET Laboratorio_CodLab = ? WHERE Recursos_CodComputadora = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getRecursos_CodComputadora());
            ps.setInt(2, vo.getLaboratorio_CodLab());
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
    public void Eliminar_Recursos_has_laboratorioVO(Recursos_has_laboratorioVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM recursos_has_laboratorio WHERE Recursos_CodComputadora = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getRecursos_CodComputadora());
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
