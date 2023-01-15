package motorbike;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(-5);
        MotorBike honda = new MotorBike(100);
        ducati.start();
        honda.start();

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.setSpeed(100);
        honda.setSpeed(-80);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        int ducatiSpeed = ducati.getSpeed();
        ducatiSpeed += 100;
        ducati.setSpeed(ducatiSpeed);

        int hondaSpeed = honda.getSpeed();
        hondaSpeed += 100;
        honda.setSpeed(hondaSpeed);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.changeSpeed(100);
        honda.changeSpeed(200);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        MotorBike yamaha = new MotorBike();
        yamaha.start();
        System.out.println(yamaha.getSpeed());
    }
}
