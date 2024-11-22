package Array2d;

public class Arreglos2dMain {
    public static void main(String[] args) {
        Array2d rejilla = new Array2d(6, 6);
        rejilla.clear('-');

        rejilla.setItem(1, 1, '0');
        rejilla.setItem(3, 2, '0');
        rejilla.setItem(3, 3, '0');
        rejilla.setItem(1, 3, '0');
        rejilla.setItem(5, 4, '0');
        rejilla.setItem(4, 4, '0');
        rejilla.setItem(4, 2, '0');

        System.out.println("Rejilla inicial:");
        System.out.println(rejilla);

        JuegoDeLaVida juego = new JuegoDeLaVida(rejilla);

        for (int generacion = 1; generacion <= 10; generacion++) {
            juego.actualizarEstado();
            System.out.println("Generacion " + generacion + ":");
            System.out.println(juego.getTableroJuego());
        }
    }
}
