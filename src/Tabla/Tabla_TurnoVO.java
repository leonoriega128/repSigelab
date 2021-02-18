package Tabla;

import DAO.TurnoDAO;
import VO.TurnoVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_TurnoVO{

   TurnoDAO dao = null;


    public void visualizar_TurnoVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idTurno");
        dt.addColumn("Fecha");
        dt.addColumn("Hora_Inicio");
        dt.addColumn("Hora_Finalizado");
        dt.addColumn("AyudanteLaboratorio_DNIayu");

        dao = new TurnoDAO();
        TurnoVO vo = new TurnoVO();
        ArrayList<TurnoVO> list = dao.Listar_TurnoVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5];
                vo = list.get(i);
                fila[0] = vo.getIdTurno();
                fila[1] = vo.getFecha();
                fila[2] = vo.getHora_Inicio();
                fila[3] = vo.getHora_Finalizado();
                fila[4] = vo.getAyudanteLaboratorio_DNIayu();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


