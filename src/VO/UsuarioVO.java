package VO;

public class UsuarioVO {

/*Todo los atributos*/
    int Legajo;
    String Nombre;
    String Password;
    String Rol;
    String Apellido;
    String Direccion;
    String EstadoU;
    String Telefono;

public UsuarioVO(){}

/*Todo los codigos get*/
    public int getLegajo(){
        return Legajo;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getPassword(){
        return Password;
    }
    public String getRol(){
        return Rol;
    }
    public String getApellido(){
        return Apellido;
    }
    public String getDireccion(){
        return Direccion;
    }
    public String getEstadoU(){
        return EstadoU;
    }
    public String getTelefono(){
        return Telefono;
    }


/*Todo los codigos set*/
    public void setLegajo(int Legajo){
        this.Legajo = Legajo;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setPassword(String Password){
        this.Password = Password;
    }
    public void setRol(String Rol){
        this.Rol = Rol;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    public void setEstadoU(String EstadoU){
        this.EstadoU = EstadoU;
    }
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }

}
