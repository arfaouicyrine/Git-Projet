public class Vendeur extends Employe {
    private float tauxDeVente;

    public Vendeur(float tauxDeVente, int id, String nom, String adresse, int nb_heure) {
        super(id, nom, adresse, nb_heure);
        this.tauxDeVente = tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "tauxDeVente=" + tauxDeVente +
                '}';
    }
    @Override
    public float calculerSalaire() {
        System.out.println("vendeur");
        return 450*tauxDeVente;
    }
}
