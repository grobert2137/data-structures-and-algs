## Lab 3
### Fibnacci Sequence
##### Itertive Approch
- General Equation: `F(n) = F(n-1) + F(n-2)`
    - Base case for Fibonacci Sequence is `F(0) = 0` and `F(1) = 1`

##### Issues
- INT as an input meants the value will max out at 2,147,483,647. Which causes errors at higher numbers like 50 80 and 200.

### Maximum Digit

Recursive is something like this
``` 
            F(823)
                |
            |      |
            82      3
        |       |
        8       2
```

Therefore, base case is when the digit is singular aka (N < 10)

Then working you way back up, the method shoudl compare the new remainder with the old remainder 

### Histogram
#### Constructor
- Should look like this `public Histogram(int lowerbound, int upperbound)`

**Questions**
- How does the toString method get called automatically? Does Java compiler look for toString if a class is not in string type and is put into a `print()` statement?
- Why do we return true and false for the `add()` method?

### HistogramApp
