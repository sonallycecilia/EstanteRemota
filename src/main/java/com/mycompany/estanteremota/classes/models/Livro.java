package com.mycompany.estanteremota.classes.models;

import com.mycompany.estanteremota.classes.enums.StatusTexto;
import java.util.ArrayList;

public class Livro extends Texto {
    // atributos subclasse
    private String nomeEditora;
    private String nomeGenero;

    // Construtor com Todas as informações, livro lido e add a estante
    public Livro(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, String inicioLeitura, String terminoLeitura, int numPaginas, StatusTexto status, String nomeEditora, String nomeGenero) {
        super(nomeTexto, nomeAutores, anoPublicacao, inicioLeitura, terminoLeitura, numPaginas, status);
        this.nomeEditora = nomeEditora;
        this.nomeGenero = nomeGenero;
    }
    // Construtor sem inicio/termino de leitura e sem foiLido ou foiIniciado, ou seja, livro pra ler
    public Livro(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, int numPaginas, StatusTexto status, String nomeEditora, String nomeGenero) {
        super(nomeTexto, nomeAutores, anoPublicacao, numPaginas, status);
        this.nomeEditora = nomeEditora;
        this.nomeGenero = nomeGenero;
    }
    // Construtor sem a data do Término da Leitura, ou seja, lendo
    public Livro(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, String inicioLeitura, int numPaginas, StatusTexto status, String nomeEditora, String nomeGenero) {
        super(nomeTexto, nomeAutores, anoPublicacao, inicioLeitura, numPaginas, status);
        this.nomeEditora = nomeEditora;
        this.nomeGenero = nomeGenero;
    }
    
    // Métodos
    @Override
    public String toString(){
        return super.toString() + " | " + getNomeEditora() + " | "  + getnomeGenero();
    }
    // getters e setters
    public String getNomeEditora() {
        return nomeEditora;
    }
    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public String getnomeGenero() {
        return nomeGenero;
    }
    public void setnomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }
}
