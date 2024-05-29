package com.mycompany.estanteremota;

import java.awt.Window;

import javax.swing.JOptionPane;

public class WarningsEntrada {
        
    public static boolean validarEntrada(Window frame, String entrada){
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "O campo de texto não pode estar vazio.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            else if (!entrada.matches("[a-zA-Z0-9\\s]*")) {
                JOptionPane.showMessageDialog(frame, "O texto contém caracteres especiais.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            return true;
    }
}
