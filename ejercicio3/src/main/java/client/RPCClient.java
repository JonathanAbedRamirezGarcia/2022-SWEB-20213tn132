package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class RPCClient {
    public static void main(String[] args) throws IOException, XmlRpcException {
        Scanner teclado = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        config.isEnabledForExtensions();
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.println("Ingrese el límite inferior:");
        int lowerLimit = teclado.nextInt();
        System.out.println("Ingrese el límite superior:");
        int upperLimit = teclado.nextInt();
        Object[] numbers = {lowerLimit, upperLimit};
        String response = (String) client.execute("Methods.sum", numbers);
        System.out.println(response);
    }
}
