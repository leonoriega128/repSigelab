package Tabla;

import DAO.UsuarioDAO;
import VO.UsuarioVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_UsuarioVO{

   UsuarioDAO dao = null;


    public void visualizar_UsuarioVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("Legajo");
        dt.addColumn("Nombre");
        dt.addColumn("Password");
        dt.addColumn("Rol");
        dt.addColumn("Apellido");
        dt.addColumn("Direccion");
        dt.addColumn("EstadoU");
        dt.addColumn("Telefono");

        dao = new UsuarioDAO();
        UsuarioVO vo = new UsuarioVO();
        ArrayList<UsuarioVO> list = dao.Listar_UsuarioVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[8];
                vo = list.get(i);
                fila[0] = vo.getLegajo();
                fila[1] = vo.getNombre();
                fila[2] = vo.getPassword();
                fila[3] = vo.getRol();
                fila[4] = vo.getApellido();
                fila[5] = vo.getDireccion();
                fila[6] = vo.getEstadoU();
                fila[7] = vo.getTelefono();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


