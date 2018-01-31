/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.lotto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author naomi
 */
public class LottoUtil {
    
      private SessionFactory factory;
    private static LottoUtil instance;
    
    private LottoUtil(){
    
    }
    
    public static LottoUtil getInstance() {
        if(LottoUtil.instance == null) {
           LottoUtil.instance = new LottoUtil();
        }
        return instance;
    }

    public Session openSession() {
        
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder ssrb = 
        new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        factory = configuration.buildSessionFactory(ssrb.build());
        return factory.openSession();
    }

    public void cleanUp() {
        factory.close();
    }
}

    
