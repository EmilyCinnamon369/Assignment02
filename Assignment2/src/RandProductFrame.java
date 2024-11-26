import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandProductFrame extends JFrame {

    public RandProductFrame() {

        setTitle("Product Maker");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Font font1 = new Font("Times New Roman", Font.BOLD, 56);
        Font font2 = new Font("Times New Roman", Font.PLAIN, 18);
        Font font3 = new Font("Times New Roman", Font.PLAIN, 14);

        JLabel jabel = new JLabel("Add Product Record", JLabel.LEFT);
        jabel.setBounds(50, 50, 600, 100);
        jabel.setFont(font1);

        JTextArea jerria1 = new JTextArea("Product Name");
        jerria1.setBounds(50, 150, 500, 25);
        jerria1.setFont(font3);

        JTextArea jerria2 = new JTextArea("Product Description");
        jerria2.setBounds(50, 200, 500, 25);
        jerria2.setFont(font3);

        JTextArea jerria3 = new JTextArea("Product ID");
        jerria3.setBounds(50, 250, 500, 25);
        jerria3.setFont(font3);

        JTextArea jerria4 = new JTextArea("Product Price");
        jerria4.setBounds(50, 300, 500, 25);
        jerria4.setFont(font3);

        JTextArea jerria5 = new JTextArea("");
        jerria5.setBounds(50, 350, 500, 150);
        jerria5.setFont(font3);

        //quit button
        JButton quit_butt = new JButton("Quit");
        quit_butt.setBounds(40, 515, 200, 25);
        quit_butt.setFont(font2);
        quit_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //enter button
        JButton enter_butt = new JButton("Enter");
        enter_butt.setBounds(400, 515, 200, 25);
        enter_butt.setFont(font2);
        enter_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jerria5.append("Name: "+jerria1.getText()+"\nDescription: "+jerria2.getText()+"\nID: "+jerria3.getText()+"\nPrice: "+jerria4.getText());
            }
        });

        add(jabel);
        add(jerria1);
        add(jerria2);
        add(jerria3);
        add(jerria4);
        add(jerria5);
        add(quit_butt);
        add(enter_butt);

        setVisible(true);

    }}
