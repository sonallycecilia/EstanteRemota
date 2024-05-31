package com.mycompany.estanteremota.frames.warnings;

import java.awt.Window;

import javax.swing.JOptionPane;

public class WarningsEntrada {
        
    public static boolean validarEntrada(Window frame, String entrada){
            if (entrada == null) {
                JOptionPane.showMessageDialog(frame, "O campo de texto não pode estar vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            return true;
    }
}
