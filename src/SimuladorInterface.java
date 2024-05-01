import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SimuladorInterface{
    //private ArrayList<SimuladorInterface> texto = new ArrayList<>();
    private Map<String, SimuladorInterface> texto = new LinkedHashMap<>();
    public void add(SimuladorInterface simulador){
        //texto.add(simulador);
        texto.put(simulador.getTexto(), simulador);
    }
    public void desenhar(){
//        for(SimuladorInterface s: texto) {
//            System.out.println(s.getTexto());
//        }

        for(Map.Entry<String, SimuladorInterface> s : texto.entrySet()) {
            SimuladorInterface objeto = s.getValue();
            System.out.println(objeto.getTexto());
        }
    }
    public String getTexto(){return null;};
}
