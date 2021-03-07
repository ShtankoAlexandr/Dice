package generators.random;

import java.util.Random;

public class Numbers {
    public static int getIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(++max - min) + min;
    }



}
