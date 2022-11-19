package br.com.wmw.dominio;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Css");
        curso1.setDescricao("Curso Css");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWendell = new Dev();
        devWendell.setName("Wendell");
        System.out.println("Conteúdos Incritos: " + devWendell.getConteudosInscritos());
        devWendell.inscreverBootcamp(bootcamp);



        Dev devMarcos = new Dev();
        devMarcos.setName("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos: " + devMarcos.getConteudosInscritos());

    }
}
