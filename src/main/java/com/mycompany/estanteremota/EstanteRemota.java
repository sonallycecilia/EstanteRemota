package com.mycompany.estanteremota;

import java.io.File;

public class EstanteRemota {
    
    public static File diretorioDB;

    public static void main(String[] args) {
        FrameLogin loginFrame = new FrameLogin();
        loginFrame.setVisible(true);
        loginFrame.setResizable(false);
        
        diretorioDB = new File("C:/Users/sonal_rkyba0o/OneDrive/Documentos/NetBeansProjects/EstanteRemota/src/main/java/com/mycompany/estanteremota/database/usuarios//");
    }
    
    public static String formatarEntradaString(String entrada) {
        if (entrada == null || entrada.isEmpty()) {
            return entrada;
        }
        entrada = entrada.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] palavras = entrada.split(" ");
        StringBuilder entradaFormatada = new StringBuilder();

        for (String palavra : palavras) {
            if (palavra.length() > 0) {
                entradaFormatada.append(Character.toUpperCase(palavra.charAt(0)))
                                .append(palavra.substring(1).toLowerCase())
                                .append(" ");
            }
        }
        return entradaFormatada.toString().trim();
    }
    
    public static String formatarData(String entrada){
        return null;
    }

}
