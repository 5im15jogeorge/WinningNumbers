/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import ch.bbw.lotto.Gewinner;
import ch.bbw.lotto.LottoUtil;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author naomi
 */
public class TransferImpl extends UnicastRemoteObject implements Winner, Serializable{
    
    Session session = LottoUtil.getInstance().openSession();
    private List<Gewinner> winners = session.createQuery("FROM Gewinner").list();
    private ArrayList<String> gewinners;
    
    
    public TransferImpl() throws RemoteException{
        
        gewinners = new ArrayList<>();
        for (Gewinner g : winners) {
        gewinners.add("Gewinner: "  + g.getVorname() + " " + g.getName() + " " + "Gewinn: " + g.getGewinn() + " " + "Lotterie: " + g.getLotterie().getName());
            
        }
          
    }
    
    public void ausgabe() {
        System.out.println(gewinners);
    }
    
    @Override
    public ArrayList<String> getWinners() throws RemoteException {
        return gewinners;
    }

}
