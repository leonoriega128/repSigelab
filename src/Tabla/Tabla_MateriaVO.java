package Tabla;

import DAO.MateriaDAO;
import VO.MateriaVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_MateriaVO{

   MateriaDAO dao = null;


    public void visualizar_MateriaVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codMat");
        dt.addColumn("tipo");
        dt.addColumn("legajo");
        dt.addColumn("nombre");

        dao = new MateriaDAO();
        MateriaVO vo = new MateriaVO();
        ArrayList<MateriaVO> list = dao.Listar_MateriaVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[4];
                vo = list.get(i);
                fila[0] = vo.getCodMat();
                fila[1] = vo.getTipo();
                fila[2] = vo.getLegajo();
                fila[3] = vo.getNombre();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


