public class Rotulo extends SimuladorInterface{
    private String nome;
    public Rotulo(String nome) {
        setTexto(nome);
    }
    public String getTexto() {
        return nome;
    }
    public void setTexto(String nome) {
        this.nome = nome;
    }
}
