package corte2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        estudiantes[]est=new estudiantes[10];
        est[0]=new estudiantes(171515, "paolo", (float) 4.7);
        est[1]=new estudiantes(171515, "Steven", (float) 2.3);
        est[2]=new estudiantes(171515, "Esperanza Gomez", (float) 2.7);
        est[3]=new estudiantes(171515, "Bob Patiño", (float) 3.7);
        est[4]=new estudiantes(171515, "Paula", (float) 3.9);
        est[5]=new estudiantes(171515, "Pablo", (float) 3.5);
        est[6]=new estudiantes(171515, "Messi", (float) 4.9);
        est[7]=new estudiantes(171515, "Cristiano", (float) 4.8);
        est[8]=new estudiantes(171515, "Kaka", (float) 4.1);
        est[9]=new estudiantes(12323, "Jhonny Sins", (float) 4.2); 



        Arrays.sort(est);

        
        float determinante=(float) 4.9;
        int cant_est = busquedaBinariaIterativa(est, determinante); 

        System.out.println(cant_est);
       
    }

public static int busquedaBinariaIterativa(estudiantes[] arr, float objetivo) {
    int izquierda = 0;
    int derecha = arr.length - 1;
    //el límite izquierdo siempre debe ser menor que el límite derecho: es decir,
		//hasta donde se puede partir el espacio de búsqueda
    while (izquierda <= derecha) {
        int medio = izquierda + (derecha - izquierda) / 2;
        
        if (arr[medio].Prom_acum == objetivo) {
            return medio;
        }
        //decide si buscar por la izquierda o por la derecha, en cada iteración:
        if (arr[medio].Prom_acum < objetivo) {
            izquierda = medio + 1;
        } else {
            derecha = medio - 1;
        }
    }
    
    return -1;
}

}
