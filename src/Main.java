import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Matiere, Integer> notesEleve1 = new Hashtable<Matiere, Integer>();
        Matiere mat1 = new Matiere(10, "Sciences");
        Matiere mat2 = new Matiere(11, "Anglais");
        Matiere mat3 = new Matiere(12, "Matière3");

        notesEleve1.put(mat1, 20);
        notesEleve1.put(mat2, 10);
        Eleve eleve1 = new Eleve(1,"nom","prenom", notesEleve1);
        System.out.print(eleve1.getNomPersonne());
        System.out.print(eleve1.getPrenomPersonne());
        System.out.print(eleve1.getIdPersonne());
        eleve1.getNotes();
    }
}