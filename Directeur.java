public class Directeur extends Personne implements IPoseurDeConge, IValidateurDeConge {
    private int nbrEmploye;

    public Directeur(String nom, String prenom, int nbrEmploye) {
        super(nom, prenom);
        this.nbrEmploye = nbrEmploye;
    }
    
    public int getNbrEmploye() {
        return nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    @Override
    public void poserConge(String dateDebut, String dateFin) {
        Conge conge = new Conge(dateDebut, dateFin);
        poserConge(conge);
    }

    @Override
    public void poserConge(Conge conge) {
        conge.setEtat(true); // congé validé automatiquement
        listeConges.add(conge);
        System.out.println("Directeur " + nom + " a posé un congé automatiquement validé : " + conge);
    }

    @Override
    public void validerConge(Conge conge, Employe employe) {
        conge.setEtat(true);
        System.out.println("Le directeur " + nom + " a validé le congé de " + employe.getNom() + ": " + conge);
    }

}
