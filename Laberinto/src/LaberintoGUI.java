import javax.swing.*;
import java.awt.*;

public class LaberintoGUI extends JPanel {
    private final Character[][] data;

    public LaberintoGUI(Character[][] data) {
        this.data = data;
        setPreferredSize(new Dimension(data[0].length * 50, data.length * 50));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                switch (data[i][j]) {
                    case 'X' -> g.setColor(Color.BLACK);
                    case 'E' -> g.setColor(Color.BLUE);
                    case 'S' -> g.setColor(Color.RED);
                    case 'G' -> g.setColor(Color.LIGHT_GRAY);
                    default -> g.setColor(Color.WHITE);
                }
                g.fillRect(j * 50, i * 50, 50, 50);
                g.setColor(Color.GRAY);
                g.drawRect(j * 50, i * 50, 50, 50);
            }
        }
    }
}


