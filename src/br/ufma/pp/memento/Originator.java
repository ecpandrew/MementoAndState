package br.ufma.pp.memento;

public class Originator {

    private String state;

    public Originator(){
        this.state = "Estado 1";
    }

    public void setState(String state) {
        this.state = state;
    }

    public void getState() {
        System.out.println(state);;
    }

    public Memento save(){
        return new Memento(this.state);
    }

    public void restore(Memento memento){
        this.state = memento.state;
    }


    public static class Memento {
        private final String state;

        public Memento(String state){
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}



