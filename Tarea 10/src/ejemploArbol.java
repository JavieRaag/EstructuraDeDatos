public class ejemploArbol {
    public static void main(String[] args) {

        System.out.println("Árbol 1:");
        NodoArbol<Integer> raiz1 = new NodoArbol<>(10);
        raiz1.setHijoIzquierdo(new NodoArbol<>(5));
        raiz1.setHijoDerecho(new NodoArbol<>(15));
        raiz1.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>(1));
        raiz1.getHijoDerecho().setHijoDerecho(new NodoArbol<>(25));
        System.out.println(raiz1);

        System.out.println(".-.-.-.-.-.-");

        System.out.println("Árbol 2:");
        NodoArbol<String> raiz2 = new NodoArbol<>("Diego");
        raiz2.setHijoIzquierdo(new NodoArbol<>("Pedro"));
        raiz2.setHijoDerecho(new NodoArbol<>("Mario"));
        raiz2.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("Susan"));
        raiz2.getHijoIzquierdo().setHijoDerecho(new NodoArbol<>("Diana"));
        System.out.println(raiz2);
    }
}

