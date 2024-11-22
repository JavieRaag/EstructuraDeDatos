package ColaConPrioridadAcotada;
import java.util.Arrays;

public class ColaConPrioridadAcotada<E> {
    private ColaADT<E> []colas;
    private int maxPrioridad;

    public ColaConPrioridadAcotada(int maxPrioridad) {
        this.maxPrioridad = maxPrioridad;
        this.colas = new ColaADT[maxPrioridad + 1];
        for (int i = 0; i <= maxPrioridad; i++) {
            this.colas[i] = new ColaADT<E>();
        }
    }

    public int longitud(){
        int total = 0;
        for (int i = 0; i < maxPrioridad+1; i++) {
            total += this.colas[i].longitud();
        }
        return total;
    }

    public boolean estaVacia(){ //
        return this.longitud() == 0;
    }

    public void encolar(int prioridad, E elemento){
        if (prioridad>= 1 && prioridad <= this.maxPrioridad){
            this.colas[prioridad].encolar(elemento);
        }
    }
    public ClienteBanco desEncolar() {
        if (this.estaVacia()) {
            System.out.println("No hay más elementos");
            return null;
        }

        for (int i = 1; i <= maxPrioridad; i++) {
            if (!colas[i].estaVacia()) {
                ClienteBanco clienteDesencolado = (ClienteBanco) colas[i].desEncolar();
                System.out.println("Elemento desencolado de prioridad " + i + ": " + clienteDesencolado);
                return clienteDesencolado;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ColaConPrioridadAcotada{" +
                "colas=" + Arrays.toString(colas) +
                ", maxPrioridad=" + maxPrioridad +
                '}';
    }
}