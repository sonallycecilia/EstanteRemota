package com.mycompany.estanteremota.classes.entitys;

import com.mycompany.estanteremota.EstanteRemota;
import java.io.File;

public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private File[] listaEstantes;

    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.listaEstantes = carregarEstantesUsuario(EstanteRemota.diretorioDB);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return this.login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public File[] getListaEstantes(){
        return this.listaEstantes;
    }
    
    public File[] carregarEstantesUsuario(File diretorio){
        String strCaminho = diretorio.getAbsolutePath() + File.separator + this.login;
        File caminho = new File(strCaminho);
        File[] estantes = caminho.listFiles(File::isFile);
        return estantes;
    }
    
    //métodos
    public int criarPastaUsuario(File diretorio, String nomeUsuario){
        String caminho = diretorio.getAbsolutePath() + File.separator + nomeUsuario; 
        File pastaUsuario = new File(caminho);
        if (!pastaUsuario.exists()){
            try {
                if (pastaUsuario.mkdir()) {
                    System.out.println("Usuario criado");
                    Estante.criarEstante(diretorio, nomeUsuario, "Todos");
                    File pastaModelo = new File(caminho + File.separator + "modelos");
                    if (pastaModelo.mkdir()){
                        Estante.criarEstante(pastaUsuario, "modelos", "Livros");
                        Estante.criarEstante(pastaUsuario, "modelos", "Artigos");
                    }
                    return 1;
                } else {
                    System.out.println("Falha ao criar usuario");
                    return 0;
                }
            } catch (SecurityException e) {
                System.out.println("Erro de segurança ao criar usuario.");
                e.printStackTrace();
                return 0;
            } catch (Exception e) {
                System.out.println("Erro ao criar usuario: " + e.getMessage());
                e.printStackTrace();
                return 0;
            }
        } else {
            System.out.println("Ja existe um usuario com este nome!");
            return -1;
        }
    }
    
    //metodo de teste
    public static int verificarPastaUsuario(File diretorio, String nomeUsuario){
        String caminho = diretorio.getAbsolutePath() + File.separator + nomeUsuario; 
        File pastaUsuario = new File(caminho);
        if (pastaUsuario.exists()){
            System.out.println(caminho);
            System.out.println("usuario existe");
            return -1;
        } else {
            System.out.println("nao existe");
            return 0;
        }
    }
    public static String caminhoDoUsuario(String nomeUsuario){
        String caminho = EstanteRemota.diretorioDB.getAbsolutePath() + File.separator + nomeUsuario;
        return caminho;
    }
}

