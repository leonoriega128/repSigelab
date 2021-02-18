package VO;

public class LaboratorioVO {

/*Todo los atributos*/
    int CodLab;
    String Nombre;
    String Capacidad;

public LaboratorioVO(){}

/*Todo los codigos get*/
    public int getCodLab(){
        return CodLab;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getCapacidad(){
        return Capacidad;
    }


/*Todo los codigos set*/
    public void setCodLab(int CodLab){
        this.CodLab = CodLab;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setCapacidad(String Capacidad){
        this.Capacidad = Capacidad;
    }

}
