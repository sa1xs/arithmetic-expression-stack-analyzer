public class Nodo {

    private char dato;
    private Nodo siguiente;

    public Nodo(char caracter) {
        this.dato = caracter;
        this.siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public char getDato() {
        return dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
