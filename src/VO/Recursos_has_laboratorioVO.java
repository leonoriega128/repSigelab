package VO;

public class Recursos_has_laboratorioVO {

/*Todo los atributos*/
    int Recursos_CodComputadora;
    int Laboratorio_CodLab;

public Recursos_has_laboratorioVO(){}

/*Todo los codigos get*/
    public int getRecursos_CodComputadora(){
        return Recursos_CodComputadora;
    }
    public int getLaboratorio_CodLab(){
        return Laboratorio_CodLab;
    }


/*Todo los codigos set*/
    public void setRecursos_CodComputadora(int Recursos_CodComputadora){
        this.Recursos_CodComputadora = Recursos_CodComputadora;
    }
    public void setLaboratorio_CodLab(int Laboratorio_CodLab){
        this.Laboratorio_CodLab = Laboratorio_CodLab;
    }

}
