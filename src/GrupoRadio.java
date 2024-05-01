public class GrupoRadio extends SimuladorInterface {
    private String positivo;
    private String negativo;
    public GrupoRadio(String positivo, String negativo) {
        setPositivo(positivo);
        setNegativo(negativo);
    }
    public String getPositivo() {
        return positivo;
    }
    public void setPositivo(String positivo) {
        this.positivo = positivo;
    }
    public String getNegativo() {
        return negativo;
    }
    public void setNegativo(String negativo) {
        this.negativo = negativo;
    }
    public String getTexto(){
        StringBuilder botoes = new StringBuilder();
        botoes.append("( )");
        botoes.append(getPositivo());
        botoes.append(" ( )");
        botoes.append(getNegativo());
        String texto = botoes.toString();
        return texto;
    }
}
