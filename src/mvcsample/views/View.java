package mvcsample.views;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class View {

    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JTextField textField1, textField2, textFieldSum;

    public View(String text) {
        frame = new JFrame("View");
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setVisible(true);

        textField1 = new JTextField("Number", 10);
        textField1.setBounds(110, 0, 130, 30);
        textFieldSum = new JTextField("", 10);
        textFieldSum.setBounds(110, 50, 130, 30);
        frame.getContentPane().add(textField1);
        frame.getContentPane().add(textFieldSum);

//        label = new JLabel(text);
//        frame.getContentPane().add(label, BorderLayout.CENTER);
        button = new JButton("Submit");
        button.setBounds(100, 100, 140, 40);
        frame.getContentPane().add(button);
    }

    public JButton getButton() {
        return button;
    }

    public void setText(String text) {
        textFieldSum.setText(text);
    }
    
    public String getText() {
        return textField1.getText();
    }

}
