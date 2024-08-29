import javax.swing.JOptionPane;

public class CalcStart {
    private boolean isEnd;
    private double result;
    private boolean firstIteration; // ---> iteração

    public CalcStart () {
        isEnd = false;
        result = 0;
        firstIteration = true;
    }

    public void init () {
        while (this.isEnd == false) {
            start();
            result = Calculo.iniciarCalculo(this.result, this.firstIteration);
            this.firstIteration = false;
            // stop(this.isEnd);
            if (isEnd == true) {
                break;
            }
        }
    }

    private void start () {
        JOptionPane.showMessageDialog(null, 
        "Olá!\n\nSeja bem vindo à calculadora Java!", 
        "Saudações", 
        JOptionPane.INFORMATION_MESSAGE);
    }

    // private void stop (boolean isEnd) {
    //     int encerrarPrograma = JOptionPane.showConfirmDialog(null, 
    //     "Tem certeza que deseja sair da  calculadora Java", 
    //     "Confirme", 
    //     JOptionPane.YES_NO_OPTION);

    //     this.isEnd = (encerrarPrograma == 0) ? true : false;
    // }
}