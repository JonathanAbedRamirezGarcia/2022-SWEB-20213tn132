package Server;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Methods {
    public String array (int num1,int num2,int num3, int num4, int num5) {
        int num[] = {num1,num2,num3,num4,num5};
        Arrays.sort(num);
        int i;
        for (i = num.length - 1; i >= 0; i--) {
            System.out.println("Numeros acomodos en forma ascendente" + num[i]);
        }
        return Arrays.toString(num);
    }
}

