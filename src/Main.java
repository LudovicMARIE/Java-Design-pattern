public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne(1,"nom","prenom");
        System.out.print(personne.getNomPersonne());
        System.out.print(personne.getPrenomPersonne());
        System.out.print(personne.getIdPersonne());
    }
}