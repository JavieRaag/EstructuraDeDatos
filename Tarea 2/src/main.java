public static void main(String[] args) {

    ConjuntoAdt a = new ConjuntoAdt();
    a.agregar(1);
    a.agregar(2);
    a.agregar(4);
    a.agregar(5);
    a.agregar(8);
    a.agregar(9);

    ConjuntoAdt b = new ConjuntoAdt();
    b.agregar(1);
    b.agregar(2);
    b.agregar(4);
    b.agregar(8);
    b.agregar(7);


    System.out.println("Conjunto A:");
    a.mostrar();

    System.out.println("Conjunto B:");
    b.mostrar();

    System.out.print("Conjunto A ");
    System.out.println(a.contiene(2));

    System.out.print("Conjunto B " );
    System.out.println(b.contiene(3));

    a.eliminar(6);
    b.eliminar(7);
    System.out.println("Conjunto A ahora");
    a.mostrar();
    System.out.println("Conjunto B ahora:");
    b.mostrar();
    System.out.print("Conjunto A y Conjunto B son iguales: ");
    System.out.println(a.equals(b));
    System.out.print("Conjunto A es subconjunto de Conjunto B: ");
    System.out.println(a.esSubConjunto(b));
    System.out.print("Conjunto B es subconjunto de Conjunto A: ");
    System.out.println(b.esSubConjunto(a));
    ConjuntoAdt c = a.union(b);
    System.out.println("Union de conjunto A y B: ");
    c.mostrar();
    System.out.println("Interseccion de conjuntos A y B: ");
    ConjuntoAdt d = a.interseccion(b);
    d.mostrar();
    System.out.println("Diferencia de conjunto A y B: ");
    ConjuntoAdt e = a.diferencia(b);
    e.mostrar();
}

