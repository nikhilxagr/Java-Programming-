import java.awt.*;
import java.awt.event.*;

class KeyboardEventExample extends Frame implements KeyListener {

    Label l;

    KeyboardEventExample() {

        l = new Label("Press any key");
        add(l);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed : " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyboardEventExample();
    }
}
