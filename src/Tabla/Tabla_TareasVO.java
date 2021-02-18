package Tabla;

import DAO.TareasDAO;
import VO.TareasVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_TareasVO{

   TareasDAO dao = null;


    public void visualizar_TareasVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("CodTarea");
        dt.addColumn("NombreU");
        dt.addColumn("FechaFin");
        dt.addColumn("FechaInicio");
        dt.addColumn("Estado");
        dt.addColumn("Prioridad");
        dt.addColumn("Descripcion");
        dt.addColumn("LegajoCt");

        dao = new TareasDAO();
        TareasVO vo = new TareasVO();
        ArrayList<TareasVO> list = dao.Listar_TareasVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getCodTarea();
                fila[1] = vo.getNombreU();
                fila[2] = vo.getFechaFin();
                fila[3] = vo.getFechaInicio();
                fila[4] = vo.getEstado();
                fila[5] = vo.getPrioridad();
                fila[6] = vo.getDescripcion();
                fila[7] = vo.getLegajoCt();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


