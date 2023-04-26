package dominio;

import java.time.LocalDate;

public class Mentores extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return xpPadrao + 20d;
    }

    public Mentores() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nMentoria {" +
                "\nTitulo= " + getTitulo() +
                "\nDescricao= " + getDescricao() +
                "\nData= " + data + "}";
    }
    
}
