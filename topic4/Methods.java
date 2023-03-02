package topic4;

public class Methods {

    public static int sum(int num1, int num2) {
        int suma1 = 0;
        if (num2 < num1) {
            System.out.println(" Numerele sunt introduse in ordine gresita ");
            return 0;
        } else if (num1 == num2) {
            System.out.println("Suma va fi  " + num1);
            return num1;
        } else {
            for (int i = num1; i <= num2; i++) {
                suma1 += i;
            }

            System.out.println("Suma tuturor numerelor de la " + num1 + " pina la " + num2 + " va fi " + suma1);
            return suma1;
        }

    }

    public static void sum(int num3) {
        if (num3 > 0) {
            int suma2 = 0;
            int x = 0;
            while (x <= num3) {
                suma2 += x;
                x++;
            }
            System.out.println("Suma numerelor de la 0 la " + num3 + " este egala cu " + suma2);

        }

    }
}
