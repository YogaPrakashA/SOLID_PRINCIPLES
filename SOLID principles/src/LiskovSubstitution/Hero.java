package LiskovSubstitution;

public class Hero implements TwoWheeler {
    @Override
    public String maxSpeed() {
        return "Hero Max Speed : 100 Kmph";
    }

    @Override
    public String petrolLevel() {
        return "Hero petrol level : 7 liters";
    }
}
