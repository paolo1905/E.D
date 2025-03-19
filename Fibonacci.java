package ejercicios;

public class Fibonacci {
    static int fibo (int n){
        
        if (n==0 || n==1){
            return 1;
           

        }
        return fibo(n-1)+ fibo(n-2);
        }
        
    
    public static void main(String[] args) {
        int n=0;
        System.out.println(" la serie de Fibonacci " + n + " es: " + fibo(n));
    }
}
    

