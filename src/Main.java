import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        SimuladorInterface simuladorInterface = new SimuladorInterface();
        simuladorInterface.add(new Rotulo("Nome:"));
        simuladorInterface.add(new CaixaTexto("Informe o seu nome", 50)); // 50 é a largura
        simuladorInterface.add(new Rotulo("CPF:"));
        simuladorInterface.add(new CaixaTexto("000.000.000-00", 14)); // 14 é a largura
        simuladorInterface.add(new CaixaVerificacao("Aceito os termos e políticas de uso"));
        simuladorInterface.add(new GrupoRadio("Sim", "Não"));
        simuladorInterface.desenhar();
    }
}