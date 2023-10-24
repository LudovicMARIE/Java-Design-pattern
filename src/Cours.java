import java.util.Date;

public class Cours {
    private final int idCours;

    private Date dateDebut;
    private Date dateFin;
    private String nomCours;
    private Matiere matiereCours;

    public Cours(int id, Date debut, Date fin, String nom, Matiere matiere){
        this.idCours = id;
        this.dateDebut = debut;
        this.dateFin = fin;
        this.nomCours = nom;
        this.matiereCours = matiere;
    }
    public int getIdCours() {
        return idCours;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getNomCours() {
        return nomCours;
    }

    public Matiere getMatiereCours() {
        return matiereCours;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public void setMatiereCours(Matiere matiereCours) {
        this.matiereCours = matiereCours;
    }



}
