public class Magasin {

    private int identifiant;
    private String nom;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] prods = new Produit[CAPACITE];
    public int cmp = 0;
    public static int cmptotal = 0;
    public Employe[] emps = new Employe[20];
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

    public void ajouterEmploye(Employe e){
        if(cmp_em<20){
            emps[cmp_em]=e;
            cmp_em++;
        }
    }
    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < cmp; i++) // if(prods[i].comparer(p))
        {
            if (Produit.comparer(prods[i], p)) {
                return true;
            }
        }
        return false;
    }

    public void ajouterProduit(Produit p) {
        if (cmp < CAPACITE && !chercherProduit(p)) {
            prods[cmp] = p;
            cmp++;
            cmptotal++;
        }
      else
           System.out.println("Magasin Plein");
    }


    public int indexOfProduit(Produit p) {
        for (int i = 0; i < cmp; i++) {
            if (prods[i].comparer(p)) {
                return i;
            }
        }
        return -1;
    }

    public void supprimerProduit(Produit p) {
        int pos = indexOfProduit(p);
        if (pos != -1) {
          for(int i=pos;i<cmp-1;i++){
               prods[i]=prods[i+1];
           }
            prods[pos] = prods[cmp - 1];
            cmp--;
        }
    }


@Override
    public String toString() {
        String s = "";
        for (int i = 0; i < cmp; i++) {
            s += prods[i].getLibelle() + " " + prods[i].getPrix();
        }
        for(int i=0;i<cmp_em;i++)
            s+=emps[i].toString();
        return "Magasin{" + "identifiant=" + identifiant + ", nom=" + nom + ", adresse=" + adresse + "et les produits sont : " + s + '}';
    }
    public static Magasin comparerMagasin(Magasin m1, Magasin m2) {
        if (m1.cmp > m2.cmp) {
            return m1;
        }
        return m2;
    }


}
