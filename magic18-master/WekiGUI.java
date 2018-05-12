import com.illposed.osc.OSCListener;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPortIn;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;


public class WekiGUI extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JButton save = new JButton("Save Recording");
    JButton delete = new JButton("Delete Recording");
    JButton listen = new JButton("Listen to Recording");
    ArrayList<String> sounds = new ArrayList<String>();
    String file;
    boolean sound1Playing = false;
    boolean sound2Playing = false;
    boolean sound3Playing = false;
    boolean sound4Playing = false;
    boolean sound5Playing = false;
    boolean sound6Playing = false;

    public WekiGUI() {
        ///////

        OSCPortIn receiver = null;
        try {
            receiver = new OSCPortIn(12000);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        //////////SOUND1
        OSCListener listener = new OSCListener() {
            public void acceptMessage(java.util.Date time, OSCMessage message) {
                Object message_args[] = message.getArguments();

                if (message_args[0].toString().equals("1.0")) {
                    System.out.println(message_args[0]);
                    try {
                        if (sound1Playing != true && sound2Playing != true) {
                            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("58491__juskiddink__guitar-string-snaps.wav"));
                            Clip clip = AudioSystem.getClip();
                            clip.open(audio);
                            clip.start();
                            sound1Playing = true;

                            LineListener listener1 = new LineListener() {
                                public void update(LineEvent event) {
                                    if (event.getType() == LineEvent.Type.STOP) {
                                        sound1Playing = false;
                                        return;
                                    }

                                }
                            };
                            clip.addLineListener(listener1);
                            sounds.add("58491__juskiddink__guitar-string-snaps.wav");
                        }
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                /////SOUND2
                else if (message_args[0].toString().equals("2.0")) {
                    System.out.println(message_args[0]);
                    try {
                        if (sound1Playing != true && sound2Playing != true) {
                            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("181425__serylis__guitar-chord.wav"));
                            Clip clip = AudioSystem.getClip();
                            clip.open(audio);
                            clip.start();
                            sound2Playing = true;

                            LineListener listener1 = new LineListener() {
                                public void update(LineEvent event) {
                                    if (event.getType() == LineEvent.Type.STOP) {
                                        sound2Playing = false;
                                        return;
                                    }

                                }
                            };
                            clip.addLineListener(listener1);
                            sounds.add("181425__serylis__guitar-chord.wav");
                        }
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }
                /////SOUND2END

                /////SOUND3
                else if (message_args[0].toString().equals("3.0")) {
                    System.out.println(message_args[0]);
                    try {
                        if (sound1Playing != true && sound2Playing != true && sound3Playing != true ) {
                            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("29699__herbertboland__pianomood11.wav"));
                            Clip clip = AudioSystem.getClip();
                            clip.open(audio);
                            clip.start();
                            sound3Playing = true;

                            LineListener listener1 = new LineListener() {
                                public void update(LineEvent event) {
                                    if (event.getType() == LineEvent.Type.STOP) {
                                        sound3Playing = false;
                                        return;
                                    }

                                }
                            };
                            clip.addLineListener(listener1);
                            sounds.add("29699__herbertboland__pianomood11.wav");
                        }
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }
                ////SOUND3END

                /////SOUND4
                else if (message_args[0].toString().equals("4.0")) {
                    System.out.println(message_args[0]);
                    try {
                        if (sound1Playing != true && sound2Playing != true && sound3Playing != true && sound4Playing != true ) {
                            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("397016__jedo__drum-rolls1.wav"));
                            Clip clip = AudioSystem.getClip();
                            clip.open(audio);
                            clip.start();
                            sound4Playing = true;

                            LineListener listener1 = new LineListener() {
                                public void update(LineEvent event) {
                                    if (event.getType() == LineEvent.Type.STOP) {
                                        sound4Playing = false;
                                        return;
                                    }

                                }
                            };
                            clip.addLineListener(listener1);
                            sounds.add("397016__jedo__drum-rolls1.wav");
                        }
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }
                ////SOUND4END

                /////SOUND5
                else if (message_args[0].toString().equals("5.0")) {
                    System.out.println(message_args[0]);
                    try {
                        if (sound1Playing != true && sound2Playing != true && sound3Playing != true && sound4Playing != true && sound5Playing != true) {
                            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("410516__inspectorj__snare-drum-multi-hits-a-h1.wav"));
                            Clip clip = AudioSystem.getClip();
                            clip.open(audio);
                            clip.start();
                            sound5Playing = true;

                            LineListener listener1 = new LineListener() {
                                public void update(LineEvent event) {
                                    if (event.getType() == LineEvent.Type.STOP) {
                                        sound5Playing = false;
                                        return;
                                    }

                                }
                            };
                            clip.addLineListener(listener1);
                            sounds.add("410516__inspectorj__snare-drum-multi-hits-a-h1.wav");
                        }
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }
                ////SOUND5END

                /////SOUND6
                else if (message_args[0].toString().equals("6.0")) {
                    System.out.println(message_args[0]);
                    try {
                        if (sound1Playing != true && sound2Playing != true && sound3Playing != true && sound4Playing != true && sound5Playing != true && sound6Playing != true) {
                            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("395152__gunnbladez__live-la-strings-006.wav"));
                            Clip clip = AudioSystem.getClip();
                            clip.open(audio);
                            clip.start();
                            sound6Playing = true;

                            LineListener listener1 = new LineListener() {
                                public void update(LineEvent event) {
                                    if (event.getType() == LineEvent.Type.STOP) {
                                        sound6Playing = false;
                                        return;
                                    }

                                }
                            };
                            clip.addLineListener(listener1);
                            sounds.add("395152__gunnbladez__live-la-strings-006.wav");
                        }
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }
                ////SOUND6END
            }
        };


        receiver.addListener("/wek/outputs", listener);
        receiver.startListening();

        /////////
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

        String[] choices = {"SOUND 1", "SOUND 2", "SOUND 3", "SOUND 4", "SOUND 5", "SOUND 6"};

        final JComboBox<String> cb = new JComboBox<String>(choices);

        cb.setVisible(true);
        jp.add(cb);

        cb.addActionListener(new ActionListener() {
//////////////////

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
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("58491__juskiddink__guitar-string-snaps.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                        sounds.add("58491__juskiddink__guitar-string-snaps.wav");
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 2
                if (SOUND2.equals("SOUND 2")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("181425__serylis__guitar-chord.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                        sounds.add("181425__serylis__guitar-chord.wav");
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 3
                if (SOUND3.equals("SOUND 3")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("29699__herbertboland__pianomood11.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                        sounds.add("29699__herbertboland__pianomood11.wav");
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 4
                if (SOUND4.equals("SOUND 4")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("395152__gunnbladez__live-la-strings-006.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                        sounds.add("395152__gunnbladez__live-la-strings-006.wav");
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 5
                if (SOUND5.equals("SOUND 5")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("e00006cc.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                        sounds.add("e00006cc.wav");
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }

                //Sound 6
                if (SOUND6.equals("SOUND 6")) {
                    try {
                        AudioInputStream audio = AudioSystem.getAudioInputStream(new File("e0000296.wav"));
                        Clip clip = AudioSystem.getClip();
                        clip.open(audio);
                        clip.start();
                        sounds.add("e0000296.wav");
                    } catch (UnsupportedAudioFileException uae) {
                        System.out.println(uae);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    } catch (LineUnavailableException lua) {
                        System.out.println(lua);
                    }
                }
            }


        });
/////////////////////

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setCurrentDirectory(new File("~/"));
                int result = jFileChooser.showSaveDialog(new JFrame());

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jFileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                    try {
                        concatenateFiles(sounds, selectedFile.getAbsolutePath());
                        file = selectedFile.getAbsolutePath();
                    } catch (NullPointerException n){
                        System.out.println("Recording had been deleted");
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }

                }


            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sounds = null;
                JOptionPane.showMessageDialog(jp, "Recording Deleted");
            }
        });

        listen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    AudioInputStream audio = AudioSystem.getAudioInputStream(new File(file));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audio);
                    clip.start();
                } catch (UnsupportedAudioFileException uae) {
                    System.out.println(uae);
                } catch (IOException ioe) {
                    System.out.println(ioe);
                } catch (LineUnavailableException lua) {
                    System.out.println(lua);
                } catch (NullPointerException npe) {
                    System.out.println("Recording Deleted");
                }
            }

        });

    }

    public Boolean concatenateFiles(ArrayList<String> sourceFilesList, String destinationFileName) throws Exception {
        Boolean result = false;

        AudioInputStream audioInputStream = null;
        List<AudioInputStream> audioInputStreamList = null;
        AudioFormat audioFormat = null;
        Long frameLength = null;

        try {
            // loop through our files first and load them up
            for (String sourceFile : sourceFilesList) {
                audioInputStream = AudioSystem.getAudioInputStream(new File(sourceFile));

                // get the format of first file
                if (audioFormat == null) {
                    audioFormat = audioInputStream.getFormat();
                }

                // add it to our stream list
                if (audioInputStreamList == null) {
                    audioInputStreamList = new ArrayList<AudioInputStream>();
                }
                audioInputStreamList.add(audioInputStream);

                // keep calculating frame length
                if (frameLength == null) {
                    frameLength = audioInputStream.getFrameLength();
                } else {
                    frameLength += audioInputStream.getFrameLength();
                }
            }

            // now write our concatenated file
            AudioSystem.write(new AudioInputStream(new SequenceInputStream(Collections.enumeration(audioInputStreamList)), audioFormat, frameLength), AudioFileFormat.Type.WAVE, new File(destinationFileName));

            // if all is good, return true
            result = true;
        } finally {
            if (audioInputStream != null) {
                audioInputStream.close();
            }
            if (audioInputStreamList != null) {
                audioInputStreamList = null;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        WekiGUI gui = new WekiGUI();

        /*
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


    */
    }
}
