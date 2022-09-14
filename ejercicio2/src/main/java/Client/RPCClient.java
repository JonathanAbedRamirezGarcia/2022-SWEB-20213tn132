//Jonathan Abed Ramirez Garcia-4B
package Client;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class RPCClient {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
            throws MalformedURLException, XmlRpcException{
            XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
            config.setServerURL(new URL("http://localhost:1200"));
            XmlRpcClient client = new XmlRpcClient();
            client.setConfig(config);
            System.out.println ("Ingresa el primer numero");
            double num1 = sc.nextDouble();
            System.out.println("Ingresa el segundo numero");
            double num2 = sc.nextDouble();
            System.out.println("Ingresa el tercer numero");
            double num3 = sc.nextDouble();
            System.out.println("Ingresa el cuarto numero");
            double num4 = sc.nextDouble();
            Object[] data = {num1,num2,num3,num4};
            String response = (String) client.execute("Methods.calcula",data);
            System.out.println(response);
    }
}
