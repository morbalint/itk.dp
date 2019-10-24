package hu.ppke.itk.dp.memento;

public class Memento {

    private double state;

    Memento(double initialState) {
        state = initialState;
    }

    double GetState() {
        return state;
    }
    void SetState(double nextState){
        state = nextState;
    }
}
