package NodoMain;

public class NodosMain {
    public static void main(String[] args) {

        Nodo<Integer> head1 = new Nodo<>(100, new Nodo<>(200, new Nodo<>(300, new Nodo<>(400, new Nodo<>(600)))));
        System.out.println("Imprimir nodos");
        imprimirNodo(head1);
        System.out.println("\n \nCambiar el valor del tercer nodo de 300 -> 333");
        head1.getSiguiente().getSiguiente(). setDato(333);
        imprimirNodo(head1);
        System.out.println("\n \nInsertar nodo 700 despues de 600");
        head1.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(700,null));
        imprimirNodo(head1);
        System.out.println("\n \nInsertar nodo 50 antes de 100");
        Nodo<Integer> head = new Nodo<>(50,head1);
        imprimirNodo(head);

    }
    public static void imprimirNodo(Nodo<Integer>head) {
        Nodo<Integer> aux =head;
        System.out.print("|");
        while (aux != null) {
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
        System.out.print("null|");
    }


}