public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    public static long clearBits(long value, long mask) {
        return (long) value & ~mask;

    }
}