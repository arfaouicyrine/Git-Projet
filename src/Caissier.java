public class Caissier extends Employe{
    private int num_caisse;

    public Caissier() {
        super();
        System.out.println("Caissier");

    }

    public Caissier(int num_caisse) {
        // super();
        this.num_caisse = num_caisse;
    }

    public Caissier(int num_caisse, int id, String nom, String adresse, int nb_heure) {
        super(id, nom, adresse, nb_heure);
        // this.id=id;
        this.num_caisse = num_caisse;
    }

    public int getNum_caisse() {
        return num_caisse;
    }

    public void setNum_caisse(int num_caisse) {
        this.num_caisse = num_caisse;
    }

    @Override
    public String toString() {
        return super.toString()+"Caissier{" + "num_caisse=" + num_caisse + '}';
    }

    @Override
    public float calculerSalaire() {
        System.out.println("Caissier");
        if(nb_heure>180)
            return (180*5)+(nb_heure-180)*5.75f;

        return nb_heure*5;
    }


    public void test2(){
        System.out.println("test 2");
    }
}
