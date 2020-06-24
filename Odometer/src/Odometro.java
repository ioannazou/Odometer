/*Ioanna Zournatzi*/
//import java.util.*;

public class Odometro {
//Dhlwsh Metavlitwn
    private static double odometro;
    private static double xlm;
    private static double gas;
    private static int hour;
    private static double sunolika_xlm;
    private static double katanalosi;
    static double getKatanalosi;
    static double xiliometra;
//Dimiourgoume sunartiseis set/get gia na orisisoume tis metavlites tis askhseis,
    //kai argotera sti main na mporesei o xristis na prosthesei times se autes
    
    public void setxlm(double xlm) {
        this.xlm = xlm;
    }

    public double getxlm() {
        return this.xlm;
    }

    public void sethour(int hour) {
        this.hour = hour;
    }

    public int gethour() {
        return this.hour;
    }

    public void setgas(double gas) {
        this.gas = gas;
    }

    public double getgas() {
        return this.gas;
    }

    public static double Odometro(double xiliometra, double xlm)
    {
        System.out.println("Ta nea xiliometra einai: " + (xiliometra+xlm));
        //na apothikeuei tis metriseis tou odometrou.
     return odometro;
    
    }
    //sunartisi i opoia kanei reset to odometro
    public static double ResetOdometro() {
        odometro = 0;
        xlm= 0;
        gas=0;
        hour=0;
        System.out.println("Ta xlm einai pleon: " + xlm);
        System.out.println("To gas einai pleon: " + gas);
        System.out.println("H wra einai pleon: " + hour);
        return odometro;
        
    }
//sunartisi i opoia upologizei ti katanalosi tou oximatos
    
    public double calcKatanalosi() {

        katanalosi = (gas / hour);
        return katanalosi;
    }
   

}
