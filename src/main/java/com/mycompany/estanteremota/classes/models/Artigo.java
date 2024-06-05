package com.mycompany.estanteremota.classes.models;

public class Artigo extends Texto {
    // atributos subclasse
    private String nomeRevista;
    private String palavrasChave;

    // Construtor
    public Artigo(String nomeTexto, String nomeAutor){
        super(nomeTexto, nomeAutor);
    }
    public Artigo(String nomeTexto, String nomeAutores, int anoPublicacao, 
        int numPaginas, String status, String inicioLeitura, String terminoLeitura, 
        String dataRegistro, String nomeRevista, String palavrasChave) {
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
    public String getPalavrasChave() {
        return palavrasChave;
    }
    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
}
