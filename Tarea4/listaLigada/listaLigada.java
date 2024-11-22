package listaLigada;

public class ListaLigada<T> {
    private Nodo<T> head;
    private Nodo<T> tail;
    private int tamanio;

    public ListaLigada() {
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlInicio(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
        }
        this.tamanio++;
    }

    public void agregarAlFinal(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            this.tail.setSiguiente(nuevo);
            this.tail = nuevo;
        }
        this.tamanio++;
    }

    public void transversal() {
        Nodo<T> aux = this.head;
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        System.out.println();
    }

    public void agregarDespuesDe(T referencia, T valor) {
        Nodo<T> aux = this.head;
        while (aux != null && !aux.getData().equals(referencia)) {
            aux = aux.getSiguiente();
        }
        if (aux == null) {
            System.out.println("No existe la referencia!!!");
        } else {
            Nodo<T> nuevo = new Nodo<>(valor, aux.getSiguiente());
            aux.setSiguiente(nuevo);
            if (aux == this.tail) {
                this.tail = nuevo;
            }
            this.tamanio++;
        }
    }

    public void eliminarPrimero() {
        if (!this.estaVacia()) {
            this.head = this.head.getSiguiente();
            if (this.head == null) {
                this.tail = null;
            }
            this.tamanio--;
        }
    }

    public void eliminarFinal() {
        if (!this.estaVacia()) {
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
            } else {
                Nodo<T> aux = this.head;
                while (aux.getSiguiente() != this.tail) {
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
                this.tail = aux;
            }
            this.tamanio--;
        }
    }

    public void eliminarPosicion(int posicion) {
        if (posicion < 1 || posicion > this.tamanio) {
            System.out.println("Posición fuera de rango.");
            return;
        }
        if (posicion == 1) {
            eliminarPrimero();
        } else {
            Nodo<T> aux = this.head;
            for (int i = 1; i < posicion - 1; i++) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
            if (aux.getSiguiente() == null) {
                this.tail = aux;
            }
            this.tamanio--;
        }
    }

    public int buscarValor(T valor) {
        Nodo<T> aux = this.head;
        int posicion = 1;

        while (aux != null) {
            if (aux.getData().equals(valor)) {
                System.out.println("La posición de " + valor + " es: " + posicion);
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }

        return -1; // No encontrado
    }

    public void actualizarValor(int posicion, T valor) {
        if (posicion < 1 || posicion > this.tamanio) {
            System.out.println("Posición fuera de rango.");
            return;
        }
        Nodo<T> aux = this.head;
        int contador = 1;

        while (contador < posicion) {
            aux = aux.getSiguiente();
            contador++;
        }
        aux.setData(valor);
    }
}
