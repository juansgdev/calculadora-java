public class CalcController {
    private Double result;
    private String resultMenuOption;

    public CalcController () {
        result = null;
        String resultMenuOption = null;
    };

    public void init () {
        Menus.startMenu(this.result);
        
        try {
            this.result = Calculo.iniciarCalculo(this.result);
        } catch (Exception e) {
            HandleErrors.showError("Erro: Não é um número!\nPor favor insira somente números.", e);
            init();
        }

        this.resultMenuOption = Menus.resultMenu(this.result);
        resultMenuAction();
    };

    private void resultMenuAction () {
        switch (resultMenuOption) {
            case "Continuar Operação":
                init();
            break;

            case "Limpar":
                this.result = null;
                init();
            break;

            case "Fechar":
                boolean end = Menus.stopMenu();

                if (end == true) {
                    System.exit(0);
                }
                if (end == false) {
                    this.resultMenuOption = Menus.resultMenu(this.result);
                    resultMenuAction();
                }
            break;
        }
    }

}