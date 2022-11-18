package br.com.wmw.dominio;


import br.Curso;
import br.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("br.Curso Java");
        curso1.setDescricao("br.Curso Orientação a objetos e abstração Bootcamp");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript"); //
        curso2.setDescricao("Curso Orientação a objetos e abstração Bootcamp");
        curso2.setCargaHoraria(10);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Mentoria POO");
        mentoria.setCargaHoraria(25);






    }
}
