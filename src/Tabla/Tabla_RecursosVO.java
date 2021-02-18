package Tabla;

import DAO.RecursosDAO;
import VO.RecursosVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_RecursosVO{

   RecursosDAO dao = null;


    public void visualizar_RecursosVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("CodComputadora");
        dt.addColumn("CodLab");
        dt.addColumn("EstadoRec");

        dao = new RecursosDAO();
        RecursosVO vo = new RecursosVO();
        ArrayList<RecursosVO> list = dao.Listar_RecursosVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getCodComputadora();
                fila[1] = vo.getCodLab();
                fila[2] = vo.getEstadoRec();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


