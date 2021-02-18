package Tabla;

import DAO.SolicitudlabDAO;
import VO.SolicitudlabVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_SolicitudlabVO{

   SolicitudlabDAO dao = null;


    public void visualizar_SolicitudlabVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codSolicitud");
        dt.addColumn("CodLab");
        dt.addColumn("dni");
        dt.addColumn("Legajo");
        dt.addColumn("TipoReserva");
        dt.addColumn("Fecha");
        dt.addColumn("Hora");
        dt.addColumn("estadoSol");
        dt.addColumn("Laboratorio_CodLab");
        dt.addColumn("Materia_codMat");
        dt.addColumn("Docente_idDocente");
        dt.addColumn("HoraFin");

        dao = new SolicitudlabDAO();
        SolicitudlabVO vo = new SolicitudlabVO();
        ArrayList<SolicitudlabVO> list = dao.Listar_SolicitudlabVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[12];
                vo = list.get(i);
                fila[0] = vo.getCodSolicitud();
                fila[1] = vo.getCodLab();
                fila[2] = vo.getDni();
                fila[3] = vo.getLegajo();
                fila[4] = vo.getTipoReserva();
                fila[5] = vo.getFecha();
                fila[6] = vo.getHora();
                fila[7] = vo.getEstadoSol();
                fila[8] = vo.getLaboratorio_CodLab();
                fila[9] = vo.getMateria_codMat();
                fila[10] = vo.getDocente_idDocente();
                fila[11] = vo.getHoraFin();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


