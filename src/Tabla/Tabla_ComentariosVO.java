package Tabla;

import DAO.ComentariosDAO;
import VO.ComentariosVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ComentariosVO{

   ComentariosDAO dao = null;


    public void visualizar_ComentariosVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idComentarios");
        dt.addColumn("codTarea");
        dt.addColumn("nombUsuario");
        dt.addColumn("Fecha");
        dt.addColumn("Hora");
        dt.addColumn("Comentario");
        dt.addColumn("AyudanteLaboratorio_DNIayu");

        dao = new ComentariosDAO();
        ComentariosVO vo = new ComentariosVO();
        ArrayList<ComentariosVO> list = dao.Listar_ComentariosVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[7];
                vo = list.get(i);
                fila[0] = vo.getIdComentarios();
                fila[1] = vo.getCodTarea();
                fila[2] = vo.getNombUsuario();
                fila[3] = vo.getFecha();
                fila[4] = vo.getHora();
                fila[5] = vo.getComentario();
                fila[6] = vo.getAyudanteLaboratorio_DNIayu();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


