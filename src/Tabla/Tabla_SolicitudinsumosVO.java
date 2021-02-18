package Tabla;

import DAO.SolicitudinsumosDAO;
import VO.SolicitudinsumosVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_SolicitudinsumosVO{

   SolicitudinsumosDAO dao = null;


    public void visualizar_SolicitudinsumosVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("CodSolInsumo");
        dt.addColumn("Fecha");
        dt.addColumn("Hora");
        dt.addColumn("EstadoS");
        dt.addColumn("Insumos_codInsumo");
        dt.addColumn("AyudanteLaboratorio_DNIayu");

        dao = new SolicitudinsumosDAO();
        SolicitudinsumosVO vo = new SolicitudinsumosVO();
        ArrayList<SolicitudinsumosVO> list = dao.Listar_SolicitudinsumosVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getCodSolInsumo();
                fila[1] = vo.getFecha();
                fila[2] = vo.getHora();
                fila[3] = vo.getEstadoS();
                fila[4] = vo.getInsumos_codInsumo();
                fila[5] = vo.getAyudanteLaboratorio_DNIayu();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


