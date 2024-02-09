package ch16;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class GameCharacter implements Serializable {
    @Serial
    private static final long serialVersionUID = 2121254237741853875L;
    private final int power;
    private final String type;
    private final String[] weapons;

    public GameCharacter(int power, String type, String[] weapons){
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }
    public int getPower(){
        return this.power;
    }
    public String getType(){
        return this.type;
    }
    public String getWeapons(){
        return Arrays.toString(this.weapons);
    }
}
