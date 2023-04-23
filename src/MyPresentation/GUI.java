package MyPresentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyPresentation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Presentation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.RED);
        JLabel label = new JLabel("My Presentation");
        label.setFont(new Font("Algerian", Font.PLAIN, 24));
        label.setHorizontalAlignment(JLabel.CENTER);
        northPanel.add(label);
        frame.add(northPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.BLACK);
        southPanel.setLayout(new GridLayout(1, 3));

        JButton button1 = new JButton("This is me");
        button1.setBackground(Color.YELLOW);
        JButton button2 = new JButton("My hobbies");
        button2.setBackground(Color.BLUE);
        JButton button3 = new JButton("My expectations");
        button3.setBackground(Color.RED);

        southPanel.add(button1);
        southPanel.add(button2);
        southPanel.add(button3);

        frame.add(southPanel, BorderLayout.SOUTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.RED);
        frame.add(eastPanel, BorderLayout.EAST);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.RED);
        frame.add(westPanel, BorderLayout.WEST);

        JLabel centerLabel = new JLabel();
        centerLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(centerLabel, BorderLayout.CENTER);

        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    centerLabel.setText("");
                    centerLabel.setIcon(new ImageIcon("src/imagenes/yo2.jpg"));
                }
            }
        });

        button2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    centerLabel.setText("");
                    centerLabel.setIcon(new ImageIcon("src/imagenes/asd.jpg"));
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerLabel.setIcon(null);
                centerLabel.setText("My expectations are learn JAVA GUI");
            }
        });

        frame.setFocusable(true);
        frame.setVisible(true);
    }
}
