package ejercicios;

public class fibo_inte {
    public static int fibo_iter(int n){
        int[] fibo=new int[n] ;
        fibo[0]=0; fibo[1]=1;
        for(int i=2;i<n;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];

           


        }
        return fibo[n-1];
       
    }
    public static void main(String[] args) {
        int n=10;
        int resultado=  fibo_iter(n);
        System.out.println("la serie de fibonacci " + n +  " es: " + resultado);
    }

    
}
