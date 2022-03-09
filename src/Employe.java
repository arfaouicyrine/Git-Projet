public abstract class  Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nb_heure;


    public Employe() {

    }
    public abstract float calculerSalaire();

    public Employe(int id, String nom, String adresse, int nb_heure) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heure = nb_heure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNb_heure() {
        return nb_heure;
    }

    public void setNb_heure(int nb_heure) {
        this.nb_heure = nb_heure;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nb_heure=" + nb_heure + '}';
    }



    public void test(){
        System.out.println("emp");
    }


    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        Employe other=(Employe)obj;
        return this.id==other.id;
    }


}
