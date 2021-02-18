package Tabla;

import DAO.CoordinadorDAO;
import VO.CoordinadorVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_CoordinadorVO{

   CoordinadorDAO dao = null;


    public void visualizar_CoordinadorVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("DNIc");
        dt.addColumn("Rol");
        dt.addColumn("Usuario_Legajo");
        dt.addColumn("Turno_idTurno");

        dao = new CoordinadorDAO();
        CoordinadorVO vo = new CoordinadorVO();
        ArrayList<CoordinadorVO> list = dao.Listar_CoordinadorVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getDNIc();
                fila[1] = vo.getRol();
                fila[2] = vo.getUsuario_Legajo();
                fila[3] = vo.getTurno_idTurno();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


