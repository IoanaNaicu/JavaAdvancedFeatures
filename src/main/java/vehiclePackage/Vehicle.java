package vehiclePackage;

public class Vehicle {
    protected int maxSpeed;
    protected int currentSpeed;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static void printMaxSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getMaxSpeed());
    }

    public void increaseSpeed(){
        currentSpeed++;
        if(currentSpeed > maxSpeed){
            throw new VehicleCrashedExeption();
        }
    }

    public class VehicleCrashedExeption extends RuntimeException{
        public VehicleCrashedExeption(){

        }

        public VehicleCrashedExeption(String mesaj){
            super(mesaj);
        }

    }

}
