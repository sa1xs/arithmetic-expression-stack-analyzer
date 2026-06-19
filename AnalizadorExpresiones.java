public class AnalizadorExpresiones {

    public boolean validarParentesis(String expresion) {
        Pila pila = new Pila();

        for (int i = 0; i < expresion.length(); i++) {
            char dato = expresion.charAt(i);

            if (dato == '(') {
                pila.push(dato);

            } else if (dato == ')') {
                if (pila.isEmpty()){
                    return false;
                }
                pila.pop();
            }
        }
        return pila.isEmpty();
    }
}
