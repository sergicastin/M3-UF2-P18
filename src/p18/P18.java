package p18;

import java.util.Arrays;
import java.util.Scanner;

public class P18 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int option = -1;

        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    int[] arrayNumbers = new int[]{7, 12, 13, 16, 18};
                    viewArrayInt(arrayNumbers);
                    break;
                case 2:
                    int[] arrayIva;
                    arrayIva = new int[]{0, 4, 10, 21};
                    viewArrayInt(arrayIva);
                    break;
                case 3:
                    int[] arrayIva2 = new int[4];
                    arrayIva2[0] = 0;
                    arrayIva2[1] = 4;
                    arrayIva2[2] = 10;
                    arrayIva2[3] = 21;
                    viewArrayInt(arrayIva2);
                    
                    break;                    
                case 4:
                    int count = 1;
                    System.out.print("Products?: ");
                    int elements = keyboard.nextInt();
                    int[] arrayPrice = new int[elements];
                    for (int i = 0; i < elements; i++) {
                        System.out.print("Price of product " + count + " ?: ");
                        arrayPrice[i] = keyboard.nextInt();
                        count++;
                    }
                    viewArrayInt(arrayPrice);
                    break;
                case 5:
                    String[] arrayName;
                    float[] arrayHeight;
                    int Nmax;
                    System.out.print("How many students?: ");
                    Nmax = keyboard.nextInt();
                    arrayName = new String[Nmax];
                    arrayHeight = new float[Nmax];
                    for (int i = 0; i < arrayName.length; i++) {
                        System.out.println("Name[ " + i + " ]:");
                        arrayName[i] = keyboard.next();
                        System.out.println("Height?");
                        arrayHeight[i] = (float) keyboard.nextDouble();
                    }
                    viewStudent(arrayName, arrayHeight);
                    break;
                case 6:
                    String[] arrayNames;
                    float[] arrayHeight2;
                    int Nmax2;
                    System.out.print("How many students?: ");
                    Nmax2 = keyboard.nextInt();
                    arrayNames = new String[Nmax2];
                    arrayHeight2 = new float[Nmax2];
                    for (int i = 0; i < arrayNames.length; i++) {
                        System.out.println("Name[ " + i + " ]:");
                        arrayNames[i] = keyboard.next();
                        System.out.println("Height?");
                        arrayHeight2[i] = (float) keyboard.nextDouble();
                    }
                    Float maxValue = arrayHeight2[0];
                    for (int i = 0; i < arrayNames.length; i++) {

                        if (arrayHeight2[i] > maxValue) {
                            maxValue = arrayHeight2[i];
                        }
                    }
                    System.out.println("Max Value:" + maxValue);

                    Float minValue = arrayHeight2[0];

                    for (int i = 0; i < arrayNames.length; i++) {

                        if (arrayHeight2[i] < minValue) {
                            minValue = arrayHeight2[i];
                        }
                    }
                    System.out.println("Min Value:" + minValue);

                    Float medValue = arrayHeight2[0];
                    for (int i = 0; i < arrayNames.length; i++) {                       
                            medValue += arrayHeight2[i];                        
                    }
                    medValue = medValue / arrayNames.length;
                    System.out.println("The average is: " + medValue);
                    
                    //String aveStudents = arrayNames;
                    for (int i = 0; i < arrayNames.length; i++) {
                        if (arrayHeight2[0]< medValue);
                       // aveStudents=arrayNames[i];
                        //System.out.println("This guy exceeds the average: "+aveStudents);
                    }
                    viewStudent(arrayNames, arrayHeight2);
                    break;

                case 7:
                    String[] arrayDays = new String[]{"Not Valid", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                    System.out.println("Tell me one day: ");
                    int day = keyboard.nextInt();
                    System.out.println(arrayDays[day]);
                    break;

                case 8:
                    System.out.print("DNI?: ");
                    int dni = keyboard.nextInt();
                    char letter = functionDNI1(dni);
                    System.out.println(dni + " " + letter);

                    break;
                case 9:
                    
                    break;
                case 10:
                    System.out.println("Quieres salir? Y/N");
                    String res = keyboard.next();
                    if (res.equals("Y")) {
                        System.out.println("Asta la procsimaa");
                    } else {
                        option = 90;
                        System.out.println("Continue: ");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//fin switch
        } while (option != 10);
    }


    private static void p0() {
        System.out.println("");
        System.out.println("gracias ......     adeu");
    }

    private static void userMenu() {
        System.out.println();
        System.out.println("Opción 1- (--)");
        System.out.println("Opción 2- (--)");
        System.out.println("Opción 3-(--)");
        System.out.println("Opción 4-(--)");
        System.out.println("Opción 5- (--)");
        System.out.println("Opción 6- (--):");
        System.out.println("Opción 7- (--):");
        System.out.println("Opción 8- (--)):");
        System.out.println("Opción 9- (--):");
        System.out.println("Opción 10- (--):");
        System.out.print("\nOpcion ?: ");
    }

    private static void viewArrayInt(int[] arrayNumbers) {

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i]);
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }

    private static void viewStudent(String[] arrayName, float[] arrayHeight) {
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
            System.out.println(arrayHeight[i]);
        }
    }

    private static char functionDNI1(int dni) {
        char letter = ' ';
        String stringDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int r = dni % 23;
        letter = stringDNI.charAt(r);
        return letter;
    }
}
