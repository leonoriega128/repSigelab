package DAO;

import Conexion.Conectar;
import VO.SolicitudlabVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SolicitudlabDAO {

    /*Metodo listar*/
    public ArrayList<SolicitudlabVO> Listar_SolicitudlabVO() {
        ArrayList<SolicitudlabVO> list = new ArrayList<SolicitudlabVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM solicitudlab;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SolicitudlabVO vo = new SolicitudlabVO();
                vo.setCodSolicitud(rs.getInt(1));
                vo.setCodLab(rs.getInt(2));
                vo.setDni(rs.getInt(3));
                vo.setLegajo(rs.getString(4));
                vo.setTipoReserva(rs.getString(5));
                vo.setFecha(rs.getString(6));
                vo.setHora(rs.getObject(7));
                vo.setEstadoSol(rs.getString(8));
                vo.setLaboratorio_CodLab(rs.getInt(9));
                vo.setMateria_codMat(rs.getObject(10));
                vo.setDocente_idDocente(rs.getInt(11));
                vo.setHoraFin(rs.getObject(12));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }


    /*Metodo agregar*/
    public void Agregar_SolicitudlabVO(SolicitudlabVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO solicitudlab (codSolicitud, CodLab, dni, Legajo, TipoReserva, Fecha, Hora, estadoSol, Laboratorio_CodLab, Materia_codMat, Docente_idDocente, HoraFin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodSolicitud());
            ps.setInt(2, vo.getCodLab());
            ps.setInt(3, vo.getDni());
            ps.setString(4, vo.getLegajo());
            ps.setString(5, vo.getTipoReserva());
            ps.setString(6, vo.getFecha());
            ps.setObject(7, vo.getHora());
            ps.setString(8, vo.getEstadoSol());
            ps.setInt(9, vo.getLaboratorio_CodLab());
            ps.setObject(10, vo.getMateria_codMat());
            ps.setInt(11, vo.getDocente_idDocente());
            ps.setObject(12, vo.getHoraFin());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Modificar*/
    public void Modificar_SolicitudlabVO(SolicitudlabVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE solicitudlab SET CodLab = ?, dni = ?, Legajo = ?, TipoReserva = ?, Fecha = ?, Hora = ?, estadoSol = ?, Laboratorio_CodLab = ?, Materia_codMat = ?, Docente_idDocente = ?, HoraFin = ? WHERE codSolicitud = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
         
            ps.setInt(1, vo.getCodLab());
            ps.setInt(2, vo.getDni());
            ps.setString(3, vo.getLegajo());
            ps.setString(4, vo.getTipoReserva());
            ps.setString(5, vo.getFecha());
            ps.setObject(6, vo.getHora());
            ps.setString(7, vo.getEstadoSol());
            ps.setInt(8, vo.getLaboratorio_CodLab());
            ps.setObject(9, vo.getMateria_codMat());
            ps.setInt(10, vo.getDocente_idDocente());
            ps.setObject(11, vo.getHoraFin());
            ps.setInt(12, vo.getCodSolicitud());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Eliminar*/
    public void Eliminar_SolicitudlabVO(SolicitudlabVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM solicitudlab WHERE codSolicitud = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodSolicitud());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

}
