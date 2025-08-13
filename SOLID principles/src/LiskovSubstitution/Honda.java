package LiskovSubstitution;

public class Honda implements TwoWheeler {
    @Override
    public String maxSpeed() {
        return "Honda Max Speed : 120 Kmph";
    }

    @Override
    public String petrolLevel() {
        return "Honda petrolLevel : 2 liters";
    }
}
