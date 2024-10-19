package lab5;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class task1 {
    public static void main(String[] args) throws IOException {
        String imagepath=args[0];
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image image = ImageIO.read(new File(imagepath));
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,600);
    }
}
