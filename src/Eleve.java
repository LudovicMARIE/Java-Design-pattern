import java.util.Hashtable;

public class Eleve extends Personne{

    private Hashtable<Matiere, Integer> notes;
    boolean isDP;

    public Eleve(int id, String nom, String prenom, boolean isDp) {
        super(id, nom, prenom);
        this.notes = new Hashtable<Matiere, Integer>();
        this.isDP = isDp;
    }

    public Eleve(int id, String nom, String prenom, Hashtable<Matiere, Integer> notes) {
        super(id, nom, prenom);
        this.notes = notes;
    }

    public void nouvelleNote(Matiere matiere, Integer note){
        this.notes.put(matiere,note);
    }

    public void getNotes(){
        System.out.println("Notes de "+getPrenomPersonne()+" "+getNomPersonne());
        this.notes.forEach((k,v)->{
            System.out.println("Matière : "+k+" | Note : "+v);
                }
                );

    }

    public String toString(){
        return getPrenomPersonne()+" "+getNomPersonne();
    }
}
