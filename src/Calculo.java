public class Calculo {
    public static Double iniciarCalculo (Double result) {
        Double operando = null;
        String operador = null;
        Double segundoOperando = null;

        if (result == null) {
            operando = HandleInput.operandoInput();
            operador = HandleInput.operadorInput();
            segundoOperando = HandleInput.segundoOperandoInput();
        } else {
            operando = result;
            operador = HandleInput.operadorInput();
            segundoOperando = HandleInput.segundoOperandoInput();
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