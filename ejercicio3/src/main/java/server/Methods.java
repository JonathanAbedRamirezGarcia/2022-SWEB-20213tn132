package server;
import java.io.IOException;
public class Methods {
    public String sum(int lowerLimit, int upperLimit) {
        int sum = 0;
        if (lowerLimit > upperLimit) {
            return "Error, el límite inferior es mayor al límite superior.";
        }
        for (int i=lowerLimit; i<=upperLimit; i++) sum+=i;
        return "La suma de los numeros entre "+lowerLimit+" y "+upperLimit+ " es: "+sum;
    }
}
