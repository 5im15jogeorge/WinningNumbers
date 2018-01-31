/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbw.lotto;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author naomi
 */
public class Main {

    Session session = LottoUtil.getInstance().openSession();
    List<Lotterie> lotterien = session.createQuery("FROM Lotterie").list();
    List<Gewinner> winners = session.createQuery("FROM Gewinner").list();

    public void LotterieAusgabe() {
        for (Lotterie l : lotterien) {

            System.out.println(l.getName());
        }
    }

    public void GewinnerAusgabe() {
        for (Gewinner g : winners) {
            System.out.println(g.getVorname() + " " + g.getName() + " " + g.getGewinn() + " " + g.getLotterie().getName());
        }        
    }

    public static void main(String[] args) {

        Main m = new Main();

        Session session = LottoUtil.getInstance().openSession();
        Transaction t = session.beginTransaction();

        Scanner scan = new Scanner(System.in);
        System.out.println("1.Lotterien und Gewinner hinzufügen");
        System.out.println("2.Lotterien ausgeben");
        System.out.println("3.Gewinner ausgeben");

        String wahl = scan.nextLine();

        if (wahl.equals("1")) {
            //Lotterien hinzufuegen
            Lotterie swisslotto = new Lotterie();
            Lotterie euromillions = new Lotterie();
            Lotterie eurojackpot = new Lotterie();

            //name und id der Lotterien setzen
            euromillions.setName("Euro Millions");
            euromillions.setIdLotterie(0);
            swisslotto.setName("Swiss Lotto");
            swisslotto.setIdLotterie(1);
            eurojackpot.setName("EuroJackpot");
            eurojackpot.setIdLotterie(2);
            //in die Datenbank speichern
            session.save(euromillions);
            session.save(swisslotto);
            session.save(eurojackpot);

            GewinnerId idone = new GewinnerId(0, 1);
            GewinnerId idtwo = new GewinnerId(1, 0);
            GewinnerId idthree = new GewinnerId(2, 2);
            GewinnerId idfour = new GewinnerId(3, 0);
            GewinnerId idfive = new GewinnerId(4, 1);
            GewinnerId idsix = new GewinnerId(5, 1);
            GewinnerId idseven = new GewinnerId(6, 1);
            GewinnerId ideight = new GewinnerId(7, 2);
            GewinnerId idnine = new GewinnerId(8, 0);
            GewinnerId idten = new GewinnerId(9, 2);
            GewinnerId ideleven = new GewinnerId(10, 1);
            GewinnerId idtwelve = new GewinnerId(11, 0);
            GewinnerId idthirteen = new GewinnerId(12, 2);
            GewinnerId idfourteen = new GewinnerId(13, 0);
            GewinnerId idfifteen = new GewinnerId(14, 2);
            GewinnerId idsixteen = new GewinnerId(15, 1);
            GewinnerId idseventeen = new GewinnerId(16, 1);

            Gewinner one = new Gewinner();
            Gewinner two = new Gewinner();
            Gewinner three = new Gewinner();
            Gewinner four = new Gewinner();
            Gewinner five = new Gewinner();
            Gewinner six = new Gewinner();
            Gewinner seven = new Gewinner();
            Gewinner eight = new Gewinner();
            Gewinner nine = new Gewinner();
            Gewinner ten = new Gewinner();
            Gewinner eleven = new Gewinner();
            Gewinner twelve = new Gewinner();
            Gewinner thirteen = new Gewinner();
            Gewinner fourteen = new Gewinner();
            Gewinner fifteen = new Gewinner();
            Gewinner sixteen = new Gewinner();
            Gewinner seventeen = new Gewinner();

            one.setName("Meier");
            one.setVorname("Harold");
            one.setGewinn(154000);
            one.setId(idone);
            one.setLotterie(swisslotto);
            two.setName("Gentner");
            two.setVorname("Nicolette");
            two.setGewinn(425000000);
            two.setId(idtwo);
            two.setLotterie(euromillions);
            three.setName("Gilroy");
            three.setVorname("Chieko");
            three.setGewinn(35000000);
            three.setId(idthree);
            three.setLotterie(eurojackpot);
            four.setName("Montesinos");
            four.setVorname("Erika");
            four.setGewinn(20000000);
            four.setId(idfour);
            four.setLotterie(euromillions);
            five.setName("Baden");
            five.setVorname("Jerome");
            five.setGewinn(150000);
            five.setId(idfive);
            five.setLotterie(swisslotto);
            six.setName("Burnley");
            six.setVorname("Tereasa");
            six.setGewinn(200000);
            six.setId(idsix);
            six.setLotterie(swisslotto);
            seven.setName("Phares");
            seven.setVorname("Eladia");
            seven.setGewinn(130000000);
            seven.setId(idseven);
            seven.setLotterie(swisslotto);
            eight.setName("Foulks");
            eight.setVorname("Dori");
            eight.setGewinn(156000);
            eight.setId(ideight);
            eight.setLotterie(eurojackpot);
            nine.setName("Morillo");
            nine.setVorname("Verline");
            nine.setGewinn(650000000);
            nine.setId(idnine);
            nine.setLotterie(euromillions);
            ten.setName("Concha");
            ten.setVorname("Byron");
            ten.setGewinn(430000000);
            ten.setId(idten);
            ten.setLotterie(eurojackpot);
            eleven.setName("Hippler");
            eleven.setVorname("Lea");
            eleven.setGewinn(243000);
            eleven.setId(ideleven);
            eleven.setLotterie(swisslotto);
            twelve.setName("Railsback");
            twelve.setVorname("Letisha");
            twelve.setGewinn(44000000);
            twelve.setId(idtwelve);
            twelve.setLotterie(euromillions);
            thirteen.setName("Jacquet");
            thirteen.setVorname("Joshua");
            thirteen.setGewinn(75000000);
            thirteen.setId(idthirteen);
            thirteen.setLotterie(eurojackpot);
            fourteen.setName("Crespo");
            fourteen.setVorname("Ethel");
            fourteen.setGewinn(144000000);
            fourteen.setId(idfourteen);
            fourteen.setLotterie(euromillions);
            fifteen.setName("Mancilla");
            fifteen.setVorname("Chelsea");
            fifteen.setGewinn(6450000);
            fifteen.setId(idfifteen);
            fifteen.setLotterie(eurojackpot);
            sixteen.setName("Jinkins");
            sixteen.setVorname("Stanley");
            sixteen.setGewinn(130000);
            sixteen.setId(idsixteen);
            sixteen.setLotterie(swisslotto);
            seventeen.setName("Kensinger");
            seventeen.setVorname("Rebecca");
            seventeen.setGewinn(4530000);
            seventeen.setId(idseventeen);
            seventeen.setLotterie(swisslotto);

            session.save(one);
            session.save(two);
            session.save(three);
            session.save(four);
            session.save(five);
            session.save(six);
            session.save(seven);
            session.save(eight);
            session.save(nine);
            session.save(ten);
            session.save(eleven);
            session.save(twelve);
            session.save(thirteen);
            session.save(fourteen);
            session.save(fifteen);
            session.save(sixteen);
            session.save(seventeen);

            t.commit();
            session.close();

        }

        if (wahl.equals("2")) {
            m.LotterieAusgabe();

        }

        if (wahl.equals("3")) {
            m.GewinnerAusgabe();
        }

    }
}
