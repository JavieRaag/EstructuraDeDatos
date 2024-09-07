package listaDoblementeLigada;

public class DoubleLinkedList<T> {
    private NodoDoble<T> head;
    private NodoDoble<T> tail;
    private int tamanio;


    public boolean estaVacia() {
        boolean res = false;
        if (this.head == null && this.tail == null) {
            res = true;
        }
        return res;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlInicio(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            this.head.setAnterior(nuevo);
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
        }
        this.tamanio++;
    }

    public void agregarAlFinal(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            NodoDoble<T> aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            this.tail = nuevo;
        }
        this.tamanio++;
    }

    /**
     * @param direccion 0 --> izq a derecha  si es 1 --> derecha a izq
     */
    public void transversal(int direccion) {
        if (direccion == 1) {
            NodoDoble<T> aux = this.tail;
            while (aux != null) {
                System.out.print(aux);
                aux = aux.getAnterior();
            }
        } else {
            NodoDoble<T> aux = this.head;
            while (aux != null) {
                System.out.print(aux);
                aux = aux.getSiguiente();
            }
        }
        System.out.println("");
    }

    public void agregarDespuesDe(T referencia, T valor) {
        NodoDoble<T> aux = this.head;
        while (aux.getData() != referencia){
            aux = aux.getSiguiente();
        }
        if(aux == null){
            System.out.println("No existe la referencia!!!");
        }else{


        }

    }

    public void obtenerValor(int posicion) {
        NodoDoble<T> aux = this.head;
        if(posicion < 0   || posicion >this.tamanio){
            System.out.println("No existe la posicion");
            return;
        }else {

            for (int i = 1; i < posicion; i++) {
                aux = aux.getSiguiente();
            }

            System.out.println("El elemento en la posicion "+ posicion+ " es: "+aux.getData());
        }

    }

    public void eliminarPrimero() {
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {

            this.head = this.head.getSiguiente();
            this.head.setAnterior(null);
        }
        this.tamanio--;
    }

    public void eliminarFinal() {
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail = this.tail.getAnterior();
            this.tail.setSiguiente(null);
        }
        this.tamanio--;
    }

    public void eliminarPosicion(int posicion) {
        NodoDoble<T> aux = this.head;
        for (int i = 1; i < posicion; i++) {
            aux = aux.getSiguiente();
        }
        aux.getAnterior().setSiguiente(aux.getSiguiente());
        aux.getSiguiente().setAnterior(aux.getAnterior());
        this.tamanio--;
    }

    public int buscarValor(T valor) {
        NodoDoble<T> aux = this.head;
        int posicion = 1;
        while (aux != null) {
            if (aux.getData().equals(valor)) {
                System.out.println("La posicion de " + valor + " es: " + posicion);
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }

        System.out.println("No existe ese valor (" + valor + ")");
        return -1;
    }

    public void actualizarValor(int posicion, T valor) {

        NodoDoble<T> aux = this.head;
        int contador = 1;

        while (contador < posicion) {
            aux = aux.getSiguiente();
            contador++;
        }
        aux.setData(valor);
    }

}