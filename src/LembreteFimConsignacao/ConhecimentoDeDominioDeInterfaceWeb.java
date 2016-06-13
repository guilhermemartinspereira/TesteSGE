package LembreteFimConsignacao;

import java.util.HashMap;
import java.util.Map;

public class ConhecimentoDeDominioDeInterfaceWeb {
    protected static Map<String, String> mapa;

    public ConhecimentoDeDominioDeInterfaceWeb() {
        mapa = new HashMap<>();

        mapa.put("url.inicio", "file:///Users/romulozanconeto/Documents/Unicamp/Disciplines/2016-1sem-Engenharia%20de%20Software%20I%20-%20MO409A/Trabalho/Development/Interface/purplefitness-interface/consignacao.html");

        mapa.put("seletor.itemNormal", ".item");
        mapa.put("seletor.itemAVencer", ".item a.finalizing");
        mapa.put("seletor.itemVencido", ".item a.finalized");
    }

    public String get(String chave) {
        return mapa.get(chave);
    }
}
