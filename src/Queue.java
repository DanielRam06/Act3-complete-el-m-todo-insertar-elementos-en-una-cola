public class Queue {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.agregar(1);
        q.agregar(5);
        q.agregar(3);
        q.eliminar();
        q.agregar(4);
        q.eliminar();
        q.agregar(8);
        q.imprimirCola();
    }    
    int tail;
    int max;
    public int[] array;

    public Queue (int queueSize) {
        this.array = new int[queueSize];
        this.max = this.array.length;
        this.tail = 0;        
    }

    public void eliminar () {
        if(tail == 0) {
            System.out.println("#");
        }else {
            for(int i = 0; i < array.length-1; i++) {
                array[i] = array[(i+1)];
            }
            tail--;
        }
    }
    public void imprimirCola() {
        if (tail == 0) {
            System.out.println("#");
        } else {
            for (int i = 0; i < tail; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    public void agregar (int dato) {
        if(tail == max) {
            System.out.println("Queue is full");
        } else {
            array[tail] = dato;
            tail++;
        }
    }
}