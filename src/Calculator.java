import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        boolean flag = true;
        Scanner sacanner = new Scanner(System.in);
        int a;
        int b;
        int option;

        while (flag){
            System.out.println("1- Sumar \n 2- Restar \n 3- Multiplicar \n 4- Dividir \n");
            option = Integer.parseInt(sacanner.next());


            switch (option){
                case 1:
                    System.out.println("Deme el valor A: \n");
                    a = Integer.parseInt(sacanner.next());
                    System.out.println("Deme el valor B: \n");
                    b = Integer.parseInt(sacanner.next());
                    System.out.println(suma(a,b));
                    break;

                case 2:
                    System.out.println("Deme el valor A: \n");
                    a = Integer.parseInt(sacanner.next());
                    System.out.println("Deme el valor B: \n");
                    b = Integer.parseInt(sacanner.next());
                    System.out.println(resta(a,b));
                    break;

                case 3:
                    System.out.println("Deme el valor A: \n");
                    a = Integer.parseInt(sacanner.next());
                    System.out.println("Deme el valor B: \n");
                    b = Integer.parseInt(sacanner.next());
                    System.out.println(multiplicacion(a,b));
                    break;

                case 4:
                    System.out.println("Deme el valor A: \n");
                    a = Integer.parseInt(sacanner.next());
                    System.out.println("Deme el valor B: \n");
                    b = Integer.parseInt(sacanner.next());
                    System.out.println(division(a,b));
                    break;

                default:
                    System.out.println("Wrong Option");

            }

        }


    }

    public static int suma(int a, int b){
        return a+b;

    }

    public static int resta(int a, int b){
        return a-b;

    }
    public static int multiplicacion(int a, int b){
        return a*b;

    }
    public static float division(int a, int b){
        if (b > 0){
            return a/b;

        }
        else{
            return -1;
        }


    }
}
