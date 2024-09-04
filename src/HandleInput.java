import javax.swing.JOptionPane;

public class HandleInput {
    public static double operandoInput () {
        return Double.parseDouble(JOptionPane.showInputDialog(
            null, 
            "Insira um operando:",
            "...",
            JOptionPane.QUESTION_MESSAGE,
            null, 
            null,
            0
        ).toString());
    };

    public static String operadorInput () {
        String[] operadores = {"Soma", "Subtração", "Multiplicação", "Divisão"};

        int operador = JOptionPane.showOptionDialog(
            null, 
            "Qual operação deseja realizar?", 
            "+ - x ÷", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE,
            null,
            operadores, 
            operadores[0]
        );

        return operadores[operador];
    };

    public static double segundoOperandoInput () {
        return Double.parseDouble(JOptionPane.showInputDialog(
            null, 
            "Insira outro operando:",
            "...",
            JOptionPane.QUESTION_MESSAGE,
            null, 
            null,
            0
        ).toString());
    };
}