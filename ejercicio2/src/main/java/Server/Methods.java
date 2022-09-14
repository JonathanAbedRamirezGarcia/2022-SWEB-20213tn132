package Server;
public class Methods {
    public String calcula(double num1, double num2, double num3,double num4){
        double suma = (num1 + num2 + num3 + num4);
        double producto = (num1 * num2 * num3 * num4);
        double promedio = (((num1 + num2 + num3 + num4))/4);
        return "La suma es: " + suma
                + "\nEl prodcuto es: " + producto
                + "El promedio es: " + promedio;
    }
    public String producto(double num1, double num2, double num3,double num4){
        double producto = (num1 * num2 * num3 * num4);
        return "El producto es: " + producto;
    }
    public String promedio(double num1, double num2, double num3,double num4){
        double promedio = (4/(num1 + num2 + num3 + num4));
        return "El promedio es: " + promedio;
    }
}
