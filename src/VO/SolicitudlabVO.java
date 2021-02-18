package VO;

public class SolicitudlabVO {

/*Todo los atributos*/
    int codSolicitud;
    int CodLab;
    int dni;
    String Legajo;
    String TipoReserva;
    String Fecha;
    Object Hora;
    String estadoSol;
    int Laboratorio_CodLab;
    Object Materia_codMat;
    int Docente_idDocente;
    Object HoraFin;

public SolicitudlabVO(){}

/*Todo los codigos get*/
    public int getCodSolicitud(){
        return codSolicitud;
    }
    public int getCodLab(){
        return CodLab;
    }
    public int getDni(){
        return dni;
    }
    public String getLegajo(){
        return Legajo;
    }
    public String getTipoReserva(){
        return TipoReserva;
    }
    public String getFecha(){
        return Fecha;
    }
    public Object getHora(){
        return Hora;
    }
    public String getEstadoSol(){
        return estadoSol;
    }
    public int getLaboratorio_CodLab(){
        return Laboratorio_CodLab;
    }
    public Object getMateria_codMat(){
        return Materia_codMat;
    }
    public int getDocente_idDocente(){
        return Docente_idDocente;
    }
    public Object getHoraFin(){
        return HoraFin;
    }


/*Todo los codigos set*/
    public void setCodSolicitud(int codSolicitud){
        this.codSolicitud = codSolicitud;
    }
    public void setCodLab(int CodLab){
        this.CodLab = CodLab;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    public void setLegajo(String Legajo){
        this.Legajo = Legajo;
    }
    public void setTipoReserva(String TipoReserva){
        this.TipoReserva = TipoReserva;
    }
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }
    public void setHora(Object Hora){
        this.Hora = Hora;
    }
    public void setEstadoSol(String estadoSol){
        this.estadoSol = estadoSol;
    }
    public void setLaboratorio_CodLab(int Laboratorio_CodLab){
        this.Laboratorio_CodLab = Laboratorio_CodLab;
    }
    public void setMateria_codMat(Object Materia_codMat){
        this.Materia_codMat = Materia_codMat;
    }
    public void setDocente_idDocente(int Docente_idDocente){
        this.Docente_idDocente = Docente_idDocente;
    }
    public void setHoraFin(Object HoraFin){
        this.HoraFin = HoraFin;
    }

}
