package one.digitalinavation.gof.Singleton;
/**
 * Singleton "Lazy Holder".
 * 
 * @see < a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author falvojr
 * 
 */

public class SingletonLazyHolder {

    private static class InstacieHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public SingletonLazyHolder(){
        // TODO Auto-generated contructor stub
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstacieHolder.instancia;
    }

}
