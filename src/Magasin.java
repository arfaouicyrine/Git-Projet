public class Magasin {

    private int identifiant;
    private String nom;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] prods = new Produit[CAPACITE];
    public int cmp = 0;
    public static int cmptotal = 0;

    public int cmp_em;

    public Magasin() {

    }

    public Magasin(int identifiant, String nom, String adresse) {

        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }





   


    @Override
    public String toString() {

        return "Magasin{" + "identifiant=" + identifiant + ", nom=" + nom + ", adresse=" + adresse +  '}';
    }

    public static Magasin comparerMagasin(Magasin m1, Magasin m2) {
        if (m1.cmp > m2.cmp) {
            return m1;
        }
        return m2;
    }


}
