import javax.swing.JOptionPane;

public class CalcController {
    private boolean isEnd;
    private Double result;
    private String resultMenuOption;

    public CalcController () {
        isEnd = false;
        result = null;
        String resultMenuOption = null;
    };

    public void init () {

        while (this.isEnd == false) {
            Menus.startMenu(this.result);
            this.result = Calculo.iniciarCalculo(this.result);
            this.resultMenuOption = Menus.resultMenu(this.result);
            resultMenuAction();
            // stop(this.isEnd);
            if (isEnd == true) {
                break;
            }
        }

    };

    private void resultMenuAction () {
        switch (resultMenuOption) {
            case "Continuar Operação":
                this.isEnd = false;
            break;

            case "Limpar":
                this.result = null;
            break;

            case "Fechar":
                while (resultMenuOption == "Fechar") {
                    this.isEnd = Menus.stopMenu();

                    if (this.isEnd == true) {
                        break;
                    } else {
                        this.resultMenuOption = Menus.resultMenu(this.result);
                        resultMenuAction();
                    }
                }
            break;
        }
    }

}