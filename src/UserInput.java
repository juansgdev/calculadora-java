import javax.swing.JOptionPane;

public class UserInput {
    public double operando;
    public String operacao;
    public Double segundoOperando;

    public UserInput (boolean firstIteration) {
        this.operando = setOperando();
        this.operacao = setOperador();
        this.segundoOperando = (firstIteration == true) ? setSegundoOperando() : null;
    };

    // setters

    private static double setOperando () {
        return Double.parseDouble(JOptionPane.showInputDialog(
            "Insira um operando:", 
            "0"
        ));
    };

    private static String setOperador () {
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

    private static double setSegundoOperando () {
        return Double.parseDouble(JOptionPane.showInputDialog(
        "Insira outro operando:", 
        "0"
        ));
    };

    // getters

    public double getOperando () {
        return this.operando;
    };

    public String getOperacao () {
        return this.operacao;
    };

    public double getSegundoOperando () {
        return this.segundoOperando;
    };
}