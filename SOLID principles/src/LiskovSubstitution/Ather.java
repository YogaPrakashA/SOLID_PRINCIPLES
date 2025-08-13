package LiskovSubstitution;

public class Ather implements TwoWheeler {
    @Override
    public String maxSpeed() {
        return "Ather Max speed : 70 Kmph";
    }

    @Override
    public String petrolLevel() {
        throw new UnsupportedOperationException("This is electric bike, we can't get petrol level...");
    }
}
