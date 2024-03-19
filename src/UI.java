import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class UI {
    static JTextField whichNumber = new JTextField();

    public static void openUI() {
        JFrame frame = new JFrame("Rate die Nummer");
        frame.setSize(400, 300);
        calculateCenterLocation(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        getIcon(frame);
        setLabel(frame);
        setTextField(frame);
        setResultText(frame);
        setButton(frame);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private static void calculateCenterLocation(JFrame frame){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        Dimension frameSize = frame.getSize();
        int frameWidth = frameSize.width;
        int frameHeight = frameSize.height;
        frame.setLocation((width - frameWidth) / 2, (height - frameHeight) / 2);
    }

    private static void getIcon(JFrame frame){
        ImageIcon logoIcon = new ImageIcon(Objects.requireNonNull(UI.class.getClassLoader().getResource("icon/favicon.png")));
        frame.setIconImage(logoIcon.getImage());
    }

    private static void setLabel(JFrame frame) {
        JLabel text = new JLabel("Wir spielen: \"Rate eine Zahl zwischen 10 und 50\".");
        text.setBounds(20, 20, 360, 30);
        frame.add(text);
    }

    private static void setTextField(JFrame frame) {
        whichNumber.setBounds(20, 60, 340, 30);
        frame.add(whichNumber);
    }

    private static void setResultText(JFrame frame) {
        GuessNumbers.resultText.setBounds(60, 120, 300, 60);
        frame.add(GuessNumbers.resultText);
    }

    private static void setButton(JFrame frame) {
        JButton checkBtn = new JButton("Überprüfen");
        checkBtn.setBounds(260, 200, 100, 30);
        checkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFromField = whichNumber.getText();
                int number = Integer.parseInt(textFromField);
                GuessNumbers.guess(number);
            }
        });
        frame.add(checkBtn);
    }



}
