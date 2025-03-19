public class fun_recursiva {
    static int fact_rec(int n ){
        

        return (n==0)?1:n*fact_rec(n-1);

    }
    public static void main(String[] args) {
        int n=3;
        int resultado=fact_rec(n);
        System.out.println("el factorial de  " + n + "  es: " + resultado);
        
    }
    
}
