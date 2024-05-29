package com.mycompany.estanteremota.classes.models;

import com.mycompany.estanteremota.classes.enums.StatusTexto;
import java.util.ArrayList;

public abstract class Texto {
    // Atributos
    public static final String SEPARADOR_STRING = ",";
    private String nomeTexto;
    private ArrayList<String> nomeAutores;
    private int anoPublicacao;
    private int numPaginas;
    private String inicioLeitura;
    private String terminoLeitura;
    private StatusTexto status;

    // Contrutor com todas os atributos, ou seja, lido
    public Texto(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, String inicioLeitura, String terminoLeitura, int numPaginas, StatusTexto status){
        this.nomeTexto = nomeTexto;
        this.nomeAutores = nomeAutores;  
        this.anoPublicacao = anoPublicacao;
        this.inicioLeitura = inicioLeitura;
        this.terminoLeitura = terminoLeitura;
        this.numPaginas = numPaginas; 
        this.status = status;
    }

    //sem inicio e fim = nao li
    public Texto(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, int numPaginas, StatusTexto status){
        this.nomeTexto = nomeTexto;
        this.nomeAutores = nomeAutores;  
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.status = status;
    }

    //lendo, sem fim de leitura
    public Texto(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao, String inicioLeitura, int numPaginas, StatusTexto status){
        this.nomeTexto = nomeTexto; 
        this.nomeAutores = nomeAutores;  
        this.anoPublicacao = anoPublicacao;
        this.inicioLeitura = inicioLeitura;
        this.numPaginas = numPaginas; 
        this.status = status;
    }

    // Métodos
    public String buscarNomeAutor(String nomeAutor){
        for (String s: nomeAutores){
            if (nomeAutor == s){
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return getNomeTexto() + " | " + getNomeAutor() + " | " + anoPublicacao + 
               " | " + inicioLeitura.toString() + " | " + terminoLeitura.toString() + " | " + getNumPaginas() + " | " + status.name();
    }
    
    //getters and setters
    public String getNomeTexto() {
        return nomeTexto;
    }
    public void setNomeTexto(String nomeTexto) {
        this.nomeTexto = nomeTexto;
    }
    public ArrayList<String> getNomeAutor() {
        return nomeAutores;
    }
    public void setNomeAutor(ArrayList<String> nomeAutores) {
        this.nomeAutores = nomeAutores;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public String getInicioLeitura(){
        return inicioLeitura;
    }
    public void setInicioLeitura(String inicioLeitura){
        this.inicioLeitura = inicioLeitura;  
    }
    public void setTerminoLeitura(String terminoLeitura){
        this.terminoLeitura = terminoLeitura;
    }
    public String getTerminoLeitura(){
        return terminoLeitura;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public StatusTexto getStatus(){
        return status;
    }
}
