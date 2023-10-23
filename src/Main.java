public class Main {
    public static void main(String[] args) {
        Eleve eleve = new Eleve(1,"nom","prenom");
        System.out.print(eleve.getNomEleve());
        System.out.print(eleve.getPrenomEleve());
        System.out.print(eleve.getIdEleve());
    }
}