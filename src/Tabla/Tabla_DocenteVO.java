package Tabla;

import DAO.DocenteDAO;
import VO.DocenteVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_DocenteVO{

   DocenteDAO dao = null;


    public void visualizar_DocenteVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("IdDoc");
        dt.addColumn("Rol");
        dt.addColumn("Usuario_Legajo");
        dt.addColumn("dni");

        dao = new DocenteDAO();
        DocenteVO vo = new DocenteVO();
        ArrayList<DocenteVO> list = dao.Listar_DocenteVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getIdDoc();
                fila[1] = vo.getRol();
                fila[2] = vo.getUsuario_Legajo();
                fila[3] = vo.getDni();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


