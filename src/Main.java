import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Matiere, Integer> notesEleve1 = new Hashtable<Matiere, Integer>();
        Matiere mat1 = new Matiere(10, "Sciences");
        Matiere mat2 = new Matiere(11, "Anglais");
        Matiere mat3 = new Matiere(12, "Informatique");
        Salle salle1 = new Salle(1,"Salle1");
        Professeur prof1 = new Professeur(1, "nomProf1", "PrenomProf1");
        Cours cours1 = prof1.creerCours(1, "10:00", "11:00", "Anglais1",mat2,salle1);
        Classe classe1 = new Classe(1,"Classe 1");

        notesEleve1.put(mat1, 20);
        notesEleve1.put(mat2, 10);
        Eleve eleve1 = new Eleve(1,"Foucault","Didier", notesEleve1);
        Eleve eleve2 = new Eleve(2,"Wuf","Dawid");
        prof1.ajouterNote(eleve2,mat3,1);
        prof1.ajouterNote(eleve2,mat2,8);
        Eleve eleve3 = new Eleve(3,"Slay","Stanislas", notesEleve1);
        Eleve eleve4 = new Eleve(4,"Dupont","Pierre", notesEleve1);

        classe1.AjouterEleve(eleve1);
        classe1.AjouterEleve(eleve2);
        System.out.println("Liste élèves : "+classe1.getListeEleve());

        //System.out.print(eleve1.getNomPersonne());
        //System.out.print(eleve1.getPrenomPersonne());
        //System.out.print(eleve1.getIdPersonne());
        eleve1.getNotes();
        eleve2.getNotes();



        System.out.println(cours1);
    }
}