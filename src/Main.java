public class Main {
    public static void main(String[] args) {
        int primesToSum = 2000000;

        long sum = 0;


        boolean[] notPrime = new boolean[primesToSum];

        for ( int i = 2 ; i < notPrime.length / 2 ; i++ )
            if ( ! notPrime[i] )
                for ( int j = i * 2 ; j < notPrime.length ; j += i )
                    notPrime[j] = true;

        for ( int i = 2 ; i < notPrime.length ; i++ )
            if ( ! notPrime[i] )
                sum += i;

        System.out.println( "sum: " + sum );
    }
}
