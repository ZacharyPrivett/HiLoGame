import javax.swing.*;

public class HiLoFrame extends JFrame{
    private JPanel mainPanel;

    public HiLoFrame(String title) {
       super(title);

       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setContentPane(mainPanel);
       this.pack();
    }
}
