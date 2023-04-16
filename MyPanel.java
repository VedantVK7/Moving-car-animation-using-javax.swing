import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    int lightNo = 0;
    int iterationNo = 0;
    int p = -310, q = 51;
    int red_counter = 0, yellow_counter = 0, green_counter = 0;

    public void paint(Graphics g) {

        super.paint(g);

        GraphicalObjets myObj = new GraphicalObjets();
        myObj.drawRoad(g);
        myObj.drawCar(g, p, q);

        if (lightNo == 0) {
            g.setColor(Color.black);
            g.fillOval(970, 155, 30, 30); // changes the color of 3rd signal from green to black
            g.setColor(Color.red);
            g.fillOval(970, 75, 30, 30); // draws red color light
        }

        if (lightNo == 1) {
            g.setColor(Color.black);
            g.fillOval(970, 75, 30, 30); // changes the color of 1rd signal from red to black
            g.setColor(Color.YELLOW);
            g.fillOval(970, 115, 30, 30); // draws yellow color light
        }

        if (lightNo == 2) {
            g.setColor(Color.black);
            g.fillOval(970, 115, 30, 30); // changes the color of 2rd signal from yellow to black
            g.setColor(Color.green);
            g.fillOval(970, 155, 30, 30); // draws green color light
        }

        if (red_counter < 1400 && lightNo == 0) {
            try {
                Thread.sleep(8);
            } catch (Exception e) {
            }
            if (red_counter < 1000) {
                p++; // increase p by 1 per iteration
                if (p % 6 == 0)
                    q--; // decrease q by 1 per 6 iterations
            }
            repaint();
            red_counter++;
        }
        if (red_counter == 1399 && lightNo == 0) {
            lightNo++;
        }

        if (yellow_counter < 100 && lightNo == 1) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            repaint();
            yellow_counter++;
        }

        if (yellow_counter == 99 && lightNo == 1)
            lightNo++;

        if (green_counter < 500 && lightNo == 2) {
            p++; // increase p by 1 per iteration
            if (p % 6 == 0)
                q--; // decrease q by 1 per 6 iteration
            try {
                Thread.sleep(7);
            } catch (Exception e) {
            }
            repaint();
            green_counter++;
        }

        if (green_counter == 499 && lightNo == 2 && iterationNo < 2) {
            green_counter = red_counter = yellow_counter = lightNo =  0;
            p=-310;
            q=51;
            repaint();
            iterationNo++;
        }
    }
}
