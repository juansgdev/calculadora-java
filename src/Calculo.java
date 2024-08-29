import javax.swing.JOptionPane;

public class Calculo {
    public static Double iniciarCalculo (Double result) {
        Double operando = null;
        String operador = null;
        Double segundoOperando = null;

        if (result == null) {
            operando = UserInput.setOperando();
            operador = UserInput.setOperador();
            segundoOperando = UserInput.setSegundoOperando();
        } else {
            operando = result;
            operador = UserInput.setOperador();
            segundoOperando = UserInput.setSegundoOperando();
        }

        return calcular(operando, operador, segundoOperando);
    };

    private static Double calcular (double operando, String operador, double segundoOperando) {
        Double result = null;

        switch (operador) {
            case "Soma":
                result = operando + segundoOperando;
            break;
    
            case "Subtração":
                result = operando - segundoOperando;
            break;

            case "Multiplicação":
                result = operando * segundoOperando;
            break;

            case "Divisão":
                result = operando / segundoOperando;
            break;

            default:
            break;
        };

        return result;
    };
}