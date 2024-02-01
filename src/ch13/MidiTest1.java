package ch13;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MidiTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer.");
        } catch (MidiUnavailableException e) {
            System.out.println("Bummer");
        }
    }
}
