import javax.swing.JOptionPane;

public class Calculo {
    public static double iniciarCalculo (double result, boolean firstIteration) {
        if (firstIteration == false) {
            JOptionPane.showMessageDialog(null, "Seu resultado atual é: " + result, null, 0);
        }

        UserInput input = new UserInput(firstIteration);

        if (input.segundoOperando != null) {
            
        }

        

        return 22.4;
    };

    private static String showResultMenu (double result) {
        String[] options = {"Continuar Operação", "Limpar", "Fechar"};

        int userOption = JOptionPane.showOptionDialog(
            null, 
            "O resultado de sua operação é: " + result, 
            null, 
            0, 
            0, 
            null, 
            options, 
            null
        );

        return options[userOption];
    };
}