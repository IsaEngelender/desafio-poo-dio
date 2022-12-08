package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String Nome;
    private Set<Conteudo> ConteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.ConteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);

    }


    public void progredir() {
        Optional<Conteudo> conteudo = this.ConteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.ConteudosConcluidos.add(conteudo.get());
            this.ConteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXP() {
       return this.ConteudosConcluidos
               .stream()
               .mapToDouble(Conteudo::calcularXP)
                .sum();

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return ConteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        ConteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return ConteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        ConteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(Nome, dev.Nome) && Objects.equals(ConteudosInscritos, dev.ConteudosInscritos) && Objects.equals(ConteudosConcluidos, dev.ConteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, ConteudosInscritos, ConteudosConcluidos);
    }
}
