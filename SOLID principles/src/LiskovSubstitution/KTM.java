package LiskovSubstitution;

public class KTM extends TwoWheelers implements PetrolTwowheelers {
    @Override
    public String maxSpeed() {
        return "KTM Bike maximum speed : 170 kmph";
    }

    @Override
    public String petrolLevel() {
        return "KTM Petrol Level : 11 liters";
    }
}
