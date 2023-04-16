import java.awt.*;

public class GraphicalObjets {
    public void drawRoad(Graphics g) {
        //drawing the road and traffic signal
        g.setColor(Color.white);
        g.drawRect(960, 68, 50, 125);
        g.drawRect(980, 193, 10, 150);
        g.drawLine(980, 343, 10, 500);
        g.drawLine(980, 543, 10, 700);
        g.drawOval(970, 75, 30, 30); // red
        g.drawOval(970, 115, 30, 30); // yellow
        g.drawOval(970, 155, 30, 30); // green
    }

    public void drawCar(Graphics g, int p, int q) {
        // Drawing The Car
        g.setColor(Color.orange);
        // here p & q are translation factor Tx & Ty respectively
        g.drawLine(80 + p, 640 + q, 270 + p, 608 + q); // body
        g.drawLine(80 + p, 640 + q, 60 + p, 570 + q);
        g.drawLine(80 + p, 640 + q, 80 + p, 604 + q);
        g.drawLine(60 + p, 570 + q, 60 + p, 534 + q);
        g.drawLine(270 + p, 608 + q, 270 + p, 572 + q);
        g.drawLine(270 + p, 572 + q, 80 + p, 604 + q);
        g.drawLine(80 + p, 604 + q, 60 + p, 534 + q);
        g.drawLine(270 + p, 572 + q, 242 + p, 502 + q);
        g.drawLine(242 + p, 502 + q, 198 + p, 510 + q);

        g.fillOval(100 + p, 622 + q, 40, 40); // wheel
        g.fillOval(210 + p, 606 + q, 40, 40);

        g.drawLine(90 + p, 564 + q, 200 + p, 546 + q); // roof
        g.drawLine(200 + p, 546 + q, 176 + p, 488 + q);
        g.drawLine(90 + p, 564 + q, 70 + p, 506 + q);
        g.drawLine(70 + p, 506 + q, 176 + p, 488 + q);

        g.drawLine(200 + p, 546 + q, 230 + p, 580 + q); // windshield
        g.drawLine(176 + p, 488 + q, 198 + p, 510 + q);
        g.drawLine(198 + p, 510 + q, 230 + p, 580 + q);
        g.drawLine(60 + p, 534 + q, 70 + p, 506 + q);
        g.drawLine(60 + p, 534 + q, 70 + p, 506 + q);
        g.drawLine(60 + p, 534 + q, 70 + p, 506 + q);
        g.drawLine(60 + p, 534 + q, 70 + p, 506 + q);
        g.drawLine(80 + p, 604 + q, 90 + p, 564 + q);
    }
}
