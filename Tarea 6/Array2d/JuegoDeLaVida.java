package Array2d;

public class JuegoDeLaVida {
    private Array2d tableroJuego;

    public JuegoDeLaVida(Array2d tablero) {
        this.tableroJuego = tablero;
    }

    public int contarVecinosVivos(int ren, int col) {
        int vivos = 0;

        for (int i = ren - 1; i <= ren + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i == ren && j == col) continue;

                if (i >= 0 && i < tableroJuego.getRowSize() && j >= 0 && j < tableroJuego.getColSize()) {
                    if (tableroJuego.getItem(i, j) != null && tableroJuego.getItem(i, j) == '0') {
                        vivos++;
                    }
                }
            }
        }
        return vivos;
    }

    public void actualizarEstado() {
        Array2d nuevaMatriz = new Array2d(tableroJuego.getRowSize(), tableroJuego.getColSize());

        for (int i = 0; i < tableroJuego.getRowSize(); i++) {
            for (int j = 0; j < tableroJuego.getColSize(); j++) {
                int vecinosVivos = contarVecinosVivos(i, j);

                if (tableroJuego.getItem(i, j) == '0') {
                    if (vecinosVivos < 2 || vecinosVivos > 3) {
                        nuevaMatriz.setItem(i, j, '-');
                    } else {
                        nuevaMatriz.setItem(i, j, '0');
                    }
                } else if (tableroJuego.getItem(i, j) == '-') {
                    if (vecinosVivos == 3) {
                        nuevaMatriz.setItem(i, j, '0');
                    } else {
                        nuevaMatriz.setItem(i, j, '-');
                    }
                }
            }
        }

        this.tableroJuego = nuevaMatriz;
    }

    public Array2d getTableroJuego() {
        return this.tableroJuego;
    }
}


