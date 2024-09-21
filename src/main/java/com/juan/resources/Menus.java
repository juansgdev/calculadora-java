package com.juan.resources;
import javax.swing.JOptionPane;

public class Menus {
    public static void startMenu (Double result) {
        if (result == null) {
            JOptionPane.showMessageDialog(
                null, 
                "Olá!\n\nSeja bem vindo à calculadora Java!", 
                "Saudações", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }

        if (result != null) {
            JOptionPane.showMessageDialog(
                null, 
                "Resultado atual: " + result, 
                "Continuando...", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public static String resultMenu (double result) {
        String[] options = {"Continuar Operação", "Limpar", "Fechar"};

        int userOption = JOptionPane.showOptionDialog(
            null, 
            "O resultado de sua operação é: " + result, 
            null, 
            0, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            options, 
            null
        );

        return options[userOption];
    };

    public static boolean stopMenu () {
        int encerrarPrograma = JOptionPane.showConfirmDialog(
            null, 
            "Tem certeza que deseja sair da  calculadora Java", 
            "Confirme", 
            JOptionPane.YES_NO_OPTION
        );

        return (encerrarPrograma == 0) ? true : false;
    }
}