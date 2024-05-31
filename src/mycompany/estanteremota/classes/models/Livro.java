package com.mycompany.estanteremota.classes.models;

import java.util.ArrayList;

public class Livro extends Texto {
    // atributos subclasse
    private String nomeEditora;
    private ArrayList<String> nomeGenero;

    // Construtor
    public Livro(String nomeTexto, ArrayList<String> nomeAutores,  int anoPublicacao, 
            int numPaginas, String status, String inicioLeitura, String terminoLeitura, 
            String dataRegistro, String nomeEditora, ArrayList<String> nomeGenero) {
        super(nomeTexto, nomeAutores, anoPublicacao, numPaginas, status,
                inicioLeitura, terminoLeitura, dataRegistro);
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

    public ArrayList<String> getnomeGenero() {
        return nomeGenero;
    }
    public void setnomeGenero(ArrayList<String> nomeGenero) {
        this.nomeGenero = nomeGenero;
    }
}
