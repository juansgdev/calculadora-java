package com.juan.resources;
import javax.swing.JOptionPane;

public class HandleErrors {
    public static void showError (String message, Exception erro) {
        JOptionPane.showMessageDialog(
            null,
            message + "\n\n" + "Detalhes: " + erro,
            "ERRO!",
            JOptionPane.ERROR_MESSAGE
        );
    }
}