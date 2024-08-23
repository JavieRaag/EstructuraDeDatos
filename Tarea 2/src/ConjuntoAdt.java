import java.util.ArrayList;

public class ConjuntoAdt {
    private ArrayList<Integer> conjunto;

    public ConjuntoAdt() {
        this.conjunto = new ArrayList<>();
    }

    public void agregar(Integer elemento) {
        if (!conjunto.contains(elemento)) {
            conjunto.add(elemento);
        } else {

        }
    }

    public void mostrar() {
        System.out.println(conjunto);
    }

    public boolean contiene(Integer elemento) {
        System.out.println("¿contiene? " + (elemento));
        return conjunto.contains(elemento);
    }

    public void eliminar(Integer elemento) {
        if (conjunto.contains(elemento)) {
            conjunto.remove(elemento);
            System.out.println("Se ha eliminado " + elemento + " del conjunto.");

        } else {
            System.out.println("No se puede eliminar el elemento " + elemento + " porque no está presente en el conjunto.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ConjuntoAdt otroConjunto = (ConjuntoAdt) obj;
        return conjunto.equals(otroConjunto.conjunto);
    }

    public boolean esSubConjunto(ConjuntoAdt otroConjunto) {

        return otroConjunto.conjunto.containsAll(this.conjunto);
    }

    public ConjuntoAdt union(ConjuntoAdt otroConjunto) {
        ConjuntoAdt conjuntoUnido = new ConjuntoAdt();
        for (Integer elemento : this.conjunto) {
            conjuntoUnido.agregar(elemento);
        }
        for (Integer elemento : otroConjunto.conjunto) {
            conjuntoUnido.agregar(elemento);
        }
        return conjuntoUnido;
    }

    public ConjuntoAdt interseccion(ConjuntoAdt otroConjunto) {
        ConjuntoAdt conjuntoInterseccion = new ConjuntoAdt();

        for (Integer elemento : this.conjunto) {
            if (otroConjunto.conjunto.contains(elemento)) {
                conjuntoInterseccion.agregar(elemento);
            }
        }

        return conjuntoInterseccion;
    }

    public ConjuntoAdt diferencia(ConjuntoAdt otroConjunto) {
        ConjuntoAdt conjuntoDiferencia = new ConjuntoAdt();

        for (Integer elemento : this.conjunto) {
            if (!otroConjunto.conjunto.contains(elemento)) {
                conjuntoDiferencia.agregar(elemento);
            }
        }

        return conjuntoDiferencia;
    }
}