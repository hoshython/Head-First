package ch14;

import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;

public class MiniMusicPlayer1 {
    public static void main(String[] args) {
        MiniMusicPlayer1 gui = new MiniMusicPlayer1();
        gui.go();
    }
    public void go(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 10; i < 120; i++){
                track.add(MusicEvent.makeEvent(NOTE_ON, 1, i, 100, i));
                track.add(MusicEvent.makeEvent(NOTE_OFF, 1, i, 100, i + 2));
            }
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static class MusicEvent{
        public static MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick){
            MidiEvent event = null;
            try {
                ShortMessage msg = new ShortMessage();
                msg.setMessage(cmd, chnl, one, two);
                event = new MidiEvent(msg, tick);
            } catch (Exception e){
                e.printStackTrace();
            }
            return event;
        }
    }
}
