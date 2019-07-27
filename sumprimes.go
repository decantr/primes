package main

import (
	"fmt"
	"os"
	"strconv"
)

func main() {
	input := os.Args[1]
	sum, target := 0, 0

	if i, e := strconv.Atoi(input); e == nil {
		target = i
	}

	fmt.Printf("sum: %d, taget %d\n", sum, target )

	var notPrime = make ( []bool, target )

	for i := 2; i < target/2; i++ {
		if !notPrime[i] {
			for j := i *2; j < target; j += i {
				notPrime[j] = true
			}
		}
	}

	for k := 2; k < target; k++ {
		if ! notPrime[k] {
			sum += k
		}
	}

	fmt.Printf("Sum of primes %d is %d\n", target, sum)
}
