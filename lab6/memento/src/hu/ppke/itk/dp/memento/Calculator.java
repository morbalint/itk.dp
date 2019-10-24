package hu.ppke.itk.dp.memento;

public class Calculator extends Originator {

    private Caretaker caretaker;

    public Calculator(double initialNumber) {
        super(initialNumber);
        Memento memento = createMemento();
        caretaker = new Caretaker(memento);
    }

    public void Double() {
        updateMemento(caretaker.getMemento());
        super.state = super.state * 2;
    }

    public void Half() {
        updateMemento(caretaker.getMemento());
        super.state = super.state / 2;
    }

    public double getValue() {
        return super.state;
    }

    public void Undo() {
        setStateByMemento(caretaker.getMemento());
    }

}
