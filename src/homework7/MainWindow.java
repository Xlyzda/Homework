package homework7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private int winWidth = 750;
    private int winHeigt = 600;
    private int winX = 600;
    private int winY = 200;

    private JButton btnSend;
    private JButton btnExit;
    private JPanel panel1;
    private JPanel panel2;
    private  JPanel panel3;
    private JTextArea myText;
    private JTextField txtToSend;
    private JButton btnClear;

    public MainWindow() {
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        btnSettings();
        txtSettings();
        setPanels();
        windowSettings();

    }

    private void setPanels() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2,1));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(10,1));
        panel2.add(txtToSend);
        panel2.add(btnSend);
        panel2.add(btnClear);
        panel2.add(btnExit);
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1,1));
        panel3.add(myText);
        panel1.add(panel2, BorderLayout.NORTH);
    }

    private void windowSettings() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWidth, winHeigt);
        setLocation(winX, winY);
        setTitle("HomeWork 7");
        add(panel1, BorderLayout.EAST);
        add(panel3, BorderLayout.CENTER);
        setVisible(true);
    }

    private void btnSettings() {
        txtToSend = new JTextField();
        btnSend = new JButton("Send");
        btnClear = new JButton("Clear");
        btnExit = new JButton("EXIT");
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myText.append(txtToSend.getText());
                txtToSend.setText("");
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myText.setText("");
            }
        });

    }

    private  void txtSettings() {
        myText = new JTextArea();
        myText.setEditable(false);
        myText.setLineWrap(true);
    }
}
