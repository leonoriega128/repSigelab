package VO;

public class RecursosVO {

/*Todo los atributos*/
    int CodComputadora;
    int CodLab;
    String EstadoRec;

public RecursosVO(){}

/*Todo los codigos get*/
    public int getCodComputadora(){
        return CodComputadora;
    }
    public int getCodLab(){
        return CodLab;
    }
    public String getEstadoRec(){
        return EstadoRec;
    }


/*Todo los codigos set*/
    public void setCodComputadora(int CodComputadora){
        this.CodComputadora = CodComputadora;
    }
    public void setCodLab(int CodLab){
        this.CodLab = CodLab;
    }
    public void setEstadoRec(String EstadoRec){
        this.EstadoRec = EstadoRec;
    }

}
