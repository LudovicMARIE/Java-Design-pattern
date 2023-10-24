import java.util.ArrayList;

public class Classe {


    private final int idClasse;
    private final String nomClasse;

    private ArrayList<Eleve> ListeEleve;

    public Classe(int id, String nom){
        this.idClasse = id;
        this.nomClasse = nom;
        this.ListeEleve = new ArrayList<Eleve>();
    }

    public int getIdClasse() {
        return idClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public ArrayList<Eleve> getListeEleve() {
        return ListeEleve;
    }

    public void setListeEleve(ArrayList<Eleve> listeEleve) {
        ListeEleve = listeEleve;
    }

    public void AjouterEleve(Eleve eleve){
        this.ListeEleve.add(eleve);
    }
}
