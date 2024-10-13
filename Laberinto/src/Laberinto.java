import javax.swing.*;
import java.util.Stack;

public class Laberinto {
    Character[][] data;
    int rowSize;
    int colSize;
    Stack<int[]> caminoRecorrido;
    boolean salidaEncontrada = false;

    public Laberinto(int ren, int col) {
        this.rowSize = ren;
        this.colSize = col;
        this.data = new Character[ren][col];
        this.caminoRecorrido = new Stack<>();
    }

    public void rellenar(Character dato) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                data[i][j] = dato;
            }
        }
    }

    public void Entrada(int ren, int col) {
        data[ren][col] = 'E';
        caminoRecorrido.push(new int[]{ren, col});
    }

    public void Salida(int ren, int col) {
        data[ren][col] = 'S';
    }

    public void camino(JPanel panel) {
        Timer timer = new Timer(500, e -> {
            if (caminoRecorrido.isEmpty() || salidaEncontrada) {
                ((Timer) e.getSource()).stop();
                return;
            }

            int[] actual = caminoRecorrido.peek();
            int x = actual[0], y = actual[1];

            if (data[x][y] == 'S') {
                System.out.println("¡Salida encontrada!");
                salidaEncontrada = true;
                panel.repaint();
                ((Timer) e.getSource()).stop();
                return;
            }

            if (!mover(x, y - 1) &&
                    !mover(x - 1, y) &&
                    !mover(x, y + 1) &&
                    !mover(x + 1, y)) {
                retroceder();
            }

            panel.repaint();
        });

        timer.start();
    }

    private boolean mover(int x, int y) {

        if (x >= 0 && x < rowSize && y >= 0 && y < colSize &&
                data[x][y] != 'X' && data[x][y] != 'E' && data[x][y] != 'G') {

            if (data[x][y] != 'S') {
                data[x][y] = 'E';
            }

            caminoRecorrido.push(new int[]{x, y});
            System.out.println("Moviéndonos a (" + x + ", " + y + ")");
            return true;
        }
        return false;
    }

    private void retroceder() {
        int[] pos = caminoRecorrido.pop();
        data[pos[0]][pos[1]] = 'G';
        System.out.println("Retrocediendo desde (" + pos[0] + ", " + pos[1] + ")");
    }
}

