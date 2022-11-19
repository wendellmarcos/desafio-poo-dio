package br.com.wmw.dominio;

import java.util.Set;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;
    private static final double XP_PADRAO = 10d;


    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                "descricao='" + getDescricao() + '\'' +
                "data=" + data +
                '}';
    }
}
