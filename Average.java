/*Creare un programma che calcoli 
la media dei numeri interi (pari e dispari)
la media dei numeri pari 
la media dei numeri dispari
*/

public class Average {
    public static void main(String[] args){

        int[] numbers = {1,2,3,5,8,13,21,34,55,89};

        int intSum = 0;
        int evenSum = 0;
        int oddSum = 0;

        int evenCount = 0;
        int oddCount = 0;
        
        
        //Calcolo media dei numeri interi
        double intAvg = 0;
        for (int i = 0; i < numbers.length; i++){
            intSum += numbers[i];
        }
        intAvg = intSum / numbers.length;
        System.out.println("La media dei numeri interi è: " + intAvg);


        //Calcolo media dei numeri interi pari e media dei numeri dispari

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evenSum += numbers[i];
                evenCount++;

            } else {
                oddSum += numbers[i];
                oddCount++;
            }
        }

        double evenAvg = evenSum / evenCount;
        double oddAvg = oddSum / oddCount;

        System.out.println("La media dei numeri pari è: " + evenAvg);
        System.out.println("La media dei numeri dispari è: " + oddAvg);

    }
}
