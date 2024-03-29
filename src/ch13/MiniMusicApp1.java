package ch13;

import javax.sound.midi.*;

import static javax.sound.midi.ShortMessage.*;

public class MiniMusicApp1 {
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            
            Track track = seq.createTrack();
            
            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON, 1, 100, 120);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);
            
            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_OFF, 1, 100, 120);
            MidiEvent noteOff = new MidiEvent(msg2, 16);
            track.add(noteOff);
            
            player.setSequence(seq);
            
            player.start();
            //            player.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
