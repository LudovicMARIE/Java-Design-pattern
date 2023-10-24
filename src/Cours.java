import java.text.SimpleDateFormat;

public class Cours {
    private final int idCours;

    private String dateDebut;
    private String dateFin;
    private String nomCours;
    private Matiere matiereCours;
    private Salle salleCours;


    private Professeur professeurCours;

    public Cours(int id, String debut, String fin, String nom, Matiere matiere, Salle salle){
        this.idCours = id;
        this.dateDebut = debut;
        this.dateFin = fin;
        this.nomCours = nom;
        this.matiereCours = matiere;
        this.salleCours = salle;
    }

    public int getIdCours() {
        return idCours;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public String getNomCours() {
        return nomCours;
    }

    public Matiere getMatiereCours() {
        return matiereCours;
    }
    public Salle getSalleCours() {
        return salleCours;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public void setMatiereCours(Matiere matiereCours) {
        this.matiereCours = matiereCours;
    }
    public void setSalleCours(Salle salleCours) {
        this.salleCours = salleCours;
    }


    public String toString(){
        return "Cours n°"+idCours+"|"+nomCours+"|"+dateDebut+"|"+dateFin+"|"+matiereCours+"|"+salleCours.getNomSalle();
    }

    public Professeur getProfesseurCours() {
        return professeurCours;
    }

    public void setProfesseurCours(Professeur professeurCours) {
        this.professeurCours = professeurCours;
    }

}
