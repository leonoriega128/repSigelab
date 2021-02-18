package Tabla;

import DAO.AyudantelaboratorioDAO;
import VO.AyudantelaboratorioVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_AyudantelaboratorioVO{

   AyudantelaboratorioDAO dao = null;


    public void visualizar_AyudantelaboratorioVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("DNIayu");
        dt.addColumn("Rol");
        dt.addColumn("Usuario_Legajo");

        dao = new AyudantelaboratorioDAO();
        AyudantelaboratorioVO vo = new AyudantelaboratorioVO();
        ArrayList<AyudantelaboratorioVO> list = dao.Listar_AyudantelaboratorioVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getDNIayu();
                fila[1] = vo.getRol();
                fila[2] = vo.getUsuario_Legajo();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


