import java.util.Scanner;

public class suhu1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Celcius: ");
        double x = input.nextDouble();

        System.out.println("Pilih Opsi: ");
        System.out.println("1.Farenheit: ");
        System.out.println("2.Reamur: ");
        System.out.println("3.Kelvin: ");

        int opsi = input.nextInt();
        if (opsi == 1){
            double F = (c * 9/5) + 32;
            System.out.println(x + "Adalah " + F);
        }
        
        else if (opsi == 2){
            double R = (x * 4/5);
            System.out.println(x + "Adalah" +R);
        }

        else if (opsi == 3){
            double K = (x + 273);
            System.out.println(x + "Adalah" + K);
        }

        else{
            System.out.println("Opsi tidak valid");
        }
    }
    }
}
