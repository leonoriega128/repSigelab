package VO;

public class SolicitudinsumosVO {

/*Todo los atributos*/
    int CodSolInsumo;
    String Fecha;
    Object Hora;
    String EstadoS;
    int Insumos_codInsumo;
    int AyudanteLaboratorio_DNIayu;

public SolicitudinsumosVO(){}

/*Todo los codigos get*/
    public int getCodSolInsumo(){
        return CodSolInsumo;
    }
    public String getFecha(){
        return Fecha;
    }
    public Object getHora(){
        return Hora;
    }
    public String getEstadoS(){
        return EstadoS;
    }
    public int getInsumos_codInsumo(){
        return Insumos_codInsumo;
    }
    public int getAyudanteLaboratorio_DNIayu(){
        return AyudanteLaboratorio_DNIayu;
    }


/*Todo los codigos set*/
    public void setCodSolInsumo(int CodSolInsumo){
        this.CodSolInsumo = CodSolInsumo;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public void setHora(Object Hora){
        this.Hora = Hora;
    }
    public void setEstadoS(String EstadoS){
        this.EstadoS = EstadoS;
    }
    public void setInsumos_codInsumo(int Insumos_codInsumo){
        this.Insumos_codInsumo = Insumos_codInsumo;
    }
    public void setAyudanteLaboratorio_DNIayu(int AyudanteLaboratorio_DNIayu){
        this.AyudanteLaboratorio_DNIayu = AyudanteLaboratorio_DNIayu;
    }

}
