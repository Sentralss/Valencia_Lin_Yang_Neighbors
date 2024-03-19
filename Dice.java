public class Dice {
    private int numSides;

    /**
     * Constructs a dice object with numSides
     * @param numSides
     */
    public Dice(int numSides) {
        this.numSides = numSides;
    }

    /**
     * Rolls the dice and returns an int within' the range of possibilities
     * @return A random int between 1 and numSides
     */
    public int roll() {
        return (int) (Math.random() * (numSides)) + 1;
    }
}
