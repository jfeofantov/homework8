import javax.swing.*; // Settings - Plugins = JFormDesigner
import java.awt.*;

public class MyWindow extends JFrame {
    public void initWindow(){
        setSize(500,500);
        setLocation(650,250);
        int value = WindowConstants .EXIT_ON_CLOSE;
        setDefaultCloseOperation(value);

        GridLayout layout = new GridLayout(1,2);
        JPanel panel = new JPanel(layout);

        JButton firstButton = new JButton("Выход");
        JButton secondButton = new JButton("Конпка");
        panel.add(secondButton);
        panel.add(firstButton);

        add(panel , BorderLayout.SOUTH);


        setVisible(true);
    }

}
