package session3;

public class SumArray {
    public static void main(String[] args) {

        // input -> array
        // output -> sum of all elements of the array

        int [] numbers = {10,20,30};

        int sum =0 ;

        for (int i=0; i<numbers.length ; i++){

            sum = sum + numbers[i];
        }
        System.out.println(sum);

    }
}
