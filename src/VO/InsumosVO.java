package VO;

public class InsumosVO {

/*Todo los atributos*/
    int codInsumo;
    int Stock;
    String Estado;
    String Nombre;
    String Descripcion;

public InsumosVO(){}

/*Todo los codigos get*/
    public int getCodInsumo(){
        return codInsumo;
    }
    public int getStock(){
        return Stock;
    }
    public String getEstado(){
        return Estado;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getDescripcion(){
        return Descripcion;
    }


/*Todo los codigos set*/
    public void setCodInsumo(int codInsumo){
        this.codInsumo = codInsumo;
    }
    public void setStock(int Stock){
        this.Stock = Stock;
    }
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }

}
