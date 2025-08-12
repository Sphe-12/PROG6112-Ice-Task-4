import java.util.Scanner;

abstract class Fine {
    protected String citizenName;
    protected double speed;
    protected double finePayable;

    public Fine(String citizenName, double speed) {
        this.citizenName = citizenName;
        this.speed = speed;
        this.finePayable = 0;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFinePayable() {
        return finePayable;
    }

    public abstract void calculateFine();
}

class SpeedingFine extends Fine {
    public SpeedingFine(String citizenName, double speed) {
        super(citizenName, speed);
    }

    @Override
    public void calculateFine() {
        if (speed >= 120) {
            finePayable = speed * 10.20;
        } else {
            finePayable = 0;
        }
    }
}

public class FineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the person name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the speed: ");
        Double speed = scanner.nextDouble();

        SpeedingFine fine = new SpeedingFine(name, speed);
        fine.calculateFine();

        System.out.println("Person: " + fine.getCitizenName());
        System.out.println("Speed: " + fine.getSpeed() + "km");
        if (fine.getFinePayable() > 0) {
            System.out.printf("Fine Payable: R%.2f\n", fine.getFinePayable());
        } else {
            System.out.println("No fine payable.");
        }
    }
}