package utils;

public class CockroachNames {

    public static final String[] NAMES = {
            "Dash",
            "Skitter",
            "Scramble",
            "Whisk",
            "Rattle",
            "Nibbles",
            "Turbo",
            "Flick",
            "Rustle",
            "Speedy",
            "Creep",
            "Wiggles",
            "Slick",
            "Scurry",
            "Zippy",
            "Jitter",
            "Snap",
            "Whisker",
            "Swoosh",
            "Buzzer"
    };

    public static String generateName() {
        int index = (int) (Math.random() * NAMES.length);
        return NAMES[index];
    }
}
