package main.fibonacci;

public class Fibonnaci {

    public static int fibonacci(int n) {

        if(n <= 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
