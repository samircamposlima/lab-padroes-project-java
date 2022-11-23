package one.digitalinavation.gof.Singleton;
/**
 * Singleton "apressado".
 * 
 * @author falvojr
 * 
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager(){
        // TODO Auto-generated contructor stub
        super();

    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
