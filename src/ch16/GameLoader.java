package ch16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GameLoader {
    public static void main(String[] args) {
        GameCharacter one;
        GameCharacter two;
        GameCharacter three;
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));

            one = (GameCharacter) is.readObject();
            three = (GameCharacter) is.readObject();
            two = (GameCharacter) is.readObject();

            System.out.println(one.getPower());
            System.out.println(two.getType());
            System.out.println(three.getWeapons());

            is.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException cnfex){
            cnfex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
