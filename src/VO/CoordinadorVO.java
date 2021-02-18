package VO;

public class CoordinadorVO {

/*Todo los atributos*/
    int DNIc;
    String Rol;
    int Usuario_Legajo;
    int Turno_idTurno;

public CoordinadorVO(){}

/*Todo los codigos get*/
    public int getDNIc(){
        return DNIc;
    }
    public String getRol(){
        return Rol;
    }
    public int getUsuario_Legajo(){
        return Usuario_Legajo;
    }
    public int getTurno_idTurno(){
        return Turno_idTurno;
    }


/*Todo los codigos set*/
    public void setDNIc(int DNIc){
        this.DNIc = DNIc;
    }
    public void setRol(String Rol){
        this.Rol = Rol;
    }
    public void setUsuario_Legajo(int Usuario_Legajo){
        this.Usuario_Legajo = Usuario_Legajo;
    }
    public void setTurno_idTurno(int Turno_idTurno){
        this.Turno_idTurno = Turno_idTurno;
    }

}
