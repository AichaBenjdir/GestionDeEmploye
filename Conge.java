public class Conge {
    private String dateDebut;
    private String dateFin;
    private boolean etat; // true = validé, false = non validé

    public Conge(String dateDebut, String dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.etat = false;
    }

    public String getDateDebut() {
        return dateDebut;
    }
      public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }
   

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public boolean isValide() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }


    @Override
    public String toString() {
        return "Conge{" +
               "dateDebut='" + dateDebut + '\'' +
               ", dateFin='" + dateFin + '\'' +
               ", etat=" + (etat ? "Validé" : "Non validé") +
               '}';
    }

   
}
