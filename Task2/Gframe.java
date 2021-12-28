import com.Ritsy.Gpanel;

import javax.swing.*;


public class Gframe extends JFrame {
    Gframe(){
        this.add(new Gpanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
