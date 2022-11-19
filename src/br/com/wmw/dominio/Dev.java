package br.com.wmw.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudosInscristos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudosInscristos,
                dev.conteudosInscristos) && Objects.equals(conteudosConcluidos,
                dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosInscristos, conteudosConcluidos);
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscristos.addAll(bootcamp.getConteudos);
        bootcamp.getDevsIncritos().add(this);


    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscristos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscristos.remove(conteudo.get());

        } else {
            System.out.println("Você não está matriculado em nenhum conteudo");

        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularTotalXp)
                .sum();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudosInscristos() {
        return conteudosInscristos;
    }

    public void setConteudosInscristos(Set<Conteudo> conteudosInscristos) {
        this.conteudosInscristos = conteudosInscristos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public String getConteudosInscritos() {
        return null;
    }
}
