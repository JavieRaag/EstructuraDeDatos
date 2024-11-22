import javax.swing.*;

public class Recorrido {
    public static void main(String[] args) {
        Laberinto laberinto = new Laberinto(20, 20);

        laberinto.rellenar('P');

        for (int i = 0; i < 10; i++) {
            laberinto.data[0][i] = 'X';
            laberinto.data[9][i] = 'X';
            laberinto.data[i][0] = 'X';
            laberinto.data[i][9] = 'X';
        }

        laberinto.data[1][2] = 'X'; laberinto.data[2][2] = 'X'; laberinto.data[3][2] = 'X';
        laberinto.data[3][3] = 'X'; laberinto.data[3][4] = 'X'; laberinto.data[4][4] = 'X';

        laberinto.data[6][2] = 'X'; laberinto.data[6][3] = 'X'; laberinto.data[7][3] = 'X';
        laberinto.data[8][4] = 'X'; laberinto.data[7][5] = 'X'; laberinto.data[6][5] = 'X';

        laberinto.data[2][6] = 'X'; laberinto.data[3][6] = 'X'; laberinto.data[4][6] = 'X';
        laberinto.data[4][7] = 'X'; laberinto.data[5][7] = 'X'; laberinto.data[6][7] = 'X';

        laberinto.data[5][1] = 'X'; laberinto.data[1][4] = 'X'; laberinto.data[2][8] = 'X';

        laberinto.Entrada(1, 1);
        laberinto.Salida(9, 7);

        JFrame frame = new JFrame("Laberinto");
        LaberintoGUI panel = new LaberintoGUI(laberinto.data);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        laberinto.camino(panel);
    }
}


