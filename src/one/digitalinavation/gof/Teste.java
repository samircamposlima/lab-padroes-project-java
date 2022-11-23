package one.digitalinavation.gof;

import one.digitalinavation.gof.Singleton.SingletonEager;
import one.digitalinavation.gof.Singleton.SingletonLazy;
import one.digitalinavation.gof.Singleton.SingletonLazyHolder;
import one.digitalinavation.gof.Strategy.Comportamento;
import one.digitalinavation.gof.Strategy.ComportamentoAgressivo;
import one.digitalinavation.gof.Strategy.ComportamentoDefensivo;
import one.digitalinavation.gof.Strategy.ComportamentoNormal;
import one.digitalinavation.gof.Strategy.Robo;

public class Teste {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern (Singleton):

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        // (Strategy):

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


    
        
    }
    
}
