import java.util.Date;

public class Professeur extends Personne{
    public Professeur(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Cours creerCours(int id, String heureDebut, String heureFin, String nom, Matiere matiere, Salle salle){
        Cours cours = new Cours(id, heureDebut, heureFin, nom, matiere, salle);
        cours.setProfesseurCours(this);
        return cours;
    }

    public void ajouterNote(Eleve eleve, Matiere matiere, Integer note){
        eleve.nouvelleNote(matiere, note);
    }

    public String toString(){
        return getPrenomPersonne()+" "+getNomPersonne();
    }


}
