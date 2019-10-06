package vehiclePackage;

public class Car extends Vehicle{
    private boolean isConvertible = false;
    private double maxSpeed;


    public Car(int maxSpeed, boolean isConvertible){
        super(maxSpeed);
        this.isConvertible = isConvertible;
    }

    public Car(int maxSpeed){
//        super(maxSpeed);
        this(maxSpeed, false); //apeleaza constructorul de mai sus cu maxSpeed si false
        this.getMaxSpeed();
    }

    public boolean isConvertible() {
        return isConvertible;

    }


}
