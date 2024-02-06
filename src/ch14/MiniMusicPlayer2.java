package ch14;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import static javax.sound.midi.ShortMessage.*;

public class MiniMusicPlayer2 {
    public static void main(String[] args) {
        MiniMusicPlayer2 gui = new MiniMusicPlayer2();
        gui.run();
    }
    private void run(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(event -> System.out.println("la"), eventsIWant);

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 75; i < 120; i += 4){
                track.add(MiniMusicPlayer1.MusicEvent.makeEvent(NOTE_ON, 1, i, 100, i));
                track.add(MiniMusicPlayer1.MusicEvent.makeEvent(CONTROL_CHANGE, 1, 127, 0, i));
                track.add(MiniMusicPlayer1.MusicEvent.makeEvent(NOTE_OFF, 1, i, 100, i + 2));
            }
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
