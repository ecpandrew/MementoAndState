package br.ufma.pp.state;

public class Context {
    State state;

    public Context(){
        this.state = new ConcreteStateA();
    }

    public void setState(State state){
        this.state = state;
    }

    public void request(){
        state.handle();
    }

}
