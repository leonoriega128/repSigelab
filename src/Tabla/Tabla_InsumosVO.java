package Tabla;

import DAO.InsumosDAO;
import VO.InsumosVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_InsumosVO{

   InsumosDAO dao = null;


    public void visualizar_InsumosVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codInsumo");
        dt.addColumn("Stock");
        dt.addColumn("Estado");
        dt.addColumn("Nombre");
        dt.addColumn("Descripcion");

        dao = new InsumosDAO();
        InsumosVO vo = new InsumosVO();
        ArrayList<InsumosVO> list = dao.Listar_InsumosVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[5];
                vo = list.get(i);
                fila[0] = vo.getCodInsumo();
                fila[1] = vo.getStock();
                fila[2] = vo.getEstado();
                fila[3] = vo.getNombre();
                fila[4] = vo.getDescripcion();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


