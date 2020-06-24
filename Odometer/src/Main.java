/*Ioanna Zournatzi*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Odometro test = new Odometro();
        //Odometro odometroxlm = new Odometro();
        double xiliometra;
        double xlm = 0;
        int hour = 0;
        double gas = 0;
        Scanner userin = new Scanner(System.in);

        Odometro trip = new Odometro(); //dimiourgoume ena neo antikeimeno
//Parakatw tupwnoume erwtiseis pros ton xristi, kai tou dinoume tin dunatotita na 
//tis apantisei, etsi wste na upologistoun ta zitoumena tis askisis.
//
        System.out.println("Enter the number of the km before the trip.");
        xiliometra = userin.nextDouble();
        trip.Odometro(xiliometra, xlm);

        System.out.println("How many kms did you drive?");
        xlm = userin.nextDouble();
        trip.setxlm(xlm);

        System.out.println("How long did you drive? (hours) ");
        hour = userin.nextInt();
        System.out.println("How many liters of gas did you put in?");
        gas = userin.nextDouble();
        trip.setgas(gas);
        trip.sethour(hour);

        trip.calcKatanalosi();

        System.out.println("mileage is: " + trip.calcKatanalosi());

        trip.Odometro(xiliometra, xlm);

        System.out.println("Reset odometer: " + trip.ResetOdometro());

        System.out.println("Since the last reset of the odometer how many litres of gas did you pump?");
        gas = userin.nextDouble();
        trip.setgas(gas);

    }

}

