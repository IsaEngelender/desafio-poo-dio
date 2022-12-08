package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String Titulo;
    private String Descricao;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + Titulo + '\'' +
                ", descricao='" + Descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
