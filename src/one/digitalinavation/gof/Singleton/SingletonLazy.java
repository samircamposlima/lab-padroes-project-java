package one.digitalinavation.gof.Singleton;
/**
 * Singleton "preguiçoso".
 * 
 * @author falvojr
 * 
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    public SingletonLazy(){
        // TODO Auto-generated contructor stub
        super();

    }

    public static SingletonLazy getInstancia(){
       if (instancia == null){
        instancia = new SingletonLazy();
       }
        return instancia;
    }

}
