import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainFrame extends JFrame {
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    public void init() {
        JLabel lbFirstName = new JLabel("姓");

        JLabel lbLastName = new JLabel("名");

        tfFirstName = new JTextField();

        tfLastName = new JTextField();

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);

        lbWelcome = new JLabel();

        JButton btnOK = new JButton("OK");
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                System.out.println(firstName);
                System.out.println(firstName != "");
                System.out.println(firstName != null);
                System.out.println(firstName.length());
                if (firstName.length() > 0 && lastName.length() > 0) {

                    lbWelcome.setText("同学," + firstName + " " + lastName + ", 你好！");
                } else {
                    lbWelcome.setText("啥都不输入，我咋叫你呀！");
                }

            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");

            }
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4, 1, 5, 5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("胡杨学java");
        setSize(600, 400);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
