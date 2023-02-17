public class MyQueue {

    public static void main(String[] args) {
        MyQueue b = new MyQueue();

        b.invertirCadena("lapiz");
        System.out.println();

        System.out.println(b.esPalindromo("Anita lava la tina"));
    }

    public void invertirCadena(String myString) {
        String[] words = myString.split("");
        MyStack temp = new MyStack(words.length);
        int contador = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            temp.push(words[i].charAt(0));
            System.out.print(temp.stack[contador]);
            contador++;
        }
    }

    public boolean esPalindromo(String myString) {
        String minuscula = myString.toLowerCase();
        String todoJunto = minuscula.replace(" ", "");
        String[] words = todoJunto.split("");
        MyStack temp = new MyStack(words.length);
        for (int i = 0; i < words.length; i++) {
            temp.push(words[i].charAt(0));
        }
        String invert = new String(temp.stack);
        String minuscula1 = invert.toLowerCase();
        String todoJunto1 = minuscula1.replace(" ", "");
        Boolean result = todoJunto1.equals(todoJunto);
        return result;
    }

}

class MyStack {
    int top;
    int max;
    public char[] stack;

    public MyStack(int stackSize) {
        this.stack = new char[stackSize];
        this.max = this.stack.length;
        this.top = 0;
    }

    public void push(char valor) {
        if (top == max) {
            System.out.println("Stack is full");
        } else {
            stack[top] = valor;
            top++;
        }
    }

    public void pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            top--;
            System.out.println(stack[top]);
            stack[top] = 0;
        }
    }
}
