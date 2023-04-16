import javax.swing.*;
import java.awt.*;

class TrafficSignal extends JFrame {
    public TrafficSignal() {
        setSize(1080, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("FOLLOW TRAFFIC RULES !!");
        setLocationRelativeTo(null);
        MyPanel panel = new MyPanel();
        panel.setBackground(Color.black);
        add(panel);
    }

    public static void main(String[] args) {
        TrafficSignal obj = new TrafficSignal();
        obj.setVisible(true);
    }
}
