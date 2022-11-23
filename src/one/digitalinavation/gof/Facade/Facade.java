package one.digitalinavation.gof.Facade;

import Subsistema1.Crm.CrmService;
import Subsistema2.Cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String Cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, Cidade, estado);


    }
    
}
