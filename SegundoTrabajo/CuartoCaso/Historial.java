package CuartoCaso;

import java.util.Stack;

public class Historial {
    private Stack<Gestion> history = new Stack<>();

    public void push(Gestion gestion) {
        history.push(gestion);
    }

    public Gestion pop() {
        return history.pop();
    }
    
    public boolean isEmpty() { return history.isEmpty(); }
}

