/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author naomi
 */
public class RmiServer {
    
    public static void main(String[] args) throws MalformedURLException, RemoteException {

        try {

            LocateRegistry.createRegistry(1099);  // Use default Port 1099

            TransferImpl impl = new TransferImpl();

            String service = "TransferWinners";
            Naming.rebind("//localhost/" + service, impl);

        } catch (RemoteException e) {
            System.out.println("Could not start Registry"); // Kann auch bedeuten, dass die Registry schon läuft

        }
    }

}
