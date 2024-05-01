public class CaixaTexto extends SimuladorInterface{
    private String texto;
    private int largura;
    public CaixaTexto(String texto, int largura) {
        setTexto(texto);
        setLargura(largura);
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
}
