package ch14;

import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MiniMusicPlayer3 {
    private DrawPanel panel;
    private Random random = new Random();
    public static void main(String[] args) {
        MiniMusicPlayer3 gui = new MiniMusicPlayer3();
        gui.run();
    }
    private void run(){
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            sequencer.addControllerEventListener(panel, new int[] {127});
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            int note;
            for (int i = 0; i < 60; i += 4){
                note = random.nextInt(77) + 50;
                track.add(MiniMusicPlayer1.MusicEvent.makeEvent(NOTE_ON, 1, note, 100, i));
                track.add(MiniMusicPlayer1.MusicEvent.makeEvent(CONTROL_CHANGE, 1, 127, 0, i));
                track.add(MiniMusicPlayer1.MusicEvent.makeEvent(NOTE_OFF, 1, note, 100, i + 2));
            }
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(60);
            sequencer.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void setUpGui(){
        JFrame frame = new JFrame();
        frame.setTitle("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new DrawPanel();
        frame.getContentPane().add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    class DrawPanel extends JPanel implements ControllerEventListener{
        private boolean msg = false;
        @Override
        public void paintComponent(Graphics g){
            if (msg){
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);

                g.setColor(new Color(red, green, blue));

                int height = random.nextInt(450);
                int width = random.nextInt(450);;

                int xPos = random.nextInt(40) + 10;
                int yPos = random.nextInt(40) + 10;

                g.fillRect(xPos, yPos, width, height);
                msg= false;
            }
        }

        @Override
        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
            Toolkit.getDefaultToolkit().sync();
        }
    }
}
