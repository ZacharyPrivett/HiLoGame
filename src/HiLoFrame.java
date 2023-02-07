import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HiLoFrame extends JFrame{
    private JPanel mainPanel;
    private JTextField guessedNumber;
    private JButton guessButton;
    private JLabel guessLabel;

    int winningNumber = (int)(Math.random() * 100 + 1);
    public HiLoFrame(String title) {
       super(title);

       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setContentPane(mainPanel);
       this.pack();
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = (int)(Double.parseDouble(guessedNumber.getText()));
                guessLabel.setText(guess + "number Yea!");
            }
        });
    }
}
