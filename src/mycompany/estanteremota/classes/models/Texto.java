package com.mycompany.estanteremota.classes.models;

import java.util.ArrayList;

public abstract class Texto {
    // Atributos
    public static final String SEPARADOR_STRING = ", ";
    private String nomeTexto;
    private ArrayList<String> nomeAutores;
    private int anoPublicacao;
    private int numPaginas;
    private String inicioLeitura;
    private String terminoLeitura;
    private String dataRegistro;
    private String status;

    //Construtor
    public Texto(String nomeTexto, ArrayList<String> nomeAutores, int anoPublicacao,
            int numPaginas, String status, String inicioLeitura, String terminoLeitura, String dataRegistro){
        this.nomeTexto = nomeTexto; 
        this.anoPublicacao = anoPublicacao;
        this.inicioLeitura = inicioLeitura;
        this.terminoLeitura = terminoLeitura;
        this.numPaginas = numPaginas; 
        this.status = status;
        this.dataRegistro = dataRegistro;
        this.nomeAutores = nomeAutores; 
    }

    // Métodos
    public String buscarNomeAutor(String nomeAutor){
        for (String s: nomeAutores){
            if (nomeAutor.equals(s)){
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return getNomeTexto() + " | " + getNomeAutor() + " | "  + getNumPaginas() 
                + " | " + getStatus()  + " | " + getAnoPublicacao() + " | " + 
                getInicioLeitura() + " | " + getTerminoLeitura() + " | " + getDataRegistro();
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
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getDataRegistro(){
        return dataRegistro;
    }
    public void setDataRegistro(String dataRegistro){
        this.dataRegistro = dataRegistro;
    }
}
