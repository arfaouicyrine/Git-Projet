public class Responsable extends Employe{
    private int prime;

    public Responsable() {
    }

    public Responsable(int prime, int id, String nom, String adresse, int nb_heure) {
        super(id, nom, adresse, nb_heure);
        this.prime = prime;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString()+"Responsable{" + "prime=" + prime + '}';
    }

    @Override
    public float calculerSalaire() {
        System.out.println("resp");
        if(nb_heure>160)
            return (nb_heure-160)*12+16*10+prime;
        return nb_heure*10+prime;
    }




}
