package Tabla;

import DAO.LaboratorioDAO;
import VO.LaboratorioVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_LaboratorioVO{

   LaboratorioDAO dao = null;


    public void visualizar_LaboratorioVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("CodLab");
        dt.addColumn("Nombre");
        dt.addColumn("Capacidad");

        dao = new LaboratorioDAO();
        LaboratorioVO vo = new LaboratorioVO();
        ArrayList<LaboratorioVO> list = dao.Listar_LaboratorioVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getCodLab();
                fila[1] = vo.getNombre();
                fila[2] = vo.getCapacidad();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


