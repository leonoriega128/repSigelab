package Tabla;

import DAO.Recursos_has_laboratorioDAO;
import VO.Recursos_has_laboratorioVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_Recursos_has_laboratorioVO{

   Recursos_has_laboratorioDAO dao = null;


    public void visualizar_Recursos_has_laboratorioVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Recursos_CodComputadora");
        dt.addColumn("Laboratorio_CodLab");

        dao = new Recursos_has_laboratorioDAO();
        Recursos_has_laboratorioVO vo = new Recursos_has_laboratorioVO();
        ArrayList<Recursos_has_laboratorioVO> list = dao.Listar_Recursos_has_laboratorioVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[2];
                vo = list.get(i);
                fila[0] = vo.getRecursos_CodComputadora();
                fila[1] = vo.getLaboratorio_CodLab();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


