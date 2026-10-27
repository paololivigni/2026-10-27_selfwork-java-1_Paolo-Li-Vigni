//Creare un programma che stampi l'elemento maggiore in un array

public class MaxValue {
    public static void main(String[] args){

        int[] numbers = {1,2,3,5,8,13,21,34,55,89};

        int maxValue = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }

        System.out.println("Max value: " + maxValue);
        
    }
}
