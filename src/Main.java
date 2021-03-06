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
     Produit p5= new Produit (2000, "letuce", "khodhra", 2.5f);
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
        Date d4 = new Date(2010 - 2000, 0, 22);
        p4.setDate_expiration(d4);
        System.out.println(p4);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");

        Date d5 = sd.parse("2022/01/29");
        p5.setDate_expiration(d5);
         System.out.println(p5);

        Magasin m1 = new Magasin(1, "Carrefour", "Ariana");
       //  System.out.println(m1.toString());
        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);
        m1.ajouterProduit(p4);
        System.out.println(m1);
        Magasin m2 = new Magasin(2, "Monoprix", "Ariana");

        m2.ajouterProduit(p2);
        m2.ajouterProduit(p3);
        m2.ajouterProduit(p3);
      System.out.println(m2);

      Magasin.comparerMagasin(m1, m2);



        Caissier c1 = new Caissier(20, 1, "caissier1", "ariana", 45);
        Caissier c2 = new Caissier(23, 2, "caissier2", "ariana", 50);
        Caissier c3 = new Caissier(20, 1, "caissier1", "ariana", 45);

        Vendeur v1 = new Vendeur(3.5f, 1, "Vend1", "adresse", 29);
        Vendeur v2 = new Vendeur(3.6f, 2, "Vend2", "adresse", 34);
        m1.ajouterEmploye(c1);
        m1.ajouterEmploye(v1);

        Responsable r1 = new Responsable(200, 1, "resp1", "ariana", 35);
        Responsable r2 = new Responsable(250, 2, "resp2", "ariana", 30);
        m1.ajouterEmploye(r1);

        System.out.println(m1);

    }
    }
