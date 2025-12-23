import java.awt.*;
import java.awt.event.*;

class MouseEventExample extends Frame implements MouseListener {

    Label l;

    MouseEventExample() {

        l = new Label("Perform Mouse Action");
        l.setBounds(80, 100, 250, 30);
        add(l);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        addMouseListener(this);

    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
