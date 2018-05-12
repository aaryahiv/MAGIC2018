import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class outputShow extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JButton jb = new JButton("Enter");

    public outputShow() {

        setTitle("Show the Output");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.jl.setSize(200, 200);
        add(jl);


        jp.add(jt);
        jp.add(jb);
        jp.add(jl);
        add(jp);


        jt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });


        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });


    }


    public static void main(String[] args) {

        outputShow t = new outputShow();
    }
}
