import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int r = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[r];
    }

    String randomShipRegistryNumber() {
        return String.format("NCC-%d", random.nextInt(999, 9999)+1);
    }

    double randomStardate() {
        return random.nextDouble(41000.0, 42000.0);
    }
}
