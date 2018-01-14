import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JButton save = new JButton("Save Recording");
    JButton delete = new JButton("Delete Recording");
    JButton listen = new JButton("Listen to Recording");

    public GUI(){
        setTitle("Edit/Save Recording");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(jt);
        jp.add(jl);
        jp.add(save);
        jp.add(delete);
        jp.add(listen);

        add(jp);


        jt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });

        listen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });

    }

    public static void main(String[] args) {

        GUI gui = new GUI();
    }


}
