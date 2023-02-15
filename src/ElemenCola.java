import java.util.*;

public class ElemenCola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Implementar una cola basica");
            System.out.println("2. Implementar un stack basico");
            System.out.println("3. Invertir una cadena utilizando un stack");
            System.out.println("4. Verificar si una cadena es palíndromo utilizando un stack");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opcion: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    queueBasic();
                    break;
                case 2:
                    stackBasic();
                    break;
                case 3:
                    reverseString();
                    break;
                case 4:
                    palindromeChecker();
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (option != 0);
    }
//Implementa un queue básico, usando un arreglo debes ser capaz de añadir elementos al final de una cola y eliminar elementos de la parte delantera.
    public static void queueBasic() {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nQueue basica:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opcion: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Ingresa un número para agregar a la cola: ");
                    int number = scanner.nextInt();
                    queue.add(number);
                    System.out.println("Elemento agregado a la cola: " + number);
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("La cola está vacía");
                    } else {
                        int removed = queue.remove();
                        System.out.println("Elemento eliminado de la cola: " + removed);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo de la cola básica");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 0);
    }
//Implementa un stack básico, usando un arreglo debes ser capaz de introducir elementos en el inicio del stack y sacar (pop) elementos del inicio del mismo.

    public static void stackBasic() {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nStack básico:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Ingresa un número para agregar al stack: ");
                    int number = scanner.nextInt();
                    stack.push(number);
                    System.out.println("Elemento agregado al stack: " + number);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("El stack está vacío");
                    } else {
                        int removed = stack.pop();
                        System.out.println("Elemento eliminado del stack: " + removed);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del stack básico");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (option != 0);
    }
//Escribe un método que tome una cadena como entrada y la invierta utilizando el stack.

    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena para invertir: ");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println("La cadena invertida es: " + reversed.toString());
    }
//Implementa el verificador de palíndromo con un método que reciba la cadena de entrada y verifique si es palíndromo usando stack.

    public static void palindromeChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena para verificar si es palíndromo: ");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        int midpoint = input.length() / 2;
        for (int i = 0; i < midpoint; i++) {
            stack.push(input.charAt(i));
        }
        int start = midpoint;
        if (input.length() % 2 != 0) {
            start++;
        }
        for (int i = start; i < input.length(); i++) {
            if (stack.isEmpty()) {
                System.out.println("La cadena no es palíndromo");
                return;
            }
            if (input.charAt(i) != stack.pop()) {
                System.out.println("La cadena no es palíndromo");
                return;
            }
        }
        if (stack.isEmpty()) {
            System.out.println("La cadena es palíndromo");
        } else {
            System.out.println("La cadena no es palíndromo");
        }
    }
    }