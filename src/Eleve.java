import java.util.Hashtable;

public class Eleve extends Personne{

    private Hashtable<Matiere, Integer> notes = new Hashtable<Matiere, Integer>();
    public Eleve(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Eleve(int id, String nom, String prenom, Hashtable<Matiere, Integer> notes) {
        super(id, nom, prenom);
        this.notes = notes;
    }

    public void getNotes(){
        System.out.println("Notes de "+getPrenomPersonne()+" "+getNomPersonne());
        this.notes.forEach((k,v)->{
            System.out.println("Matière : "+k+" | Note : "+v);
                }
                );

    }
}
