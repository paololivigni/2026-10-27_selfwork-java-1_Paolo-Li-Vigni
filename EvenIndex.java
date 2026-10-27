//Creare un programma che stampi solo gli elementi in posizione pari di un array

//Soluzione 1 (incrementale)

public class EvenIndex {
    public static void main(String[] args){
        
        int[] numbers = {1,2,3,5,8,13,21,34,55,89};
        
        for (int i = 0; i < numbers.length; i+=2){
            System.out.print(numbers[i] + " ");
        }
    }
}


//Soluzione 2 (if)

/*

public class EvenIndex {
    public static void main(String[] args){
        
        int[] numbers = {1,2,3,5,8,13,21,34,55,89};
        
            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 == 0) {
            System.out.print(numbers[i] + " ");
            }
        }
    }
}
    
*/