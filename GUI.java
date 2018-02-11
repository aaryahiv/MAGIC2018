import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import java.io.FileInputStream;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

public class GUI extends JFrame{
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JButton save = new JButton("Save Recording");
    JButton delete = new JButton("Delete Recording");
    JButton listen = new JButton("Listen to Recording");



    public GUI(){
        setTitle("Edit/Save Recording");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jp.add(jl);
        jp.add(save);
        jp.add(delete);
        jp.add(listen);

        add(jp);
        //Dropdown List
        JLabel lbl = new JLabel("Select one of the possible choices to hear a sound");
        lbl.setVisible(true);

        jp.add(lbl);

        String[] choices = { "SOUND 1","SOUND 2", "SOUND 3","SOUND 4","SOUND 5","SOUND 6"};

        final JComboBox<String> cb = new JComboBox<String>(choices);

        cb.setVisible(true);
        jp.add(cb);
        //End of dropdown list
        cb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                String SOUND1 = (String) combo.getSelectedItem();
                String SOUND2 = (String) combo.getSelectedItem();
                String SOUND3 = (String) combo.getSelectedItem();
                String SOUND4 = (String) combo.getSelectedItem();
                String SOUND5 = (String) combo.getSelectedItem();
                String SOUND6 = (String) combo.getSelectedItem();


                //Sound 1
                if (SOUND1.equals("SOUND 1")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("musical098.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();

                    }

                    catch(UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    }
                    catch(IOException ioe) {
                        System.out.println(ioe);
                    }
                    catch(LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 2
                if (SOUND2.equals("SOUND 2")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("musical112.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();

                    }

                    catch(UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    }
                    catch(IOException ioe) {
                        System.out.println(ioe);
                    }
                    catch(LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 3
                if (SOUND3.equals("SOUND 3")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("musical029.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();

                    }

                    catch(UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    }
                    catch(IOException ioe) {
                        System.out.println(ioe);
                    }
                    catch(LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 4
                if (SOUND4.equals("SOUND 4")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("musical007.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();

                    }

                    catch(UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    }
                    catch(IOException ioe) {
                        System.out.println(ioe);
                    }
                    catch(LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 5
                if (SOUND5.equals("SOUND 5")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("musical056.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();

                    }

                    catch(UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    }
                    catch(IOException ioe) {
                        System.out.println(ioe);
                    }
                    catch(LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 6
                if (SOUND6.equals("SOUND 6")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("dixie-horn_daniel-simion.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();

                    }

                    catch(UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    }
                    catch(IOException ioe) {
                        System.out.println(ioe);
                    }
                    catch(LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

            }
        });


        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setCurrentDirectory(new File("~/"));
                int result = jFileChooser.showSaveDialog(new JFrame());

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jFileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                }



            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        listen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }

        });

    }

    public static void main(String[] args) {

        GUI gui = new GUI();


        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("musical064.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();

        }

        catch(UnsupportedAudioFileException uae) {
            System.out.println(uae);
        }
        catch(IOException ioe) {
            System.out.println(ioe);
        }
        catch(LineUnavailableException lua) {
            System.out.println(lua);
        }
    }


}
