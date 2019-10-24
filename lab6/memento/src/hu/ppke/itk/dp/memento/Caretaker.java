package hu.ppke.itk.dp.memento;

public class Caretaker {

    private Memento memento;

    public Caretaker(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return this.memento;
    };

}
