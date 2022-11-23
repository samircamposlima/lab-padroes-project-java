package Subsistema2.Cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        // TODO Auto-generated contructor stub
        super();

    }

    public static CepApi getInstancia(){
        return instancia;
    }
    
    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
