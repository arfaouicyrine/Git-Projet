import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Main {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Produit p1 = new Produit();
        System.out.println(p1.getPrix());

        Produit p2 = new Produit(1021, "lait", "delice");
        Produit p3 = new Produit(2051, "yaourt", "vitalait");

        p2.setPrix(0.7f);
        Produit p4 = new Produit(3250, "tomates", "Sicam", 1.2f);

         p1.afficher();
         p2.afficher();
        p3.afficher();
        p4.afficher();
        System.out.println(p3.toString());
        Date d2 = new Date();
        p2.setDate_expiration(d2);
          System.out.println(p2);
        Date d3 = new Date(2022 - 1900, 0, 22);
        p3.setDate_expiration(d3);
        System.out.println(p3);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");

        Date d4 = sd.parse("2022/01/29");
        p4.setDate_expiration(d4);
         System.out.println(p4);


    }
    }
