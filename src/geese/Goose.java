package geese;

public class Goose {

    private final String sound;

    public Goose() {
        double seed = Math.random();
        if (seed < 0.7) {
            sound = "honk";
        }
        else if (seed < 0.8) {
            sound = "HONK";
        }
        else if (seed < 0.9) {
            sound = "HHHOOOOONNNNK";
        }
        else {
            sound = "squawk";
        }
    }

    public void honk() {
        System.out.println(sound);
    }
}
