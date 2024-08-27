package NodoMain;

public class NodosMain {
    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo<>();

        Nodo<Integer> head1 = new Nodo<>(50, new Nodo<>(100,new Nodo<>(200, new Nodo<>(333, new Nodo<>(400,new Nodo<>(600, new Nodo<>(700)))))));


        Nodo<Integer> aux = head1;
        System.out.print("|");
        while (aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
        System.out.print("null|");


    }
}