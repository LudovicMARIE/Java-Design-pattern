public record Salle(int idSalle, String nomSalle) {
    public String getNomSalle(){
        return this.nomSalle;
    }
    public int getIdSalle(){
        return this.idSalle;
    }
    public String toString(){
        return this.nomSalle;
    }
}
