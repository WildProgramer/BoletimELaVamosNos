package boletimescolar.info.boletimelavamosnos.model.domain;

/**
 * Created by Norb7492 on 13/09/2016.
 */
public class ProvaDomain {


    private long id_prova;
    private int tipo;
    private double nota;
    private int materia;
    private int faltas;

    public ProvaDomain() {
    }

    public ProvaDomain(long id_prova, int faltas, int materia, double nota, int tipo) {
        this.id_prova = id_prova;
        this.faltas = faltas;
        this.materia = materia;
        this.nota = nota;
        this.tipo = tipo;
    }

    public long getId_prova() {
        return id_prova;
    }

    public void setId_prova(long id_prova) {
        this.id_prova = id_prova;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
