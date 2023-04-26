package dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return xpPadrao * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso {" +
                "\nTitulo= " + this.getTitulo() +
                "\nDescricao= " + getDescricao() + 
                "\nCargaHoraria= " + cargaHoraria + "}";
    }
}