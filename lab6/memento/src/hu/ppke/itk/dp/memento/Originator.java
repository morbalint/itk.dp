package hu.ppke.itk.dp.memento;

public class Originator {

    protected double state;

    public Originator(double initialNumber){
        state = initialNumber;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void updateMemento(Memento memento) {
        memento.SetState(state);
    }

    public void setStateByMemento(Memento memento){
        this.state = memento.GetState();
    }
}
