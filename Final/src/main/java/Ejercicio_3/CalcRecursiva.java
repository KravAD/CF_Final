package Ejercicio_3;

public class CalcRecursiva {
    public static int recursive(int a, int b ) {
        if (b==0){
            return 1;
        }
        else if(a==0){
            return 0;
        }
        else {
            return a * recursive(a, b - 1);
        }
    }
}
