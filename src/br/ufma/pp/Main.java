package br.ufma.pp;


import br.ufma.pp.memento.Caretaker;
import br.ufma.pp.memento.Originator;
import br.ufma.pp.state.ConcreteStateA;
import br.ufma.pp.state.ConcreteStateB;
import br.ufma.pp.state.Context;

public class Main {
    public static void main(String[] args){

        memento();
//        state();


    }

    public static void memento(){
        Originator originator = new Originator();

        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.save());


        originator.setState("Estado 2");
        caretaker.addMemento(originator.save());


        originator.setState("Estado 3");
        caretaker.addMemento(originator.save());

        originator.setState("Estado 4");
        caretaker.addMemento(originator.save());

        originator.getState();

        originator.restore(caretaker.getMemento(0));
        originator.getState();

        originator.restore(caretaker.getMemento(1));
        originator.getState();

        originator.restore(caretaker.getMemento(2));
        originator.getState();

        originator.restore(caretaker.getMemento(3));
        originator.getState();

    }
    public static void state(){
        Context context = new Context();

        context.request();

        context.setState(new ConcreteStateB());
        context.request();

        context.setState(new ConcreteStateA());
        context.request();



    }
}
