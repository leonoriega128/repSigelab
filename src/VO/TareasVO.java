package VO;

public class TareasVO {

/*Todo los atributos*/
    int CodTarea;
    String NombreU;
    String FechaFin;
    String FechaInicio;
    String Estado;
    String Prioridad;
    String Descripcion;
    int LegajoCt;

public TareasVO(){}

/*Todo los codigos get*/
    public int getCodTarea(){
        return CodTarea;
    }
    public String getNombreU(){
        return NombreU;
    }
    public String getFechaFin(){
        return FechaFin;
    }
    public String getFechaInicio(){
        return FechaInicio;
    }
    public String getEstado(){
        return Estado;
    }
    public String getPrioridad(){
        return Prioridad;
    }
    public String getDescripcion(){
        return Descripcion;
    }
    public int getLegajoCt(){
        return LegajoCt;
    }


/*Todo los codigos set*/
    public void setCodTarea(int CodTarea){
        this.CodTarea = CodTarea;
    }
    public void setNombreU(String NombreU){
        this.NombreU = NombreU;
    }
    public void setFechaFin(String FechaFin){
        this.FechaFin = FechaFin;
    }
    public void setFechaInicio(String FechaInicio){
        this.FechaInicio = FechaInicio;
    }
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    public void setPrioridad(String Prioridad){
        this.Prioridad = Prioridad;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    public void setLegajoCt(int LegajoCt){
        this.LegajoCt = LegajoCt;
    }

}
