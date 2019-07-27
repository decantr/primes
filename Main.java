public class Main {
    public static void main(String[] args) {

        long endTime,
                startTime = System.nanoTime(),
                sum = 0,
                primesToSum = 2000000;



        boolean[] notPrime = new boolean[(int) primesToSum];

        for ( int i = 2 ; i < notPrime.length / 2 ; i++ )
            if ( ! notPrime[i] )
                for ( int j = i * 2 ; j < notPrime.length ; j += i )
                    notPrime[j] = true;

        for ( int i = 2 ; i < notPrime.length ; i++ )
            if ( ! notPrime[i] )
                sum += i;

        endTime = System.nanoTime();
        System.out.println("sum: " + sum +
                "\ntime: " + (endTime - startTime));
    }
}
