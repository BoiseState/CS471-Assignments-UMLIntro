package geese;

import java.util.ArrayList;
import java.util.Iterator;

public class Gaggle {

    private final ArrayList<Goose> geese;

    public Gaggle() {
        geese = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            geese.add(new Goose());
        }
    }

    public void makeSounds() {
        Iterator<Goose> iterator = geese.iterator();
        while (iterator.hasNext()) {
            Goose goose = iterator.next();
            goose.honk();
        }
    }
}
