public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean isEmpty(){
        return cima == null;
    }

    public void push(char dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public char pop(){
        if (isEmpty()){
            System.out.println("La pila está vacía");
            return '\0';
        }
        char datoEliminado = cima.getDato();
        cima = cima.getSiguiente();
        return datoEliminado;
    }

    public char peek(){
        if (isEmpty()){
            System.out.println("La pila está vacía");
            return '\0';
        }
        return cima.getDato();
    }
}