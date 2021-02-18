package VO;

public class TurnoVO {

/*Todo los atributos*/
    int idTurno;
    String Fecha;
    Object Hora_Inicio;
    Object Hora_Finalizado;
    int AyudanteLaboratorio_DNIayu;

public TurnoVO(){}

/*Todo los codigos get*/
    public int getIdTurno(){
        return idTurno;
    }
    public String getFecha(){
        return Fecha;
    }
    public Object getHora_Inicio(){
        return Hora_Inicio;
    }
    public Object getHora_Finalizado(){
        return Hora_Finalizado;
    }
    public int getAyudanteLaboratorio_DNIayu(){
        return AyudanteLaboratorio_DNIayu;
    }


/*Todo los codigos set*/
    public void setIdTurno(int idTurno){
        this.idTurno = idTurno;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public void setHora_Inicio(Object Hora_Inicio){
        this.Hora_Inicio = Hora_Inicio;
    }
    public void setHora_Finalizado(Object Hora_Finalizado){
        this.Hora_Finalizado = Hora_Finalizado;
    }
    public void setAyudanteLaboratorio_DNIayu(int AyudanteLaboratorio_DNIayu){
        this.AyudanteLaboratorio_DNIayu = AyudanteLaboratorio_DNIayu;
    }

}
