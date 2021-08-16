package br.ufma.pp.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private Originator originator;
    private List<Originator.Memento> history = new ArrayList<Originator.Memento>();

    public Caretaker(){

    }

    public void addMemento(Originator.Memento memento){
        history.add(memento);
    }

    public Originator.Memento getMemento(int index){
        return history.get(index);
    }

}
