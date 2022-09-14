package Server;
public class Methods {
    public String imc(String name, double height, double weight){
        double imc = (weight / (height + height));
        return "Hola " + name + "tu IMC es de " + imc;
    }
}
