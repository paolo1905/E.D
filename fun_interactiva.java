public class fun_interactiva {
    static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;


    }
    
    public static void main(String[] args) {
        int n=15;
        int resultado=fact(n);
        System.out.println("el factorial de  " + n + "  es: " + resultado);
        
    }
}

