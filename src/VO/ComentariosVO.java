package VO;

public class ComentariosVO {

/*Todo los atributos*/
    int idComentarios;
    int codTarea;
    String nombUsuario;
    String Fecha;
    Object Hora;
    String Comentario;
    int AyudanteLaboratorio_DNIayu;

public ComentariosVO(){}

/*Todo los codigos get*/
    public int getIdComentarios(){
        return idComentarios;
    }
    public int getCodTarea(){
        return codTarea;
    }
    public String getNombUsuario(){
        return nombUsuario;
    }
    public String getFecha(){
        return Fecha;
    }
    public Object getHora(){
        return Hora;
    }
    public String getComentario(){
        return Comentario;
    }
    public int getAyudanteLaboratorio_DNIayu(){
        return AyudanteLaboratorio_DNIayu;
    }


/*Todo los codigos set*/
    public void setIdComentarios(int idComentarios){
        this.idComentarios = idComentarios;
    }
    public void setCodTarea(int codTarea){
        this.codTarea = codTarea;
    }
    public void setNombUsuario(String nombUsuario){
        this.nombUsuario = nombUsuario;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public void setHora(Object Hora){
        this.Hora = Hora;
    }
    public void setComentario(String Comentario){
        this.Comentario = Comentario;
    }
    public void setAyudanteLaboratorio_DNIayu(int AyudanteLaboratorio_DNIayu){
        this.AyudanteLaboratorio_DNIayu = AyudanteLaboratorio_DNIayu;
    }

}
