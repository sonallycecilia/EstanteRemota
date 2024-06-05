package com.mycompany.estanteremota.frames.warnings;

import javax.swing.JOptionPane;

public class WarningsInternas {
        
    public static boolean validarEntradaVazia(String entrada){
        if (entrada == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "O campo de texto não pode estar vazio.", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE
            );
            return false;
        }
        return true;
    }
    
    public static void erro(String msg){
        JOptionPane.showMessageDialog(
                    null, msg,"Erro", 
                    JOptionPane.ERROR_MESSAGE
            );
    }
    public static void mensagem(String msg){
        JOptionPane.showMessageDialog(
                    null, msg, "Aviso!", 
                    JOptionPane.INFORMATION_MESSAGE
            );
    }
    
    public static void confirmar(String msg){
        JOptionPane.showConfirmDialog(
                    null, msg, 
                    "Confirmação de Dados",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
        
    }
    
}
