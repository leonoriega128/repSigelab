package VO;

public class FichajeVO {

/*Todo los atributos*/
    int codFichaje;
    String Fecha;
    Object Hora;
    String Tipo;
    int AyudanteLaboratorio_DNIayu;

public FichajeVO(){}

/*Todo los codigos get*/
    public int getCodFichaje(){
        return codFichaje;
    }
    public String getFecha(){
        return Fecha;
    }
    public Object getHora(){
        return Hora;
    }
    public String getTipo(){
        return Tipo;
    }
    public int getAyudanteLaboratorio_DNIayu(){
        return AyudanteLaboratorio_DNIayu;
    }


/*Todo los codigos set*/
    public void setCodFichaje(int codFichaje){
        this.codFichaje = codFichaje;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public void setHora(Object Hora){
        this.Hora = Hora;
    }
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    public void setAyudanteLaboratorio_DNIayu(int AyudanteLaboratorio_DNIayu){
        this.AyudanteLaboratorio_DNIayu = AyudanteLaboratorio_DNIayu;
    }

}
