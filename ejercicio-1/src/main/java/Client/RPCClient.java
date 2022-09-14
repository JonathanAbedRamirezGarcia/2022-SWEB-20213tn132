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
            throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.println("Ingrese su nombre");
        String name = sc.next();
        System.out.println("Ingrese su altura");
        double height = sc.nextDouble();
        System.out.println("Ingrese su peso");
        double weight = sc.nextDouble();
        Object[] data = {name,height,weight};
        String response = (String) client.execute("Methods.imc",data);
        System.out.println(response);

    }
}
