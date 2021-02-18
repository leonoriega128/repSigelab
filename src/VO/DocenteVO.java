package VO;

public class DocenteVO {

/*Todo los atributos*/
    int IdDoc;
    String Rol;
    int Usuario_Legajo;
    String dni;

public DocenteVO(){}

/*Todo los codigos get*/
    public int getIdDoc(){
        return IdDoc;
    }
    public String getRol(){
        return Rol;
    }
    public int getUsuario_Legajo(){
        return Usuario_Legajo;
    }
    public String getDni(){
        return dni;
    }


/*Todo los codigos set*/
    public void setIdDoc(int IdDoc){
        this.IdDoc = IdDoc;
    }
    public void setRol(String Rol){
        this.Rol = Rol;
    }
    public void setUsuario_Legajo(int Usuario_Legajo){
        this.Usuario_Legajo = Usuario_Legajo;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

}
