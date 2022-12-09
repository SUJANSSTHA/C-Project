// create a class MyCalculatro which consists of a single method long power(int, int). This takes two integers n and p as parameters and finds n*p.
// 1 if n or p is negative, throw an exception n or p should not be negative
// 2 if n or p is sero throw an exception n or p should not be zero




public class MyCalculator {

    public static long power(int n, int p) {
    
    long result = 1;
    
    for (int i = 0; i < p; i++) {
    
    result = result * n;
    
    }
    
    return result;
    
    }
    
    public static void main(String[] args) {
    
    System.out.println(MyCalculator.power(2, 4));
    
    }
    
    }