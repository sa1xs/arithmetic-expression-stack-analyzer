import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AnalizadorExpresiones analizador = new AnalizadorExpresiones();

        String expresion = "";
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Ingresar expresión");
            System.out.println("2. Validar paréntesis");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la expresión aritmética: ");
                    expresion = scanner.nextLine();
                    System.out.println("Expresión guardada.");
                    break;

                case 2:
                    if (expresion.isEmpty()) {
                        System.out.println("Primero debe ingresar una expresión.");
                    } else {
                        boolean resultado = analizador.validarParentesis(expresion);

                        if (resultado) {
                            System.out.println("La expresión tiene los paréntesis balanceados.");
                        } else {
                            System.out.println("La expresión NO tiene los paréntesis balanceados.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}