package listaDoblementeLigada;

public class listaObjetos {

    public static void main(String[] args)
    {

        DoubleLinkedList<Integer> numeros = new DoubleLinkedList<Integer>();
        numeros.agregarAlInicio(50);
        numeros.agregarAlFinal(60);
        numeros.agregarAlFinal(65);
        numeros.agregarAlFinal(70);
        numeros.agregarAlFinal(80);
        numeros.agregarAlFinal(90);
        numeros.transversal(0);
        numeros.eliminarPosicion(2);
        System.out.println("Elminando posicion 2");
        numeros.transversal(0);
        numeros.actualizarValor(4,88);
        System.out.println("Actualizando valor en la posicion 4 a 88");
        numeros.transversal(0);
        System.out.println("Buscando elementos 80 y 88");
        numeros.buscarValor(80);
        numeros.buscarValor(88);
    }

}

