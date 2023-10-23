public class Eleve {

    private final int idEleve;
    private String nomEleve;
    private String prenomEleve;

    public Eleve(int id, String nom, String prenom){
        this.idEleve = id;
        this.nomEleve = nom;
        this.prenomEleve = prenom;
    }
    public int getIdEleve() {
        return idEleve;
    }

    public String getNomEleve() {
        return nomEleve;
    }

    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }

    public String getPrenomEleve() {
        return prenomEleve;
    }

    public void setPrenomEleve(String prenomEleve) {
        this.prenomEleve = prenomEleve;
    }


}
