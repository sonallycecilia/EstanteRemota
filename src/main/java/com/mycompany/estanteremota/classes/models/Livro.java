package com.mycompany.estanteremota.classes.models;

public class Livro extends Texto {
    // atributos subclasse
    private String nomeEditora;
    private String nomeGenero;

    // Construtor
    public Livro(String nomeTexto, String nomeAutor){
        super(nomeTexto, nomeAutor);
    }
    public Livro(String nomeTexto, String nomeAutor,  int anoPublicacao, 
            int numPaginas, String status, String inicioLeitura, String terminoLeitura, 
            String dataRegistro, String nomeEditora, String nomeGenero) {
        super(nomeTexto, nomeAutor, anoPublicacao, numPaginas, status,
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

    public String getnomeGenero() {
        return nomeGenero;
    }
    public void setnomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }
}
