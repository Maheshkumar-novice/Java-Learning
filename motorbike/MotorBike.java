package motorbike;

public class MotorBike {
    private int speed;

    MotorBike() {
        this(100);
    }

    MotorBike(int speed) {
        setSpeed(speed);
    }

    void start() {
        System.out.println("Bike started!");
    }

    void setSpeed(int speed) {
        if (speed < 0) {
            return;
        }
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

    public void changeSpeed(int howMuch) {
        setSpeed(speed + howMuch);
    }
}
