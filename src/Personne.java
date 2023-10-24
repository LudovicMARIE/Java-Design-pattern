public class Personne {

    private final int idPersonne;
    private String nomPersonne;
    private String prenomPersonne;

    public Personne(int id, String nom, String prenom){
        this.idPersonne = id;
        this.nomPersonne = nom;
        this.prenomPersonne = prenom;
    }
    public int getIdPersonne() {
        return idPersonne;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }


}
