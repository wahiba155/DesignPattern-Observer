package org.moussaoui;

import obs.ObservableImpl;
import obs.Observer;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);

        observable.subscribe((obs) ->{
            if (observable instanceof ObservableImpl o) {

                System.out.println("++++++Obs Impl 3 ++++++++");

                System.out.println("Res = " + o.getState()*Math.cos(o.getState()));
                System.out.println("++++++++++++++++++++");
            }
            });




        observable.setState(60);
        observable.setState(80);
        observable.unsubscribe(o2);
        observable.setState(100);






    }
}