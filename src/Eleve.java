import java.util.Hashtable;

public class Eleve extends Personne{

    private Hashtable<Cours, Integer> notes = new Hashtable<String, Integer>();
    public Eleve(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Eleve(int id, String nom, String prenom, Hashtable<String, Integer> notes) {
        super(id, nom, prenom);
        this.notes = notes;
    }
}
