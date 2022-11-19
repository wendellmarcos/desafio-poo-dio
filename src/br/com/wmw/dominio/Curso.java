package br.com.wmw.dominio;


public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {

    }

    @Override
    public double calcularXp() {
        return 0;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }



}
