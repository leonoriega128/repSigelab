package VO;

public class AyudantelaboratorioVO {

/*Todo los atributos*/
    int DNIayu;
    String Rol;
    int Usuario_Legajo;

public AyudantelaboratorioVO(){}

/*Todo los codigos get*/
    public int getDNIayu(){
        return DNIayu;
    }
    public String getRol(){
        return Rol;
    }
    public int getUsuario_Legajo(){
        return Usuario_Legajo;
    }


/*Todo los codigos set*/
    public void setDNIayu(int DNIayu){
        this.DNIayu = DNIayu;
    }
    public void setRol(String Rol){
        this.Rol = Rol;
    }
    public void setUsuario_Legajo(int Usuario_Legajo){
        this.Usuario_Legajo = Usuario_Legajo;
    }

}
