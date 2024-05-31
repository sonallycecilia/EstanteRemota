package com.mycompany.estanteremota.classes.entitys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Estante {
    private File caminho;
    private String nome;
    
    public static boolean criarArquivo(File diretorio, String nomeUsuario, String nomeArquivo){
        String path = diretorio.getAbsolutePath() + File.separator + nomeUsuario + File.separator + nomeArquivo + ".txt"; //criando o arquivo com base no nome informado pelo usuário
        File aq = new File(path);
        if (!aq.exists()){
            try (FileWriter arquivo = new FileWriter(path)){
                System.out.printf("Estante:  '%s' criado com sucesso.%n", nomeArquivo);
                return false;
            }
            catch (IOException e){
                System.out.println("Erro ao criar estante.");
            }
        }
        else
            System.out.printf("A estante '%s' ja existe.", nomeArquivo);
        
        return true;
}

    public static String mostrarTextos(File diretorio, String estante) {
        String caminho = diretorio.getAbsolutePath() + File.separator + estante + ".txt";
        StringBuilder dados = new StringBuilder();
        try (BufferedReader arquivo = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = arquivo.readLine()) != null) {
                dados.append(linha).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao extrair informacoes");
        }
        return dados.toString();
    }

    public static void escreverDados(File diretorio, String loginUsuario, String estante, String dados){
        String caminho = diretorio.getAbsolutePath() + File.separator + loginUsuario + File.separator + estante + ".txt";
        System.out.println(caminho);
        System.out.println(dados);
        try (BufferedWriter arquivo = new BufferedWriter(new FileWriter(caminho, true))){
            arquivo.write(dados);
            arquivo.newLine();
            System.out.println("Informacoes salvas com sucesso.");
        }
        catch (IOException e){
            System.out.println("Erro ao salvar informacoes.");
             //IO exception é gerada as vezes ao tentar abrir um arquivo txt atraves do scanner, por isso temos que adicionar uma execeção, ela imprime o tipo de erro
        }
    }

    public static void excluirLivro(File diretorio, String estante, String nome){
        String path = diretorio.getName() + "\\" + estante + ".txt";
        String pathTemp = diretorio.getName() + "\\" + estante + "Temp.txt";
        String linha;
        boolean achou = false;
    
        try (BufferedReader arquivo = new BufferedReader(new FileReader(path));
            BufferedWriter arquivoTemp = new BufferedWriter(new FileWriter(pathTemp))) {
            while (((linha = arquivo.readLine()) != null)) {
                String[] dados = linha.split(" \\| ");
                if (dados[0].equals(nome)){
                    System.out.printf("Texto encontrado na estante: %s%n", estante);
                    achou = true;
                }
                else{
                    arquivoTemp.write(linha);
                    arquivoTemp.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler dados do arquivo.");
        }
        if (!achou){
            System.out.println("Texto não encontrado.");
        }
        else{
            File arquivoOriginal = new File(path);
            File arquivoTemporario = new File(pathTemp);
            if (arquivoOriginal.delete()){
                arquivoTemporario.renameTo(arquivoOriginal);      
            }
            else{
                System.out.println("Erro na substituição de arquivos.");
            }
        }
    }

    //filtros
    public static void exibirTexto(String[] dados){
        System.out.println("=========================================");
        System.out.printf("Nome: " + dados[0] +
        "%nAutor: " + dados[1] + 
        "%nPublicação: " + dados[2] + 
        "%nInicio da leitura: " + dados[3] + 
        "%nTermino da leitura: " + dados[4] + 
        "%nNúmero de páginas: " + dados[5] + 
        "%nStatus: " + dados[6] + "%n");
        System.out.println("=========================================");
        
    }

    public static void filtrarNome(File diretorio, String estante, String nome) {
		String path = diretorio.getName() + "\\" + estante + ".txt";
        String linha;
        boolean achou = false;

		try (BufferedReader arquivo = new BufferedReader(new FileReader(path))) {
			while (((linha = arquivo.readLine()) != null) || achou == false) {
                String[] dados = linha.split(" \\| ");
				if (dados[0].equals(nome)){
                    System.out.printf("Texto encontrado na estante: %s%n", estante);
                    exibirTexto(dados);
                    achou = true;
                }
			}
		} catch (IOException e) {
			System.out.println("Erro ao extrair informações.");
		}
        if (!achou){
            System.out.println("Texto não encontrado.");
        }
	}

    public void filtrarAutor(File diretorio, String estante, String autor) {
		String path = diretorio.getName() + "\\" + estante + ".txt";
        String linha;
        boolean achou = false;

		try (BufferedReader arquivo = new BufferedReader(new FileReader(path))) {
			while (((linha = arquivo.readLine()) != null) || achou == false) {
                String[] dados = linha.split(" \\| ");
				
                if (dados[1].equals(autor)){
                    System.out.printf("Texto encontrado na estante: %s%n", estante);
                    exibirTexto(dados);
                    achou = true;
                }

                String[] autores = dados[1].split(","); //se houver mais de 1
                for (String a : autores){
                    if(a.equals(autor)){
                        System.out.printf("Texto encontrado na estante: %s%n", estante);
                        exibirTexto(dados);
                        achou = true;
                    }
                }
			}
		} catch (IOException e) {
			System.out.println("Erro ao extrair informações.");
		}
        if (!achou){
            System.out.println("Texto não encontrado.");
        }
	}
}
