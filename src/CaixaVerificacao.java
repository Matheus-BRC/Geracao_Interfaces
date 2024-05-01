public class CaixaVerificacao extends SimuladorInterface{
    private String texto;
    public CaixaVerificacao(String texto) {
        setTexto(texto);
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
