package session3;

public class GetMaxOfArray implements example {

    public static void main(String[] args) {

        // input -> array
        // output -> maximum number in array
        // [ 10,20,30]
        // 30

        int [] maxArray = {10,20,30};
                    // index 0,1,2

        int max = maxArray[0];

        for (int i=1; i<maxArray.length;i++){

            if (maxArray[i] >  max ){
                // update
                max = maxArray[i];
            }

        }
        System.out.println(max);
    }

    @Override
    public void isPrime(int number) {

    }
}

interface example {
     void isPrime(int number);

}