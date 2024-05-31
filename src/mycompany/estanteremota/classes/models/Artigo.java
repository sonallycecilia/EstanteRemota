package com.mycompany.estanteremota.classes.models;

import java.util.ArrayList;

public class Artigo extends Texto {
    // atributos subclasse
    private String nomeRevista;
    private ArrayList <String> palavrasChave;

    // Construtor
public Artigo(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, 
        int numPaginas, String status, String inicioLeitura, String terminoLeitura, 
        String dataRegistro, String nomeRevista, ArrayList<String> palavrasChave) {
        super(nomeTexto, nomeAutores, anoPublicacao, numPaginas, status,
                inicioLeitura, terminoLeitura, dataRegistro);
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
