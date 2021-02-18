package Tabla;

import DAO.FichajeDAO;
import VO.FichajeVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_FichajeVO{

   FichajeDAO dao = null;


    public void visualizar_FichajeVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codFichaje");
        dt.addColumn("Fecha");
        dt.addColumn("Hora");
        dt.addColumn("Tipo");
        dt.addColumn("AyudanteLaboratorio_DNIayu");

        dao = new FichajeDAO();
        FichajeVO vo = new FichajeVO();
        ArrayList<FichajeVO> list = dao.Listar_FichajeVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5];
                vo = list.get(i);
                fila[0] = vo.getCodFichaje();
                fila[1] = vo.getFecha();
                fila[2] = vo.getHora();
                fila[3] = vo.getTipo();
                fila[4] = vo.getAyudanteLaboratorio_DNIayu();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


