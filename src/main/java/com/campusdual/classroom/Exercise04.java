package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        int i = 1;
        int initial_number = 1;
        int multi = 1;
        int total = 0;
        sumNum(i);
        sumEvenNum(initial_number);
        factorial(total);
        recursiveFactorial(multi);

    }

   public static int sumNum(int num) {
       int f = 5;
       int suma = 0;
       for (int i = 1; i <= f; i ++) {
           suma = suma + i;
       }
       System.out.println("Suma de los primeros " + f + " números = " + suma);
       return suma;
   }



    public static int sumEvenNum(int num) {
        int initial_number = 1;
        int contador_pares = 0;
        int numero_pares = 20;
        int suma = 0;

        do {
            if (initial_number % 2 == 0){
                suma += initial_number;
                contador_pares ++;

            }
            initial_number ++;
        } while (contador_pares < numero_pares);
        System.out.println("Suma de los primeros " + numero_pares + " números pares: " + suma);
        return suma;
    }

    public static int factorial(int num) {
        int total = 1;
        for (int i = 1; i <= 7; i++){
            total = total * i;
        }
        System.out.println("Obtén el factorial del número 7 → (7!): " + total);
        return total;
    }

    public static int recursiveFactorial(int num) {
        int multi = 1;
        for (int i = 1; i <= 7 ; i++){
                multi = multi * i;
        }
        System.out.println("Obtén el factorial del número 7 de manera recursive: " + multi);
        return multi;
    }
}
