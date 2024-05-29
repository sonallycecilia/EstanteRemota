package com.mycompany.estanteremota.classes.models;

import com.mycompany.estanteremota.classes.enums.StatusTexto;
import java.util.ArrayList;

public class Artigo extends Texto {
    // atributos subclasse
    private String nomeRevista;
    private ArrayList <String> palavrasChave;

    // Construtor completo
    public Artigo(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, String inicioLeitura, String terminoLeitura, int numPaginas, StatusTexto status, String nomeRevista, ArrayList<String> palavrasChave) {
        super(nomeTexto, nomeAutores, anoPublicacao, inicioLeitura, terminoLeitura, numPaginas, status);
        this.nomeRevista = nomeRevista;
        this.palavrasChave = palavrasChave;
    }
    // Construtor sem inicio/termino de leitura e sem foiLido ou foiIniciado
    public Artigo(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, int numPaginas, StatusTexto status, String nomeRevista, ArrayList<String> palavrasChave){
        super(nomeTexto, nomeAutores, anoPublicacao, numPaginas, status);
        this.nomeRevista = nomeRevista;
        this.palavrasChave = palavrasChave;
    }
    // Construtor sem data do término da leitura
    public Artigo(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, String inicioLeitura, int numPaginas, StatusTexto status, String nomeRevista, ArrayList<String> palavrasChave) {
        super(nomeTexto, nomeAutores, anoPublicacao, inicioLeitura, numPaginas, status);
        this.nomeRevista = nomeRevista;
        
        this.palavrasChave = palavrasChave;
    }
    // Métodos
    @Override
    public String toString(){
        return super.toString() + " | " + getNomeRevista() + " | " + getPalavrasChave().toString();
    }
    // getters e setters
    public String getNomeRevista() {
        return nomeRevista;
    }
    public void setNomeRevista(String nomeRevista) {
        this.nomeRevista = nomeRevista;
    }
    public ArrayList<String> getPalavrasChave() {
        return palavrasChave;
    }
    public void setPalavrasChave(ArrayList<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
}
