package lab12;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;


public class task2 {
    public static void main(String[] args) throws IOException {
        String imagepath = args[0];
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final ImageIcon[] imageIcon = {new ImageIcon(ImageIO.read(new File(imagepath)))};
        JLabel label = new JLabel(imageIcon[0]);
        frame.getContentPane().add(label);

        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Image image = imageIcon[0].getImage();
                Image newImg = image.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
                imageIcon[0] = new ImageIcon(newImg);
                label.setIcon(imageIcon[0]);
            }
        });

        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);

    }
}