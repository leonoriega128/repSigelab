package VO;

public class MateriaVO {

/*Todo los atributos*/
    Object codMat;
    String tipo;
    String legajo;
    String nombre;

public MateriaVO(){}

/*Todo los codigos get*/
    public Object getCodMat(){
        return codMat;
    }
    public String getTipo(){
        return tipo;
    }
    public String getLegajo(){
        return legajo;
    }
    public String getNombre(){
        return nombre;
    }


/*Todo los codigos set*/
    public void setCodMat(Object codMat){
        this.codMat = codMat;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setLegajo(String legajo){
        this.legajo = legajo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
