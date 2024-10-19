package lab5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public task2() {
        setTitle("Матч: AC Milan vs Real Madrid");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Результат: 0 X 0");
        lastScorerLabel = new JLabel("Последний забивший: N/A");
        winnerLabel = new JLabel("Победитель: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateResults("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateResults("Real Madrid");
            }
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateResults(String lastScorer) {
        resultLabel.setText("Результат: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Последний забивший: " + lastScorer);
        updateWinner();
    }

    private void updateWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Победитель: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Победитель: Real Madrid");
        } else {
            winnerLabel.setText("Победитель: DRAW");
        }
    }

    public static void main(String[] args) {
        task2 frame = new task2();
        frame.setVisible(true);
    }
}