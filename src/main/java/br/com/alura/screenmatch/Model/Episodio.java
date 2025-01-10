package br.com.alura.screenmatch.Model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avaliacao;

    public Episodio(Integer numeroTemporada, DadosEpisodios dadosEpisodios) {
    this.temporada = numeroTemporada;
    this.titulo= dadosEpisodios.titulo();
    this.numeroEpisodio = dadosEpisodios.numero();
    try {
        this.avaliacao = Double.valueOf(dadosEpisodios.avaliacao());
    } catch (NumberFormatException ex) {
        this.avaliacao=0.0;
    }

    try {
        this.dataDeLancamento = LocalDate.parse(dadosEpisodios.dataDeLancamento());
    } catch (DateTimeParseException ex) {
        this.dataDeLancamento = null;
    }

    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numeroEpisodio;
    }

    public void setNumero(Integer numero) {
        this.numeroEpisodio = numero;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    private LocalDate dataDeLancamento;


    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avaliacao=" + avaliacao +
                ", dataDeLancamento=" + dataDeLancamento;
    }
}
